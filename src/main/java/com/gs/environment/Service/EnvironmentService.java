package com.gs.environment.Service;

import com.gs.environment.Entity.*;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
@org.springframework.stereotype.Service
public class EnvironmentService {
    public Service getServicesForDev(){
        List<Link>links=new ArrayList<>();
        List<Nimbus> nimbuses=new ArrayList<>();
        List<Database> databases=new ArrayList<>();
        List<Dependency> dependencies=new ArrayList<>();
        links.add(new Link("Zeebe Operate"));
        links.add(new Link("Secure push"));
        nimbuses.add(new Nimbus("dev.api.cashmovement.nimbus.gs.com:8443"));
        nimbuses.add(new Nimbus("dev.api.outgoing-services.nimbus.gs.com:8443"));
        databases.add(new Database("Cash Movement","NYTMRMQ1","CASH_MOVEMENT"));
        databases.add(new Database("Validation","NYTMRMQ1","VALIDATION"));
        dependencies.add(new Dependency("secure push-service","1.2.5","conduitlib","zip","compile"));
        dependencies.add(new Dependency("cash movement","1.3.0","dist","zip","runtime"));
        Service serviceForDev=new Service("Dev",links,nimbuses,databases,dependencies);
        return serviceForDev;
    }
    public Service getServicesForQA(){
        List<Link>links=new ArrayList<>();
        List<Nimbus> nimbuses=new ArrayList<>();
        List<Database> databases=new ArrayList<>();
        List<Dependency> dependencies=new ArrayList<>();
        links.add(new Link("App-Dir"));
        links.add(new Link("Canvas"));
        nimbuses.add(new Nimbus("dev.api.Appdir.nimbus.gs.com:8443"));
        nimbuses.add(new Nimbus("dev.api.Canvas.nimbus.gs.com:8443"));
        databases.add(new Database("Gates Bridge","NYTMRMQ1","GATES_BRIDGE_OUTGOING"));
        databases.add(new Database("Scheduling service","NYTMRMQ1","SCHEDULING"));
        dependencies.add(new Dependency("gates bridge","1.2.5","conduitlib","zip","compile"));
        dependencies.add(new Dependency("scheduling service","1.3.0","dist","zip","runtime"));
        Service serviceForQA=new Service("QA",links,nimbuses,databases,dependencies);
        return serviceForQA;
    }
    public Service getServicesForDevAndQA(){
        WebClient webClient = WebClient.builder()
                .baseUrl("http://localhost:8080")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();

        Service serviceForDev=webClient.get()
                .uri("/servicesForDev")
                .retrieve()
                .bodyToMono(Service.class).block();
        //System.out.println(serviceForDev);
        //Service serviceForDev=new Service(serviceForDevMono.block());
        Service serviceForQA=webClient.get()
                .uri("/servicesForQA")
                .retrieve()
                .bodyToMono(Service.class).block();
        //System.out.println(serviceForQA);
        Service service=new Service(serviceForDev,serviceForQA);
        return service;
    }
}

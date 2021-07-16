package com.gs.environment.Entity;


import java.util.List;


public class Service {

    String environment;
    List<Link> links;
    List<Nimbus> nimbuses;
    List<Database> databases;
    List<Dependency> dependencies;

    public Service(String environment, List<Link> links, List<Nimbus> nimbuses, List<Database> databases, List<Dependency> dependencies) {
        this.environment = environment;
        this.links = links;
        this.nimbuses = nimbuses;
        this.databases = databases;
        this.dependencies = dependencies;
    }

    public Service() {
    }

    public Service(Service serviceForDev, Service serviceForQA) {
        this.environment="DevAndQA";
        this.links =(serviceForDev.links);
        this.links.addAll(serviceForQA.links);
        this.nimbuses =(serviceForDev.nimbuses);
        this.nimbuses.addAll(serviceForQA.nimbuses);
        this.dependencies =(serviceForDev.dependencies);
        this.dependencies.addAll(serviceForQA.dependencies);
        this.databases =(serviceForDev.databases);
        this.databases.addAll(serviceForQA.databases);
    }

    public Service(Service service) {
        this.links =service.links;
        this.nimbuses =service.nimbuses;
        this.environment=service.environment;
        this.databases =service.databases;
        this.dependencies =service.dependencies;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public List<Nimbus> getNimbuses() {
        return nimbuses;
    }

    public void setNimbuses(List<Nimbus> nimbuses) {
        this.nimbuses = nimbuses;
    }

    public List<Database> getDatabases() {
        return databases;
    }

    public void setDatabases(List<Database> databases) {
        this.databases = databases;
    }

    public List<Dependency> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<Dependency> dependencies) {
        this.dependencies = dependencies;
    }

    @Override
    public String toString() {
        return "Services{" +
                "id=" + environment +
                ", linkList=" + links +
                ", nimbusList=" + nimbuses +
                ", databaseList=" + databases +
                ", dependecyList=" + dependencies +
                '}';
    }

    public void setAll(Service service) {
        this.links =service.links;
        this.nimbuses =service.nimbuses;
        this.environment=service.environment;
        this.databases =service.databases;
        this.dependencies =service.dependencies;
    }
}

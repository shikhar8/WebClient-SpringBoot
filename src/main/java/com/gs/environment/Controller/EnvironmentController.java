package com.gs.environment.Controller;

import com.gs.environment.Entity.Service;
import com.gs.environment.Service.EnvironmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvironmentController {
    @Autowired
    EnvironmentService environmentService;
    @RequestMapping(value = "/servicesForDev",method = RequestMethod.GET)
    public Service getServicesForDev()
    {
        return environmentService.getServicesForDev();
    }
    @RequestMapping(value = "/servicesForQA",method = RequestMethod.GET)
    public Service getServicesForQA()
    {
        return environmentService.getServicesForQA();
    }
    @RequestMapping(value = "/servicesForDevAndQA",method = RequestMethod.GET)
    public Service getServicesForDevAndQA()
    {
        return environmentService.getServicesForDevAndQA();
    }

}

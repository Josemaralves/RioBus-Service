package com.josemar.controller;

import com.josemar.model.Routes;
import com.josemar.service.RoutesService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Path("/routes")
public class RoutesController {

    @Inject
    RoutesService routesService;

    @GET
    public List<Routes> getLines(){
        return routesService.getAll();
    }

}

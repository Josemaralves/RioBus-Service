package com.josemar.controller;

import com.josemar.model.Stop;
import com.josemar.service.StopService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Path("/stops")
public class StopsController {

    @Inject
    StopService service;

    @GET
    public List<Stop> getAll(){
        return service.get();
    }

}

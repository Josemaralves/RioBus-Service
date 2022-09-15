package com.josemar.controller;

import com.josemar.model.Lines;
import com.josemar.service.LinesService;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Path("/lines")
public class LinesController {

    @Inject
    LinesService service;

    @GET
    @Path("/{lineId}")
    public List<Lines> getLineById(@PathParam String lineId){
        return service.getLineById(lineId);
    }

}

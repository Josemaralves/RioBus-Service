package com.josemar.controller;

import com.josemar.model.Line;
import com.josemar.service.RoutesService;
import org.jboss.resteasy.annotations.jaxrs.PathParam;
import org.jboss.resteasy.annotations.jaxrs.QueryParam;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Path("/lines")
public class LinesController {

    @Inject
    RoutesService routesService;

    @GET
    public List<Line> getLines(){
        return routesService.getAll();
    }

    @GET
    public Line getLine(@QueryParam("routeId") String routeId, @QueryParam("lineId") String lineId){
        return routesService.getById(routeId, lineId);
    }

}

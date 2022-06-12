package com.josemar.controller;

import com.josemar.model.Lines;
import com.josemar.service.LinesService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Path("/lines")
public class LinesController {

    @Inject
    LinesService linesService;

    @GET
    public List<Lines> getLines(){
        return linesService.getAll();
    }

}

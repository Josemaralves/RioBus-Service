package com.josemar.controller;

import com.josemar.model.Track;
import com.josemar.service.TrackingService;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Path("/track")
public class TrackingController {

    @Inject TrackingService trackingService;

    @GET
    @Path("/{lineId}")
    public List<Track> getTrackLocation(@PathParam String lineId){
        return trackingService.retreiveTrackLocation(lineId);
    }

}

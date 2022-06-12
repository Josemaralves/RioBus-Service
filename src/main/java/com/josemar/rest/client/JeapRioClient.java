package com.josemar.rest.client;

import com.josemar.model.BusLocation;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@RegisterRestClient(configKey="jeap-rio-api")
@Path("/v2")
public interface JeapRioClient {

    @GET
    @Path("/transporte/veiculos/onibus2/{lineId}")
    List<BusLocation> getBusLocations(@PathParam String lineId);

}

package com.josemar.service;

import com.josemar.model.BusLocation;
import com.josemar.rest.client.JeapRioClient;
import com.josemar.utils.LocationUtils;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class TrackingService {

    private static final int MINUS_MINUTES = 15;
    @RestClient JeapRioClient client;

    public List<BusLocation> retreiveTrackLocation(String lineId){
        List<BusLocation> locations = client.getBusLocations(lineId);
        locations = LocationUtils.removeOutdatedLocations(locations, MINUS_MINUTES);

        return locations;
    }

}

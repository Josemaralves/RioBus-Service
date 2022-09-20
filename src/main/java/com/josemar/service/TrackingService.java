package com.josemar.service;

import com.josemar.model.Track;
import com.josemar.rest.client.JeapRioClient;
import com.josemar.utils.LocationUtils;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class TrackingService {

    private static final int MINUS_MINUTES = 10;
    @RestClient JeapRioClient client;

    public List<Track> retreiveTrackLocation(String lineId){
        List<Track> locations = client.getBusLocations(lineId);
//        locations = LocationUtils.removeOutdatedLocations(locations, MINUS_MINUTES);

        return locations;
    }

}

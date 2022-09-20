package com.josemar.utils;

import com.josemar.model.Track;

import java.time.Clock;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class LocationUtils {

    public static List<Track> removeOutdatedLocations(List<Track> locations, int minusMinutes) {
        locations = dedupLocations(locations);

        var localDateTimeNowMinus = LocalDateTime.now(Clock.systemUTC()).minusMinutes(minusMinutes);
        return locations.stream().filter(location -> location.getDataHora().isAfter(localDateTimeNowMinus)).toList();
    }

    private static List<Track> dedupLocations(List<Track> locations) {
        Set<String> locationSet = new HashSet<>();
        locations = locations.stream().filter(lo -> locationSet.add(lo.getOrdem())).collect(Collectors.toList());
        return locations;
    }

}

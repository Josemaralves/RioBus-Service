package com.josemar.utils;

import com.josemar.model.Track;

import java.time.Clock;
import java.time.LocalDateTime;
import java.util.List;

public abstract class LocationUtils {

    public static List<Track> removeOutdatedLocations(List<Track> locations, int minusMinutes) {
        var localDateTimeNowMinus = LocalDateTime.now(Clock.systemUTC()).minusMinutes(minusMinutes);

        return locations.stream().filter(location -> location.getDataHora().isAfter(localDateTimeNowMinus)).toList();
    }

}

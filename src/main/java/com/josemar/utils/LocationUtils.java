package com.josemar.utils;

import com.josemar.model.BusLocation;

import java.time.Clock;
import java.time.LocalDateTime;
import java.util.List;

public abstract class LocationUtils {

    public static List<BusLocation> removeOutdatedLocations(List<BusLocation> locations, int minusMinutes) {
        var localDateTimeNowMinus = LocalDateTime.now(Clock.systemUTC()).minusMinutes(minusMinutes);

        return locations.stream().filter(location -> location.getDataHora().isAfter(localDateTimeNowMinus)).toList();
    }

}

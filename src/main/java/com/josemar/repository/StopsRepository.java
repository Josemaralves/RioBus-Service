package com.josemar.repository;

import com.josemar.model.Stop;
import com.mongodb.client.MongoCollection;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class StopsRepository {

    @Inject
    MongoCollection<Stop> collection;

    public List<Stop> get() {
        var listStop = new ArrayList<Stop>();

        for (Stop stop : collection.find()) {
            listStop.add(stop);
        }

        return listStop;
    }

}

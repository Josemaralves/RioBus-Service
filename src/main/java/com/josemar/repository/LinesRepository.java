package com.josemar.repository;

import com.josemar.model.Line;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Projections;
import org.bson.conversions.Bson;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class LinesRepository {

    private static final Bson EXCLUDE_FIELDS = Projections.exclude("itineraries", "stops");

    @Inject MongoCollection<Line> collectionLines;

    public List<Line> get() {
        var listLines = new ArrayList<Line>();

        for (Line line : collectionLines.find().projection(EXCLUDE_FIELDS)) {
            listLines.add(line);
        }

        return listLines;
    }

    public List<Line> getById(String id) {
        var listLines = new ArrayList<Line>();

        for (Line line : collectionLines.find(Filters.eq("idRoute", id))) {
            listLines.add(line);
        }

        return listLines;
    }
}

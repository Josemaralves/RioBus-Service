package com.josemar.repository;

import com.josemar.model.Line;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Projections;
import org.bson.conversions.Bson;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@ApplicationScoped
public class LinesRepository {

    private static final String ID_ROUTE = "idRoute";
    private static final Bson EXCLUDE_FIELDS = Projections.exclude("itineraries", "stops");
    private static final Bson LOOKUP_STOP = Aggregates.lookup("stops", "stops", "stopId","stops");

    @Inject MongoCollection<Line> collectionLines;

    public List<Line> get() {
        var listLines = new ArrayList<Line>();

        for (Line line : collectionLines.find().projection(EXCLUDE_FIELDS)) {
            listLines.add(line);
        }

        return listLines;
    }

    public List<Line> getById(String idRoute, String lineId) {
        Bson matchId;
        if (idRoute!=null){
            matchId = Aggregates.match(Filters.eq(ID_ROUTE, idRoute));
        }else{
            matchId = Aggregates.match(Filters.eq("shortName", lineId));
        }
        return Collections.singletonList(collectionLines.aggregate(List.of(matchId, LOOKUP_STOP)).first());

    }
}

package com.josemar.repository;

import com.josemar.model.Lines;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Sorts;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class LinesRepository {

    private static final String ROUTE_ID = "routeId";
    private static final String SEQUENCE = "sequence";

    @Inject
    MongoCollection<Lines> collectionLines;

    public List<Lines> getById(String id) {
        var query = Filters.eq(ROUTE_ID, id);
        var cursor = collectionLines.find(query).sort(Sorts.ascending(SEQUENCE)).iterator();
        var listLines = new ArrayList<Lines>();

        while (cursor.hasNext()){
            listLines.add(cursor.next());
        }

        return listLines;
    }

}

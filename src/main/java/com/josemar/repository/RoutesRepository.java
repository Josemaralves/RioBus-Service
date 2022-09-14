package com.josemar.repository;

import com.josemar.model.Routes;
import com.mongodb.client.MongoCollection;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class RoutesRepository {

    @Inject MongoCollection<Routes> collectionLines;

    public List<Routes> get() {
        var cursor = collectionLines.find().iterator();
        var listLines = new ArrayList<Routes>();

        while (cursor.hasNext()){
            listLines.add(cursor.next());
        }

        return listLines;
    }
}

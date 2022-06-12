package com.josemar.repository;

import com.josemar.model.Lines;
import com.mongodb.client.MongoCollection;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class LinesRepository {

    @Inject MongoCollection<Lines> collectionLines;

    public List<Lines> get() {
        var cursor = collectionLines.find().iterator();
        var listLines = new ArrayList<Lines>();

        while (cursor.hasNext()){
            listLines.add(cursor.next());
        }

        return listLines;
    }
}

package com.josemar.configuration;

import com.josemar.model.Line;
import com.josemar.model.Stop;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Singleton;

@Dependent
public class MongoConfiguration {

    private static final String DATABASE = "rio_bus";
    private static final String LINES = "lines";
    private static final String STOPS = "stops";

    @Inject MongoClient mongoClient;

    @Singleton
    public MongoCollection<Line> getLinesCollection(){
        return mongoClient.getDatabase(DATABASE).getCollection(LINES, Line.class);
    }

    @Singleton
    public MongoCollection<Stop> getStopsCollection(){
        return mongoClient.getDatabase(DATABASE).getCollection(STOPS, Stop.class);
    }

}

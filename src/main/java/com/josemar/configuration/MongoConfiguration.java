package com.josemar.configuration;

import com.josemar.model.Lines;
import com.josemar.model.Routes;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Singleton;

@Dependent
public class MongoConfiguration {

    private static final String DATABASE = "rio_bus";
    private static final String ROUTES = "routes";
    private static final String LINES = "shapes";
    @Inject MongoClient mongoClient;

    @Singleton
    public MongoCollection<Routes> getRoutesCollection(){
        return mongoClient.getDatabase(DATABASE).getCollection(ROUTES, Routes.class);
    }

    @Singleton
    public MongoCollection<Lines> getLinesCollection(){
        return mongoClient.getDatabase(DATABASE).getCollection(LINES, Lines.class);
    }

}

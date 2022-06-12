package com.josemar.configuration;

import com.josemar.model.Lines;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Singleton;

@Dependent
public class MongoConfiguration {

    private static final String DATABASE = "rioBus";
    private static final String LINES = "lines";
    @Inject MongoClient mongoClient;

    @Singleton
    public MongoCollection<Lines> getLinesCollection(){
        return mongoClient.getDatabase(DATABASE).getCollection(LINES, Lines.class);
    }

}

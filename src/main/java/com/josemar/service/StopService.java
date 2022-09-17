package com.josemar.service;

import com.josemar.model.Stop;
import com.josemar.repository.StopsRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class StopService {

    @Inject
    StopsRepository repository;

    public List<Stop> get(){
        return repository.get();
    }

}

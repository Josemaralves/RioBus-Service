package com.josemar.service;

import com.josemar.model.Routes;
import com.josemar.repository.RoutesRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class RoutesService {

    @Inject
    RoutesRepository repository;

    public List<Routes> getAll() {
        return repository.get();
    }
}

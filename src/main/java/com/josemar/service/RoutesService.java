package com.josemar.service;

import com.josemar.model.Line;
import com.josemar.repository.LinesRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class RoutesService {

    @Inject
    LinesRepository repository;

    public List<Line> getAll() {
        return repository.get();
    }

    public List<Line> getById(String id) {
        return repository.getById(id);
    }
}

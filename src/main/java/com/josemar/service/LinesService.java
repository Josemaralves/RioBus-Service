package com.josemar.service;

import com.josemar.model.Lines;
import com.josemar.repository.LinesRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class LinesService {

    @Inject LinesRepository repository;

    public List<Lines> getAll() {
        return repository.get();
    }
}

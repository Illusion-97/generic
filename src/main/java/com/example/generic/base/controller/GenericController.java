package com.example.generic.base.controller;

import com.example.generic.base.GenericId;
import com.example.generic.base.services.GenericService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.Optional;

public abstract class GenericController<
        I,
        D extends GenericId<I>,
        S extends GenericService<D,I>
        > {
    protected S service;

    public Page<D> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }
    public Optional<D> findById(I id) {
        return service.findById(id);
    }
    public D saveOrUpdate(D entity) {
        return service.saveOrUpdate(entity);
    }
    public void deleteById(I id) {
        service.deleteById(id);
    }
    public Optional<D> partialUpdate(D dto) {
        return service.partialUpdate(dto);
    }
}

package com.example.generic.base.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface GenericService<D, I> {

    Page<D> findAll(Pageable pageable); // gestion de pagination
    Optional<D> findById(I id);
    D saveOrUpdate(D entity);
    void deleteById(I id);
    Optional<D> partialUpdate(D dto);
}

package com.example.generic.base.services;

import com.example.generic.base.GenericId;
import com.example.generic.base.mapper.GenericMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public class GenericServiceImpl<
        I,
        D extends GenericId<I>,
        E extends GenericId<I>,
        R extends JpaRepository<E,I>,
        M extends GenericMapper<D,E>
        > implements GenericService<D,I>{
    protected R repository;
    protected M mapper;

    @Override
    public Page<D> findAll(Pageable pageable) {
        return repository.findAll(pageable).map(mapper::toDto);
    }

    @Override
    public Optional<D> findById(I id) {
        return repository.findById(id).map(mapper::toDto);
    }

    @Override
    public D saveOrUpdate(D dto) {
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    @Override
    public void deleteById(I id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<D> partialUpdate(D dto) {
        return repository.findById(dto.getId())
                .map(e -> mapper.toDto(repository.save(mapper.partialUpdate(dto, e))));
    }
}

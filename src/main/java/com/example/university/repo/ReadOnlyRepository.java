package com.example.university.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;

/**
 * Interface for declaring Read-Only Query Repositories.
 *

 */
@NoRepositoryBean
public interface ReadOnlyRepository<T, ID extends Serializable> extends Repository<T,ID > {

    T findOne(ID id);

    boolean exists(ID id);

    Iterable<T> findAll();

    Iterable<T> findAll(Sort sort);

    Iterable<T> findAll(Iterable<ID> iterable);

    Page<T> findAll(Pageable pageable);

    long count();
}
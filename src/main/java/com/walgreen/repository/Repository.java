package com.walgreen.repository;

import java.util.List;

/**
 * Created by NNT0327 on 6/21/2016.
 */

public interface Repository<T> {
    List<T> Entities();

    T New();

    void Add(T entity);

    void Create(T entity);

    void Delete(T entity);

    void Save();

}
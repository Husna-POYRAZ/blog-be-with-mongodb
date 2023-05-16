package com.hpoyraz.domain.repository.base;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository<T, I extends Serializable> extends MongoRepository<T, I>, QueryByExampleExecutor<T> {
}

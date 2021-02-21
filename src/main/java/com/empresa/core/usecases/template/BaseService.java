package com.empresa.core.usecases.template;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.empresa.infra.repositories.entity.BaseEntity;

@Service
public interface BaseService<T extends BaseEntity, ID extends Serializable> {

	T save(T entity);

	List<T> findAll();

	Optional<T> findById(ID entityId);

	T update(T entity);

	T updateById(T entity, ID entityId);

	void delete(T entity);

	void deleteById(ID entityId);

	Page<T> findByPage(Pageable pageable);

}

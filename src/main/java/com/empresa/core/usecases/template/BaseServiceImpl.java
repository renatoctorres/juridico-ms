package com.empresa.core.usecases.template;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.empresa.infra.repositories.BaseRepository;
import com.empresa.infra.repositories.entity.BaseEntity;

@Service
@Transactional
public abstract class BaseServiceImpl<T extends BaseEntity, ID extends Serializable> implements BaseService<T, ID> {
	
	   	private BaseRepository<T, ID> baseRepository;
	    
	
		@Override
	    public T save(T entity) {
	        return (T) this.baseRepository.save(entity);
	    }

		@Override
	    public List<T> findAll() {
	        return this.baseRepository.findAll();
	    }

		@Override
	    public Optional<T> findById(ID entityId) {
	        return this.baseRepository.findById(entityId);
	    }

		@Override
	    public T update(T entity) {
	        return (T) this.baseRepository.save(entity);
	    }

		@Override
	    public T updateById(T entity, ID entityId) {
	        Optional<T> optional = this.baseRepository.findById(entityId);
	        if(optional.isPresent()){
	            return (T) this.baseRepository.save(entity);
	        }else{
	            return null;
	        }
	    }

		@Override
	    public void delete(T entity) {
			this.baseRepository.delete(entity);
	    }

		@Override
	    public void deleteById(ID entityId) {
			this.baseRepository.deleteById(entityId);
	    }
		
		@Override
		public Page<T> findByPage(Pageable pageable) {
			Page<T> page = this.baseRepository.findAll(pageable);
			return page;
		}
		
		@Autowired
		public BaseServiceImpl(BaseRepository<T, ID> baseRepository) {
			super();
			this.baseRepository = baseRepository;
		}

}

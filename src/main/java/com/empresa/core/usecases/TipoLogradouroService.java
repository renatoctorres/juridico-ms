package com.empresa.core.usecases;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.empresa.core.model.TipoLogradouroDTO;

@Service
public interface TipoLogradouroService {
	
	public Optional<TipoLogradouroDTO> findById(Long id);
	
	public List<TipoLogradouroDTO> findAll();
	
	public Page<TipoLogradouroDTO> findByPage(Pageable pageable);
	
	public TipoLogradouroDTO save(TipoLogradouroDTO tipoLogradouro);
	
	public void delete(TipoLogradouroDTO tipoLogradouro);
}

package com.empresa.core.usecases;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.empresa.core.model.TipoEnderecoDTO;

@Service
public interface TipoEnderecoService {
	
	public Optional<TipoEnderecoDTO> findById(Long id);
	
	public List<TipoEnderecoDTO> findAll();
	
	public Page<TipoEnderecoDTO> findByPage(Pageable pageable);
	
	public TipoEnderecoDTO save(TipoEnderecoDTO tipoEnderecoDTO);
	
	public void delete(TipoEnderecoDTO tipoEnderecoDTO);
}

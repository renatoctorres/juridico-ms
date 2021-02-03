package com.empresa.core.usecases.cliente;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.empresa.core.model.TipoPessoaDTO;

@Service
public interface TipoPessoaService {
	
	public Optional<TipoPessoaDTO> findById(Long id);
	
	public List<TipoPessoaDTO> findAll();
	
	public Page<TipoPessoaDTO> findByPage(Pageable pageable);
	
	public TipoPessoaDTO save(TipoPessoaDTO tipoPessoaDTO);
	
	public void delete(TipoPessoaDTO tipoPessoaDTO);
}

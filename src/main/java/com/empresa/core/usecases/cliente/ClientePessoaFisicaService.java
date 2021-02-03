package com.empresa.core.usecases.cliente;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.empresa.core.model.cliente.ClientePessoaFisicaDTO;

@Service
public interface ClientePessoaFisicaService {
	
	public Optional<ClientePessoaFisicaDTO> findById(Long id);
	
	public List<ClientePessoaFisicaDTO> findAll();
	
	public Page<ClientePessoaFisicaDTO> findByPage(Pageable pageable);
	
	public ClientePessoaFisicaDTO save(ClientePessoaFisicaDTO clientePessoaFisicaDTO);
	
	public void delete(ClientePessoaFisicaDTO clientePessoaFisicaDTO);
}

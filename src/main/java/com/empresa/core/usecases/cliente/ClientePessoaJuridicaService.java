package com.empresa.core.usecases.cliente;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.empresa.core.model.cliente.ClientePessoaJuridicaDTO;

public interface ClientePessoaJuridicaService {
	
	public Optional<ClientePessoaJuridicaDTO> findById(Long id);
	
	public List<ClientePessoaJuridicaDTO> findAll();
	
	public Page<ClientePessoaJuridicaDTO> findByPage(Pageable pageable);
	
	public ClientePessoaJuridicaDTO save(ClientePessoaJuridicaDTO clientePessoaJuridicaDTO);
	
	public void delete(ClientePessoaJuridicaDTO clientePessoaJuridicaDTO);

}

package com.empresa.core.usecases.cliente;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.empresa.core.model.cliente.ClienteEnderecoDTO;

@Service
public interface ClienteEnderecoService {
	
	public Optional<ClienteEnderecoDTO> findById(Long id);
	
	public List<ClienteEnderecoDTO> findAll();
	
	public Page<ClienteEnderecoDTO> findByPage(Pageable pageable);
	
	public ClienteEnderecoDTO save(ClienteEnderecoDTO clienteEnderecoDTO);
	
	public void delete(ClienteEnderecoDTO clienteEnderecoDTO);
}

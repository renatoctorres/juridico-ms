package com.empresa.core.usecases.cliente;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.empresa.core.model.cliente.ClienteDTO;

@Service
public interface ClienteService {
	
	public Optional<ClienteDTO> findById(Long id);
	
	public List<ClienteDTO> findAll();
	
	public Page<ClienteDTO> findByPage(Pageable pageable);
	
	public ClienteDTO save(ClienteDTO clienteDTO);
	
	public void delete(ClienteDTO clienteDTO);

}

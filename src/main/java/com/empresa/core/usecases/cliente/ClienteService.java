package com.empresa.core.usecases.cliente;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.empresa.core.model.cliente.ClienteDTO;

@Service
public interface ClienteService{
	
	public Optional<ClienteDTO> findById(Long id);
	
	public List<ClienteDTO> findAll();
	
	public Page<ClienteDTO> findByPage(Pageable pageable);
		
	@Transactional
	public ClienteDTO save(ClienteDTO clienteDTO);
	
	@Transactional
	public void delete(ClienteDTO clienteDTO);
	


}

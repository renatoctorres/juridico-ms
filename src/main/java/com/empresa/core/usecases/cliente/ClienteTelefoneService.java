package com.empresa.core.usecases.cliente;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.empresa.core.model.cliente.ClienteTelefoneDTO;

@Service
public interface ClienteTelefoneService {
	
	public Optional<ClienteTelefoneDTO> findById(Long id);
	
	public List<ClienteTelefoneDTO> findAll();
	
	public Page<ClienteTelefoneDTO> findByPage(Pageable pageable);
	
	public ClienteTelefoneDTO save(ClienteTelefoneDTO clienteTelefoneDTO);
	
	public void delete(ClienteTelefoneDTO clienteTelefoneDTO);
}

package com.empresa.core.usecases.impl.cliente;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.empresa.core.model.cliente.ClienteDTO;
import com.empresa.core.usecases.cliente.ClienteService;
import com.empresa.infra.configuration.converter.cliente.ClienteConverter;
import com.empresa.infra.repositories.cliente.ClienteRepository;
import com.empresa.infra.repositories.entity.cliente.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	ClienteRepository repository;
	
	ClienteConverter converter = new ClienteConverter();
	
	public Optional<ClienteDTO> findById(Long id) {
		Optional<Cliente> optCliente = this.repository.findById(id);
		if(optCliente.isPresent()) {
			return Optional.of(converter.convertFromEntity(optCliente.get()));
		}
		return Optional.empty();
	}
	
	public List<ClienteDTO> findAll() {
		List<Cliente> listClientes = this.repository.findAll();
		return converter.createFromEntities(listClientes);
	}
	
	public Page<ClienteDTO> findByPage(Pageable pageable) {
		Page<Cliente> pageCliente = this.repository.findAll(pageable);
		final Page<ClienteDTO> pageDTO = pageCliente.map(this::callConvert);
		return pageDTO;
	
	}
		
	@Transactional
	public ClienteDTO save(ClienteDTO clienteDTO) {
		Cliente cliente = this.repository.save(this.converter.convertFromDto(clienteDTO));
		return this.converter.convertFromEntity(cliente);
	}
	
	@Transactional
	public void delete(ClienteDTO clienteDTO) {
		this.repository.delete(this.converter.convertFromDto(clienteDTO));
	}
	
	public ClienteDTO callConvert(Cliente cliente) {
		return converter.convertFromEntity(cliente);
	}

	
	

}

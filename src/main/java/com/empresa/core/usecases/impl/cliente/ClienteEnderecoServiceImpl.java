package com.empresa.core.usecases.impl.cliente;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.empresa.core.model.cliente.ClienteEnderecoDTO;
import com.empresa.core.usecases.cliente.ClienteEnderecoService;
import com.empresa.infra.configuration.converter.cliente.ClienteEnderecoConverter;
import com.empresa.infra.repositories.cliente.ClienteEnderecoRepository;
import com.empresa.infra.repositories.entity.cliente.ClienteEndereco;

@Service
public class ClienteEnderecoServiceImpl implements ClienteEnderecoService{
	
	@Autowired
	ClienteEnderecoRepository repository;
	
	ClienteEnderecoConverter converter = new ClienteEnderecoConverter();
	
	public Optional<ClienteEnderecoDTO> findById(Long id) {
		Optional<ClienteEndereco> optClienteEndereco = this.repository.findById(id);
		if(optClienteEndereco.isPresent()) {
			return Optional.of(converter.convertFromEntity(optClienteEndereco.get()));
		}
		return Optional.empty();
	}
	
	public List<ClienteEnderecoDTO> findAll() {
		List<ClienteEndereco> listClienteEnderecos = this.repository.findAll();
		return converter.createFromEntities(listClienteEnderecos);
	}
	
	public Page<ClienteEnderecoDTO> findByPage(Pageable pageable) {
		Page<ClienteEndereco> pageClienteEndereco = this.repository.findAll(pageable);
		final Page<ClienteEnderecoDTO> pageDTO = pageClienteEndereco.map(this::callConvert);
		return pageDTO;
	
	}
		
	@Transactional
	public ClienteEnderecoDTO save(ClienteEnderecoDTO clienteEnderecoDTO) {
		ClienteEndereco clienteEndereco = this.repository.save(this.converter.convertFromDto(clienteEnderecoDTO));
		return this.converter.convertFromEntity(clienteEndereco);
	}
	
	@Transactional
	public void delete(ClienteEnderecoDTO clienteEnderecoDTO) {
		this.repository.delete(this.converter.convertFromDto(clienteEnderecoDTO));
	}
	
	public ClienteEnderecoDTO callConvert(ClienteEndereco clienteEndereco) {
		return converter.convertFromEntity(clienteEndereco);
	}
	
	

}

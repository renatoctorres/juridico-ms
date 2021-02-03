package com.empresa.core.usecases.impl.cliente;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.empresa.core.model.cliente.ClientePessoaFisicaDTO;
import com.empresa.core.usecases.cliente.ClientePessoaFisicaService;
import com.empresa.infra.configuration.converter.cliente.ClientePessoaFisicaConverter;
import com.empresa.infra.repositories.cliente.ClientePessoaFisicaRepository;
import com.empresa.infra.repositories.entity.cliente.ClientePessoaFisica;

@Service
public class ClientePessoaFisicaServiceImpl implements ClientePessoaFisicaService{
	
	@Autowired
	ClientePessoaFisicaRepository repository;
	
	ClientePessoaFisicaConverter converter = new ClientePessoaFisicaConverter();
	
	public Optional<ClientePessoaFisicaDTO> findById(Long id) {
		Optional<ClientePessoaFisica> optClientePessoaFisica = this.repository.findById(id);
		if(optClientePessoaFisica.isPresent()) {
			return Optional.of(converter.convertFromEntity(optClientePessoaFisica.get()));
		}
		return Optional.empty();
	}
	
	public List<ClientePessoaFisicaDTO> findAll() {
		List<ClientePessoaFisica> listClientePessoaFisicas = this.repository.findAll();
		return converter.createFromEntities(listClientePessoaFisicas);
	}
	
	public Page<ClientePessoaFisicaDTO> findByPage(Pageable pageable) {
		Page<ClientePessoaFisica> pageClientePessoaFisica = this.repository.findAll(pageable);
		final Page<ClientePessoaFisicaDTO> pageDTO = pageClientePessoaFisica.map(this::callConvert);
		return pageDTO;
	
	}
	
	@Transactional
	public ClientePessoaFisicaDTO save(ClientePessoaFisicaDTO clientePessoaFisicaDTO) {
		ClientePessoaFisica clientePessoaFisica = this.repository.save(this.converter.convertFromDto(clientePessoaFisicaDTO));
		return this.converter.convertFromEntity(clientePessoaFisica);
	}
	
	@Transactional
	public void delete(ClientePessoaFisicaDTO clientePessoaFisicaDTO) {
		this.repository.delete(this.converter.convertFromDto(clientePessoaFisicaDTO));
	}
	
	public ClientePessoaFisicaDTO callConvert(ClientePessoaFisica clientePessoaFisica) {
		return converter.convertFromEntity(clientePessoaFisica);
	}



	
	

}

package com.empresa.core.usecases.impl.cliente;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.empresa.core.model.cliente.ClientePessoaJuridicaDTO;
import com.empresa.core.usecases.cliente.ClientePessoaJuridicaService;
import com.empresa.infra.configuration.converter.cliente.ClientePessoaJuridicaConverter;
import com.empresa.infra.repositories.cliente.ClientePessoaJuridicaRepository;
import com.empresa.infra.repositories.entity.cliente.ClientePessoaJuridica;

@Service
public class ClientePessoaJuridicaServiceImpl implements ClientePessoaJuridicaService{
	
	@Autowired
	ClientePessoaJuridicaRepository repository;
	
	ClientePessoaJuridicaConverter converter = new ClientePessoaJuridicaConverter();
	
	public Optional<ClientePessoaJuridicaDTO> findById(Long id) {
		Optional<ClientePessoaJuridica> optClientePessoaJuridica = this.repository.findById(id);
		if(optClientePessoaJuridica.isPresent()) {
			return Optional.of(converter.convertFromEntity(optClientePessoaJuridica.get()));
		}
		return Optional.empty();
	}
	
	public List<ClientePessoaJuridicaDTO> findAll() {
		List<ClientePessoaJuridica> listClientePessoaJuridicas = this.repository.findAll();
		return converter.createFromEntities(listClientePessoaJuridicas);
	}
	
	public Page<ClientePessoaJuridicaDTO> findByPage(Pageable pageable) {
		Page<ClientePessoaJuridica> pageClientePessoaJuridica = this.repository.findAll(pageable);
		final Page<ClientePessoaJuridicaDTO> pageDTO = pageClientePessoaJuridica.map(this::callConvert);
		return pageDTO;
	
	}
	
	@Transactional
	public ClientePessoaJuridicaDTO save(ClientePessoaJuridicaDTO clientePessoaJuridicaDTO) {
		ClientePessoaJuridica clientePessoaJuridica = this.repository.save(this.converter.convertFromDto(clientePessoaJuridicaDTO));
		return this.converter.convertFromEntity(clientePessoaJuridica);
	}
	
	@Transactional
	public void delete(ClientePessoaJuridicaDTO clientePessoaJuridicaDTO) {
		this.repository.delete(this.converter.convertFromDto(clientePessoaJuridicaDTO));
	}
	
	public ClientePessoaJuridicaDTO callConvert(ClientePessoaJuridica clientePessoaJuridica) {
		return converter.convertFromEntity(clientePessoaJuridica);
	}



	
	

}

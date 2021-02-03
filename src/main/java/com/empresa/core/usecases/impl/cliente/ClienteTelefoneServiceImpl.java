package com.empresa.core.usecases.impl.cliente;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.empresa.core.model.cliente.ClienteTelefoneDTO;
import com.empresa.core.usecases.cliente.ClienteTelefoneService;
import com.empresa.infra.configuration.converter.cliente.ClienteTelefoneConverter;
import com.empresa.infra.repositories.cliente.ClienteTelefoneRepository;
import com.empresa.infra.repositories.entity.cliente.ClienteTelefone;

@Service
public class ClienteTelefoneServiceImpl implements ClienteTelefoneService{
	
	@Autowired
	ClienteTelefoneRepository repository;
	
	ClienteTelefoneConverter converter = new ClienteTelefoneConverter();
	
	public Optional<ClienteTelefoneDTO> findById(Long id) {
		Optional<ClienteTelefone> optClienteTelefone = this.repository.findById(id);
		if(optClienteTelefone.isPresent()) {
			return Optional.of(converter.convertFromEntity(optClienteTelefone.get()));
		}
		return Optional.empty();
	}
	
	public List<ClienteTelefoneDTO> findAll() {
		List<ClienteTelefone> listClienteTelefones = this.repository.findAll();
		return converter.createFromEntities(listClienteTelefones);
	}
	
	public Page<ClienteTelefoneDTO> findByPage(Pageable pageable) {
		Page<ClienteTelefone> pageClienteTelefone = this.repository.findAll(pageable);
		final Page<ClienteTelefoneDTO> pageDTO = pageClienteTelefone.map(this::callConvert);
		return pageDTO;
	
	}
	
	@Transactional
	public ClienteTelefoneDTO save(ClienteTelefoneDTO clienteTelefoneDTO) {
		ClienteTelefone clienteTelefone = this.repository.save(this.converter.convertFromDto(clienteTelefoneDTO));
		return this.converter.convertFromEntity(clienteTelefone);
	}
	
	@Transactional
	public void delete(ClienteTelefoneDTO clienteTelefoneDTO) {
		this.repository.delete(this.converter.convertFromDto(clienteTelefoneDTO));
	}
	
	public ClienteTelefoneDTO callConvert(ClienteTelefone clienteTelefone) {
		return converter.convertFromEntity(clienteTelefone);
	}



	
	

}

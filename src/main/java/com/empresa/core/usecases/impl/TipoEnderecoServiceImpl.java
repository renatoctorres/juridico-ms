package com.empresa.core.usecases.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.empresa.core.model.TipoEnderecoDTO;
import com.empresa.core.usecases.TipoEnderecoService;
import com.empresa.infra.configuration.converter.TipoEnderecoConverter;
import com.empresa.infra.repositories.TipoEnderecoRepository;
import com.empresa.infra.repositories.entity.TipoEndereco;

@Service
public class TipoEnderecoServiceImpl implements TipoEnderecoService {
	
	@Autowired
	TipoEnderecoRepository repository;
	
	TipoEnderecoConverter converter = new TipoEnderecoConverter();
	
	public Optional<TipoEnderecoDTO> findById(Long id) {
		Optional<TipoEndereco> optTipoEndereco = this.repository.findById(id);
		if(optTipoEndereco.isPresent()) {
			return Optional.of(converter.convertFromEntity(optTipoEndereco.get()));
		}
		return Optional.empty();
	}
	
	public List<TipoEnderecoDTO> findAll() {
		List<TipoEndereco> listTipoEnderecos = this.repository.findAll();
		return converter.createFromEntities(listTipoEnderecos);
	}
	
	public Page<TipoEnderecoDTO> findByPage(Pageable pageable) {
		Page<TipoEndereco> pageTipoEndereco = this.repository.findAll(pageable);
		final Page<TipoEnderecoDTO> pageDTO = pageTipoEndereco.map(this::callConvert);
		return pageDTO;
	
	}
		
	@Transactional
	public TipoEnderecoDTO save(TipoEnderecoDTO tipoEnderecoDTO) {
		TipoEndereco tipoEndereco = this.repository.save(this.converter.convertFromDto(tipoEnderecoDTO));
		return this.converter.convertFromEntity(tipoEndereco);
	}
	
	@Transactional
	public void delete(TipoEnderecoDTO tipoEnderecoDTO) {
		this.repository.delete(this.converter.convertFromDto(tipoEnderecoDTO));
	}
	
	public TipoEnderecoDTO callConvert(TipoEndereco tipoEndereco) {
		return converter.convertFromEntity(tipoEndereco);
	}
	

}

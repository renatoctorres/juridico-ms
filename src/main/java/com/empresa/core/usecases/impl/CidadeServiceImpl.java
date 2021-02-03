package com.empresa.core.usecases.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.empresa.core.model.CidadeDTO;
import com.empresa.core.usecases.CidadeService;
import com.empresa.infra.configuration.converter.CidadeConverter;
import com.empresa.infra.repositories.CidadeRepository;
import com.empresa.infra.repositories.entity.Cidade;

@Service
public class CidadeServiceImpl implements CidadeService{
	
	@Autowired
	CidadeRepository repository;
	
	CidadeConverter converter = new CidadeConverter();
	
	public Optional<CidadeDTO> findById(Long id) {
		Optional<Cidade> optCidade = this.repository.findById(id);
		if(optCidade.isPresent()) {
			return Optional.of(converter.convertFromEntity(optCidade.get()));
		}
		return Optional.empty();
	}
	
	public List<CidadeDTO> findAll() {
		List<Cidade> listCidades = this.repository.findAll();
		return converter.createFromEntities(listCidades);
	}
	
	public Page<CidadeDTO> findByPage(Pageable pageable) {
		Page<Cidade> pageCidade = this.repository.findAll(pageable);
		final Page<CidadeDTO> pageDTO = pageCidade.map(this::callConvert);
		return pageDTO;
	
	}
		
	@Transactional
	public CidadeDTO save(CidadeDTO cidadeDTO) {
		Cidade cidade = this.repository.save(this.converter.convertFromDto(cidadeDTO));
		return this.converter.convertFromEntity(cidade);
	}
	
	@Transactional
	public void delete(CidadeDTO cidadeDTO) {
		this.repository.delete(this.converter.convertFromDto(cidadeDTO));
	}
	
	public CidadeDTO callConvert(Cidade cidade) {
		return converter.convertFromEntity(cidade);
	}
	

}

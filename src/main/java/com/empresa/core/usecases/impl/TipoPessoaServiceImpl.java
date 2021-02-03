package com.empresa.core.usecases.impl;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.empresa.core.model.TipoPessoaDTO;
import com.empresa.core.usecases.cliente.TipoPessoaService;
import com.empresa.infra.configuration.converter.TipoPessoaConverter;
import com.empresa.infra.repositories.TipoPessoaRepository;
import com.empresa.infra.repositories.entity.TipoPessoa;

@Service
public class TipoPessoaServiceImpl implements TipoPessoaService{
	
	@Autowired
	TipoPessoaRepository repository;
	
	TipoPessoaConverter converter = new TipoPessoaConverter();
	
	public Optional<TipoPessoaDTO> findById(Long id) {
		Optional<TipoPessoa> optTipoPessoa = this.repository.findById(id);
		if(optTipoPessoa.isPresent()) {
			return Optional.of(converter.convertFromEntity(optTipoPessoa.get()));
		}
		return Optional.empty();
	}
	
	public List<TipoPessoaDTO> findAll() {
		List<TipoPessoa> listTipoPessoas = this.repository.findAll();
		return converter.createFromEntities(listTipoPessoas);
	}
	
	public Page<TipoPessoaDTO> findByPage(Pageable pageable) {
		Page<TipoPessoa> pageTipoPessoa = this.repository.findAll(pageable);
		final Page<TipoPessoaDTO> pageDTO = pageTipoPessoa.map(this::callConvert);
		return pageDTO;
	
	}
		
	@Transactional
	public TipoPessoaDTO save(TipoPessoaDTO tipoPessoaDTO) {
		TipoPessoa tipoPessoa = this.repository.save(this.converter.convertFromDto(tipoPessoaDTO));
		return this.converter.convertFromEntity(tipoPessoa);
	}
	
	@Transactional
	public void delete(TipoPessoaDTO tipoPessoaDTO) {
		this.repository.delete(this.converter.convertFromDto(tipoPessoaDTO));
	}
	
	public TipoPessoaDTO callConvert(TipoPessoa tipoPessoa) {
		return converter.convertFromEntity(tipoPessoa);
	}
	

}

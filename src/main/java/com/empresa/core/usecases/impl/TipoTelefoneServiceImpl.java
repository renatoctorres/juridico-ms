package com.empresa.core.usecases.impl;

import org.springframework.stereotype.Service;
import com.empresa.core.usecases.TipoTelefoneService;
import com.empresa.core.usecases.template.BaseServiceImpl;
import com.empresa.infra.repositories.BaseRepository;
import com.empresa.infra.repositories.TipoPessoaRepository;
import com.empresa.infra.repositories.entity.TipoTelefone;

@Service
public class TipoTelefoneServiceImpl extends BaseServiceImpl<TipoTelefone, Long> implements TipoTelefoneService{
	
	public TipoTelefoneServiceImpl(BaseRepository<TipoTelefone, Long> repository) {
		super(repository);
	}

	TipoPessoaRepository repository;
	


}

package com.empresa.core.usecases;

import org.springframework.stereotype.Service;

import com.empresa.core.usecases.template.BaseService;
import com.empresa.infra.repositories.entity.TipoTelefone;

@Service
public interface TipoTelefoneService extends BaseService<TipoTelefone, Long>{
	

}

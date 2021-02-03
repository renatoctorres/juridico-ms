package com.empresa.infra.configuration.converter;

import com.empresa.core.model.RegiaoDTO;
import com.empresa.infra.repositories.entity.Regiao;

public class RegiaoConverter extends Converter<RegiaoDTO, Regiao> {
	

	public RegiaoConverter() {
		super( regiaoDTO -> new Regiao( regiaoDTO.getCodigo(),
										regiaoDTO.getDescricao()),
										 				
				regiao   -> new RegiaoDTO ( regiao.getCodigo(),
											regiao.getDescricao()
										      
		));	
	
		
	}

}

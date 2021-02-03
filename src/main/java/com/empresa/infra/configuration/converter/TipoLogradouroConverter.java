package com.empresa.infra.configuration.converter;

import com.empresa.core.model.TipoLogradouroDTO;
import com.empresa.infra.repositories.entity.TipoLogradouro;

public class TipoLogradouroConverter extends Converter<TipoLogradouroDTO, TipoLogradouro>{

	public TipoLogradouroConverter() {
		super( tipoLogradouroDTO -> new TipoLogradouro( tipoLogradouroDTO.getCodigo(),
														tipoLogradouroDTO.getDescricao(),
														tipoLogradouroDTO.getSigla()),
										 				
				tipoLogradouro   -> new TipoLogradouroDTO ( tipoLogradouro.getCodigo(),
															tipoLogradouro.getDescricao(),
															tipoLogradouro.getSigla()
										      
		));	
	
		
	}
	

}



package com.empresa.infra.configuration.converter;

import com.empresa.core.model.TipoTelefoneDTO;
import com.empresa.infra.repositories.entity.TipoTelefone;

public class TipoTelefoneConverter extends Converter<TipoTelefoneDTO, TipoTelefone> {
	
	public TipoTelefoneConverter() {
		super( tipoTelefoneDTO -> new TipoTelefone( tipoTelefoneDTO.getCodigo(),
				                                    tipoTelefoneDTO.getDescricao(),
				                                    tipoTelefoneDTO.getTamanho()),
										 				
				tipoTelefone   -> new TipoTelefoneDTO ( tipoTelefone.getCodigo(),
														tipoTelefone.getDescricao(),
														tipoTelefone.getTamanho()
										      
		));	
	
		
	}

}

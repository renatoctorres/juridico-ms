package com.empresa.infra.configuration.converter;

import com.empresa.core.model.TipoEnderecoDTO;
import com.empresa.infra.repositories.entity.TipoEndereco;

public class TipoEnderecoConverter extends Converter<TipoEnderecoDTO, TipoEndereco>{

	public TipoEnderecoConverter() {
		super( tipoEnderecoDTO -> new TipoEndereco( tipoEnderecoDTO.getCodigo(),
													tipoEnderecoDTO.getDescricao()),
										 				
				tipoEndereco   -> new TipoEnderecoDTO ( tipoEndereco.getCodigo(),
														tipoEndereco.getDescricao()
										      
		));	
	
		
	}
	

}



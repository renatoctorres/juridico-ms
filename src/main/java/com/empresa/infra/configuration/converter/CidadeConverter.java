package com.empresa.infra.configuration.converter;

import com.empresa.core.model.CidadeDTO;
import com.empresa.core.model.EstadoDTO;
import com.empresa.infra.repositories.entity.Cidade;
import com.empresa.infra.repositories.entity.Estado;

public class CidadeConverter extends Converter<CidadeDTO, Cidade>{
	
	static Converter < EstadoDTO, Estado > estadoConverter = new EstadoConverter();

	public CidadeConverter() {
		super( cidadeDTO -> new Cidade( cidadeDTO.getCodigo(),
										estadoConverter.convertFromDto(cidadeDTO.getEstadoDTO()),
										cidadeDTO.getDescricao()),
										 				
				cidade   -> new CidadeDTO ( cidade.getCodigo(),
										estadoConverter.convertFromEntity(cidade.getEstado()),
										cidade.getDescricao()
										      
		));	
	
		
	}
	

}



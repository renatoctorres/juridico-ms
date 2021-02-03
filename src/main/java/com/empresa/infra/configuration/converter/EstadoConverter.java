package com.empresa.infra.configuration.converter;

import com.empresa.core.model.EstadoDTO;
import com.empresa.core.model.RegiaoDTO;
import com.empresa.infra.repositories.entity.Estado;
import com.empresa.infra.repositories.entity.Regiao;

public class EstadoConverter extends Converter<EstadoDTO, Estado> {
	
	static Converter < RegiaoDTO, Regiao > regiaoConverter = new RegiaoConverter();

	public EstadoConverter() {
		super( estadoDTO -> new Estado( estadoDTO.getCodigo(),
										regiaoConverter.convertFromDto(estadoDTO.getRegiaoDTO()) ,
										estadoDTO.getDescricao(),
										estadoDTO.getUF()),
										 				
				estado   -> new EstadoDTO ( estado.getCodigo(),
											regiaoConverter.convertFromEntity(estado.getRegiao()), 
											estado.getDescricao(),
											estado.getUF()
										      
		));	
	
		
	}

}

package com.empresa.infra.configuration.converter.cliente;

import com.empresa.core.model.TipoTelefoneDTO;
import com.empresa.core.model.cliente.ClienteDTO;
import com.empresa.core.model.cliente.ClienteTelefoneDTO;
import com.empresa.infra.configuration.converter.Converter;
import com.empresa.infra.configuration.converter.TipoTelefoneConverter;
import com.empresa.infra.repositories.entity.TipoTelefone;
import com.empresa.infra.repositories.entity.cliente.Cliente;
import com.empresa.infra.repositories.entity.cliente.ClienteTelefone;

public class ClienteTelefoneConverter extends Converter<ClienteTelefoneDTO, ClienteTelefone>{
	
	static Converter < ClienteDTO, Cliente > clienteConverter = new ClienteConverter();
	static Converter < TipoTelefoneDTO, TipoTelefone > tipoTelefoneConverter = new TipoTelefoneConverter();
	
	
	public ClienteTelefoneConverter() {
		super( clienteTelefoneDTO -> new ClienteTelefone( clienteTelefoneDTO.getCodigo(),
										  clienteConverter.convertFromDto(clienteTelefoneDTO.getClienteDTO()),
										  tipoTelefoneConverter.convertFromDto(clienteTelefoneDTO.getTipoTelefoneDTO()), 
										  clienteTelefoneDTO.getNumero(),
										  clienteTelefoneDTO.getDdd()),
				
				clienteTelefone   -> new ClienteTelefoneDTO ( clienteTelefone.getCodigo(),
										  clienteConverter.convertFromEntity(clienteTelefone.getCliente()),
										  tipoTelefoneConverter.convertFromEntity(clienteTelefone.getTipoTelefone()), 
										  clienteTelefone.getNumero(),
										  clienteTelefone.getDdd()
										      
		));	
				
		
	}
	

}

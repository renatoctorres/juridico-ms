package com.empresa.infra.configuration.converter.cliente;

import com.empresa.core.model.cliente.ClienteDTO;
import com.empresa.core.model.cliente.ClientePessoaJuridicaDTO;
import com.empresa.infra.configuration.converter.Converter;
import com.empresa.infra.repositories.entity.cliente.Cliente;
import com.empresa.infra.repositories.entity.cliente.ClientePessoaJuridica;

public class ClientePessoaJuridicaConverter extends Converter<ClientePessoaJuridicaDTO, ClientePessoaJuridica> {
	
	static Converter < ClienteDTO, Cliente > clienteConverter = new ClienteConverter();

	public ClientePessoaJuridicaConverter() {
		super( clientePessoaJuridicaDTO -> new ClientePessoaJuridica( clientePessoaJuridicaDTO.getCodigo(),
										  clientePessoaJuridicaDTO.getNomeFantasia(),
										  clientePessoaJuridicaDTO.getRazaoSocial(),
										  clientePessoaJuridicaDTO.getCnpj(),
										  clienteConverter.convertFromDto(clientePessoaJuridicaDTO.getClienteDTO())),									  
								
				clientePessoaJuridica   -> new ClientePessoaJuridicaDTO (clientePessoaJuridica.getCodigo(),
										  clientePessoaJuridica.getNomeFantasia(),
										  clientePessoaJuridica.getRazaoSocial(),
										  clientePessoaJuridica.getCnpj(),
										  clienteConverter.convertFromEntity(clientePessoaJuridica.getCliente())));	
				
		
	}
	

}



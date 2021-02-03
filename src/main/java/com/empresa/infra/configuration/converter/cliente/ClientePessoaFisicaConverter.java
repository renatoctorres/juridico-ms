package com.empresa.infra.configuration.converter.cliente;

import com.empresa.core.model.cliente.ClienteDTO;
import com.empresa.core.model.cliente.ClientePessoaFisicaDTO;
import com.empresa.infra.configuration.converter.Converter;
import com.empresa.infra.repositories.entity.cliente.Cliente;
import com.empresa.infra.repositories.entity.cliente.ClientePessoaFisica;

public class ClientePessoaFisicaConverter extends Converter<ClientePessoaFisicaDTO, ClientePessoaFisica> {
	
	static Converter < ClienteDTO, Cliente > converter = new ClienteConverter();

	public ClientePessoaFisicaConverter() {
		super( clientePessoaFisicaDTO -> new ClientePessoaFisica( clientePessoaFisicaDTO.getCodigo(),
										  clientePessoaFisicaDTO.getNome(),
										  clientePessoaFisicaDTO.getApelido(),
										  clientePessoaFisicaDTO.getEmail(),
										  clientePessoaFisicaDTO.getRgNumero(),
										  clientePessoaFisicaDTO.getRgOrgaoEmissor(),
										  clientePessoaFisicaDTO.getRgUf(),
										  clientePessoaFisicaDTO.getTituloEleitor(),
										  clientePessoaFisicaDTO.getCpf(),
										  converter.convertFromDto(clientePessoaFisicaDTO.getClienteDTO())),
								
				clientePessoaFisica   -> new ClientePessoaFisicaDTO ( clientePessoaFisica.getCodigo(),
						  clientePessoaFisica.getNome(),
						  clientePessoaFisica.getApelido(),
						  clientePessoaFisica.getEmail(),
						  clientePessoaFisica.getRgNumero(),
						  clientePessoaFisica.getRgOrgaoEmissor(),
						  clientePessoaFisica.getRgUf(),
						  clientePessoaFisica.getTituloEleitor(),
						  clientePessoaFisica.getCpf(),
						  converter.convertFromEntity(clientePessoaFisica.getCliente())
										      
		));	
				
		
	}
	

}

package com.empresa.infra.configuration.converter.cliente;

import com.empresa.core.model.TipoPessoaDTO;
import com.empresa.core.model.cliente.ClienteDTO;
import com.empresa.infra.configuration.converter.Converter;
import com.empresa.infra.configuration.converter.TipoPessoaConverter;
import com.empresa.infra.repositories.entity.TipoPessoa;
import com.empresa.infra.repositories.entity.cliente.Cliente;

public class ClienteConverter extends Converter<ClienteDTO, Cliente>{
	
	static Converter < TipoPessoaDTO, TipoPessoa > tipoPessoaConverter = new TipoPessoaConverter();
	
	public ClienteConverter() {
		super( clienteDTO -> new Cliente( clienteDTO.getCodigo(),
										  tipoPessoaConverter.convertFromDto(clienteDTO.getTipoPessoaDTO()), 
										  clienteDTO.getDataAtualizacao(),
										  clienteDTO.getDataCadastro(),
										  clienteDTO.getObservacoes()),
				
				cliente   -> new ClienteDTO ( cliente.getCodigo(),
						 					  tipoPessoaConverter.convertFromEntity(cliente.getTipoPessoa()), 
										      cliente.getDataAtualizacao(),
									          cliente.getDataCadastro(),
										      cliente.getObservacoes()
										      
		));	
				
		
	}
	

}



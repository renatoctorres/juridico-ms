package com.empresa.infra.configuration.converter.cliente;

import com.empresa.core.model.CidadeDTO;
import com.empresa.core.model.TipoEnderecoDTO;
import com.empresa.core.model.TipoLogradouroDTO;
import com.empresa.core.model.cliente.ClienteDTO;
import com.empresa.core.model.cliente.ClienteEnderecoDTO;
import com.empresa.infra.configuration.converter.CidadeConverter;
import com.empresa.infra.configuration.converter.Converter;
import com.empresa.infra.configuration.converter.TipoEnderecoConverter;
import com.empresa.infra.configuration.converter.TipoLogradouroConverter;
import com.empresa.infra.repositories.entity.Cidade;
import com.empresa.infra.repositories.entity.TipoEndereco;
import com.empresa.infra.repositories.entity.TipoLogradouro;
import com.empresa.infra.repositories.entity.cliente.Cliente;
import com.empresa.infra.repositories.entity.cliente.ClienteEndereco;

public class ClienteEnderecoConverter extends Converter<ClienteEnderecoDTO, ClienteEndereco>{
	
	static Converter < ClienteDTO, Cliente > clienteConverter = new ClienteConverter();
	static Converter < TipoEnderecoDTO, TipoEndereco > tipoEnderecoConverter = new TipoEnderecoConverter();
	static Converter < TipoLogradouroDTO, TipoLogradouro > TipoLogradouroConverter = new TipoLogradouroConverter();
	static Converter < CidadeDTO, Cidade > cidadeConverter = new CidadeConverter();
	
	public ClienteEnderecoConverter() {
		super( clienteEnderecoDTO -> new ClienteEndereco( clienteEnderecoDTO.getCodigo(),
										  clienteConverter.convertFromDto(clienteEnderecoDTO.getClienteDTO()), 
										  tipoEnderecoConverter.convertFromDto(clienteEnderecoDTO.getTipoEnderecoDTO()), 
										  clienteEnderecoDTO.getCep(),
										  TipoLogradouroConverter.convertFromDto(clienteEnderecoDTO.getTipoLogradouroDTO()),
										  clienteEnderecoDTO.getLogradouro(),
										  clienteEnderecoDTO.getNumero(),
										  clienteEnderecoDTO.getComplemento(),
										  clienteEnderecoDTO.getBairro(),
										  cidadeConverter.convertFromDto(clienteEnderecoDTO.getCidadeDTO())),
				
				clienteEndereco   -> new ClienteEnderecoDTO ( clienteEndereco.getCodigo(),
										  clienteConverter.convertFromEntity(clienteEndereco.getCliente()), 
										  tipoEnderecoConverter.convertFromEntity(clienteEndereco.getTipoEndereco()), 
										  clienteEndereco.getCep(),
										  TipoLogradouroConverter.convertFromEntity(clienteEndereco.getTipoLogradouro()),
										  clienteEndereco.getLogradouro(),
										  clienteEndereco.getNumero(),
										  clienteEndereco.getComplemento(),
										  clienteEndereco.getBairro(),
										  cidadeConverter.convertFromEntity(clienteEndereco.getCidade())));	
				
		
	}
	


}



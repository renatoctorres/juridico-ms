package com.empresa.core.model.cliente;

import com.empresa.core.model.CidadeDTO;
import com.empresa.core.model.TipoEnderecoDTO;
import com.empresa.core.model.TipoLogradouroDTO;

import lombok.Data;

@Data
public class ClienteEnderecoDTO {
	
	private Long codigo;
	private ClienteDTO clienteDTO;
	private TipoEnderecoDTO tipoEnderecoDTO;
	private String cep;
	private TipoLogradouroDTO tipoLogradouroDTO;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private CidadeDTO cidadeDTO;
	
	public ClienteEnderecoDTO(Long codigo, ClienteDTO clienteDTO, TipoEnderecoDTO tipoEnderecoDTO, String cep,
			TipoLogradouroDTO tipoLogradouroDTO, String logradouro, String numero, String complemento, String bairro, CidadeDTO cidadeDTO) {
		super();
		this.codigo = codigo;
		this.clienteDTO = clienteDTO;
		this.tipoEnderecoDTO = tipoEnderecoDTO;
		this.cep = cep;
		this.tipoLogradouroDTO = tipoLogradouroDTO;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidadeDTO = cidadeDTO;
	}


	

}

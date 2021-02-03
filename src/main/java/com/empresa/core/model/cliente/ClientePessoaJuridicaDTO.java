package com.empresa.core.model.cliente;

import lombok.Data;

@Data
public class ClientePessoaJuridicaDTO {
	
	private Long codigo;
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private ClienteDTO clienteDTO;
	
    public ClientePessoaJuridicaDTO(Long codigo, String nomeFantasia, String razaoSocial, String cnpj,	ClienteDTO clienteDTO) {
		super();
		this.codigo = codigo;
		this.nomeFantasia = nomeFantasia;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.clienteDTO = clienteDTO;
	}
    

}

package com.empresa.core.model.cliente;

import lombok.Data;

@Data	
public class ClientePessoaFisicaDTO {
	
	private Long codigo;
    private String nome;
    private String apelido;
    private String email;
    private String rgNumero;
    private String rgOrgaoEmissor;
	private String rgUf;
    private String tituloEleitor;
    private String cpf;
    private ClienteDTO clienteDTO;
    
	public ClientePessoaFisicaDTO(Long codigo, String nome, String apelido, String email, String rgNumero,
			String rgOrgaoEmissor, String rgUf, String tituloEleitor, String cpf, ClienteDTO clienteDTO) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.apelido = apelido;
		this.email = email;
		this.rgNumero = rgNumero;
		this.rgOrgaoEmissor = rgOrgaoEmissor;
		this.rgUf = rgUf;
		this.tituloEleitor = tituloEleitor;
		this.cpf = cpf;
		this.clienteDTO = clienteDTO;
	}
	

    



}

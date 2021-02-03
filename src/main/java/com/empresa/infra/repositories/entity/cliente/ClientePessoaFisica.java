package com.empresa.infra.repositories.entity.cliente;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="TB_CLIENTE_PESSOA_FISICA")
public class ClientePessoaFisica {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long codigo;
	
    private String nome;
    
    private String apelido;
    
    private String email;

	private String rgNumero;
    
    private String rgOrgaoEmissor;
    
    private String rgUf;
    
    private String tituloEleitor;
    
    private String cpf;
    
	@OneToOne
	@JoinColumn(name="cod_cliente")
	Cliente cliente;
	
    
    public ClientePessoaFisica(Long codigo, String nome, String apelido, String email, String rgNumero,
			String rgOrgaoEmissor, String rgUf, String tituloEleitor, String cpf, Cliente cliente) {
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
		this.cliente = cliente;
	}

	public ClientePessoaFisica() {
		super();
	}
	

}

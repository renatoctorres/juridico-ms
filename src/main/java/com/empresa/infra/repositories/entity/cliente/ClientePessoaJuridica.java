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
@Table(name="TB_CLIENTE_PESSOA_JURIDICA")
public class ClientePessoaJuridica {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long codigo;
	
    private String nomeFantasia;
    
    private String razaoSocial;
    
    private String cnpj;
    
	@OneToOne
	@JoinColumn(name="cod_cliente")
	Cliente cliente;

	public ClientePessoaJuridica(Long codigo, String nomeFantasia, String razaoSocial, String cnpj, Cliente cliente) {
		super();
		this.codigo = codigo;
		this.nomeFantasia = nomeFantasia;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.cliente = cliente;
	}

	public ClientePessoaJuridica() {
		super();
	}

}

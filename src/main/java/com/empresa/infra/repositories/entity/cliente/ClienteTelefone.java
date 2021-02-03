package com.empresa.infra.repositories.entity.cliente;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.empresa.infra.repositories.entity.TipoTelefone;

import lombok.Data;

@Data
@Entity
@Table(name="TB_CLIENTE_TELEFONE")
public class ClienteTelefone {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long codigo;
	
	@OneToOne
	@JoinColumn(name="cod_cliente")
	private Cliente cliente;
	
	@OneToOne
	@JoinColumn(name="cod_tipo_telefone")
	private TipoTelefone tipoTelefone;
	
	private String numero;
	
	private String ddd;

	public ClienteTelefone(Long codigo, Cliente cliente, TipoTelefone tipoTelefone, String numero, String ddd) {
		super();
		this.codigo = codigo;
		this.cliente = cliente;
		this.tipoTelefone = tipoTelefone;
		this.numero = numero;
		this.ddd = ddd;
	}

	public ClienteTelefone() {
		super();
	}
	

}



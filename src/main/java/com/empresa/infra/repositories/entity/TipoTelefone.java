package com.empresa.infra.repositories.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="TB_CLIENTE_TELEFONE")
public class TipoTelefone {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long codigo;
	
	private String descricao;
	
	private int tamanho;

	public TipoTelefone(Long codigo, String descricao, int tamanho) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.tamanho = tamanho;
	}

	public TipoTelefone() {
		super();
	}

}

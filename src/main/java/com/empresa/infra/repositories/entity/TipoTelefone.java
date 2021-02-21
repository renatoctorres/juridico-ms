package com.empresa.infra.repositories.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name="TB_TIPO_TELEFONE")
@Data
@EqualsAndHashCode(callSuper = false)
public class TipoTelefone extends BaseEntity{

	private static final long serialVersionUID = 1L;

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

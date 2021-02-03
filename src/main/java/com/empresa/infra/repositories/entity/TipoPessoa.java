package com.empresa.infra.repositories.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="TB_TIPO_PESSOA")
public class TipoPessoa {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long codigo;
	
	private String descricao;
	
	public TipoPessoa(Long codigo, String descricao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public TipoPessoa() {
		super();
	}

	
}

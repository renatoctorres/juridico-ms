package com.empresa.infra.repositories.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="TB_TIPO_LOGRADOURO")
public class TipoLogradouro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long codigo;
	
	private String descricao;
	
	private String sigla;

	public TipoLogradouro(Long codigo, String descricao, String sigla) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.sigla = sigla;
	}

	public TipoLogradouro() {
		super();
	}
		
}

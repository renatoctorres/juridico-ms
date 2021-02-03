package com.empresa.core.model;

import lombok.Data;

@Data
public class TipoLogradouroDTO {

	private Long codigo;
	
	private String descricao;
	
	private String sigla;

	public TipoLogradouroDTO(Long codigo, String descricao, String sigla) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.sigla = sigla;
	}
	
	

}

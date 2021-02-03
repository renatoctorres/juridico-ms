package com.empresa.core.model;

import lombok.Data;

@Data
public class TipoPessoaDTO {

	private Long codigo;
	
	private String descricao;
	
	public TipoPessoaDTO(Long codigo, String descricao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
}

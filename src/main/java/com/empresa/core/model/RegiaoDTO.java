package com.empresa.core.model;

import lombok.Data;

@Data
public class RegiaoDTO {
	
	Long codigo;
	String descricao;
	
	public RegiaoDTO(Long codigo, String descricao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
	}

}

package com.empresa.core.model;

import lombok.Data;

@Data
public class TipoEnderecoDTO {
	

	private Long codigo;
	
	private String descricao;

	public TipoEnderecoDTO(Long codigo, String descricao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	

}

package com.empresa.core.model;

import lombok.Data;

@Data
public class TipoTelefoneDTO {
	
	private Long codigo;
	
	private String descricao;
	
	private int tamanho;

	public TipoTelefoneDTO(Long codigo, String descricao, int tamanho) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.tamanho = tamanho;
	}


}

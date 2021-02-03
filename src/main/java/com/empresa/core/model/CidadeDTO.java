package com.empresa.core.model;

import lombok.Data;

@Data
public class CidadeDTO {
	
	Long codigo;
	EstadoDTO estadoDTO;
	String descricao;
	
	public CidadeDTO(Long codigo, EstadoDTO estadoDTO, String descricao) {
		super();
		this.codigo = codigo;
		this.estadoDTO = estadoDTO;
		this.descricao = descricao;
	}
	
	

}

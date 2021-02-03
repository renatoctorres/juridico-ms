package com.empresa.core.model;

import lombok.Data;

@Data
public class EstadoDTO {
	
	Long codigo;
	RegiaoDTO regiaoDTO;
	String descricao;
	String uF;
	
	public EstadoDTO(Long codigo, RegiaoDTO regiaoDTO, String descricao, String uF) {
		super();
		this.codigo = codigo;
		this.regiaoDTO = regiaoDTO;
		this.descricao = descricao;
		this.uF = uF;
	}
	
}

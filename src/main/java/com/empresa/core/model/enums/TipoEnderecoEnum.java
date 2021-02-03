package com.empresa.core.model.enums;


public enum TipoEnderecoEnum {

	PRINCIPAL(1L,"Principal"),
	SECUNDÁRIO(2L,"Secundário");
	
	private Long codigo;
	private String descricao;
	
	
	TipoEnderecoEnum(Long codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
		
	}


}

package com.empresa.core.model.enums;


public enum TipoPessoaEnum {
	
	JURIDICA(1L,"Pessoa Jurídica"),
	FISICA(2L,"Pessoa Física");
	
	private Long codigo;
	
	private String descricao;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	TipoPessoaEnum(Long codigo, String descricao) {
	
	}
	

}

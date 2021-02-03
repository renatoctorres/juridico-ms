package com.empresa.core.model.cliente;

import java.util.Date;

import com.empresa.core.model.TipoPessoaDTO;

import lombok.Data;

@Data
public class ClienteDTO {
	
	Long codigo;
	
	TipoPessoaDTO tipoPessoaDTO;
    
	Date dataAtualizacao;
    
	Date dataCadastro;
    
	String observacoes;
	
	
	public ClienteDTO(Long codigo, TipoPessoaDTO tipoPessoaDTO, Date dataAtualizacao, Date dataCadastro, String observacoes) {
		super();
		this.codigo = codigo;
		this.tipoPessoaDTO = tipoPessoaDTO;
		this.dataAtualizacao = dataAtualizacao;
		this.dataCadastro = dataCadastro;
		this.observacoes = observacoes;
	}


}

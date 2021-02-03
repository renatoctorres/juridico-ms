package com.empresa.infra.configuration.converter;

import com.empresa.core.model.TipoPessoaDTO;
import com.empresa.infra.repositories.entity.TipoPessoa;

public class TipoPessoaConverter extends Converter<TipoPessoaDTO, TipoPessoa>{

	public TipoPessoaConverter() {
		super( tipoPessoaDTO -> new TipoPessoa( tipoPessoaDTO.getCodigo(),
				                                tipoPessoaDTO.getDescricao()),
										 				
				tipoPessoa   -> new TipoPessoaDTO ( tipoPessoa.getCodigo(),
													tipoPessoa.getDescricao()
										      
		));	
	
		
	}
	

}



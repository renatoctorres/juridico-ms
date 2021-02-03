package com.empresa.core.model.processo;

import java.util.Date;

import com.empresa.core.model.CidadeDTO;
import com.empresa.core.model.tribunal.ComarcaDTO;
import com.empresa.core.model.tribunal.ForoDTO;
import com.empresa.core.model.tribunal.SubSecaoDTO;
import com.empresa.core.model.tribunal.VaraDTO;

import lombok.Data;

@Data
public class ProcessoDTO {
	
	Long codigo;
	
	String numero;
	
	String assunto;
	
	StatusProcessoDTO statusProcessoDTO;
	
	CondicaoProcessoDTO condicaoProcessoDTO;
    
	Date dataAtualizacao;
    
	Date dataCadastro;
	
	Date dataDistribuicao;
	
	Date dataEncerramento;
    
	String observacoes;
	
	SubSecaoDTO subSecaoDTO;
	
	CidadeDTO cidadeDTO;
	
	ComarcaDTO comarcaDTO;
	
	ForoDTO foroDTO;
	
	VaraDTO varaDTO;
	



}

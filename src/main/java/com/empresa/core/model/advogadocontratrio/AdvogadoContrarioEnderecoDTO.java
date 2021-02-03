package com.empresa.core.model.advogadocontratrio;

import com.empresa.core.model.CidadeDTO;
import com.empresa.core.model.TipoEnderecoDTO;
import com.empresa.core.model.TipoLogradouroDTO;
import com.empresa.core.model.processo.ProcessoDTO;

import lombok.Data;

@Data
public class AdvogadoContrarioEnderecoDTO {
	
	private Long codigo;
	private ProcessoDTO processoDTO;
	private TipoEnderecoDTO tipoEnderecoDTO;
	private String cep;
	private TipoLogradouroDTO tipoLogradouroDTO;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private CidadeDTO cidadeDTO;

}

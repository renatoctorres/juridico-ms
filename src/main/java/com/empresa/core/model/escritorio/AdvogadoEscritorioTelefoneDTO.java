package com.empresa.core.model.escritorio;

import com.empresa.core.model.TipoTelefoneDTO;
import com.empresa.core.model.processo.ProcessoDTO;

import lombok.Data;

@Data
public class AdvogadoEscritorioTelefoneDTO {
	
	private Long codigo;
	private ProcessoDTO processoDTO;
	private TipoTelefoneDTO tipoTelefoneDTO;
	private String numero;
	private String ddd;

}

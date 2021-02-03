package com.empresa.core.model.processo;

import com.empresa.core.model.advogadocontratrio.AdvogadoContrarioDTO;

import lombok.Data;

@Data
public class AdvogadoContrarioProcessoDTO {
	
	private Long codigo;
    private ProcessoDTO processoDTO;
    private AdvogadoContrarioDTO advogadoContrarioDTO;


}

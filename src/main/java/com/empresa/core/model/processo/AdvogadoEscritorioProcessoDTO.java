package com.empresa.core.model.processo;

import com.empresa.core.model.escritorio.AdvogadoEscritorioDTO;

import lombok.Data;

@Data
public class AdvogadoEscritorioProcessoDTO {
	
	private Long codigo;
    private ProcessoDTO processoDTO;
    private AdvogadoEscritorioDTO advogadoEscritorioDTO;

}

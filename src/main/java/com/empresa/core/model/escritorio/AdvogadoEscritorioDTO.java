package com.empresa.core.model.escritorio;

import com.empresa.core.model.AdvogadoDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class AdvogadoEscritorioDTO extends AdvogadoDTO{
	
	EscritorioDTO escritorioDTO;


}

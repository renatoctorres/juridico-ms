package com.empresa.core.model.tribunal;

import lombok.Data;

@Data
public class RegiaoSeccionalDTO {
	
	Long codigo;
	
	String descricao;
	
	String numero;
	
	TribunalDTO tribunalDTO;

}

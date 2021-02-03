package com.empresa.core.model.tribunal;

import lombok.Data;

@Data
public class SubSecaoDTO {
	
	Long codigo;
	
	String descricao;
	
	SecaoDTO secaoDTO;
	

}

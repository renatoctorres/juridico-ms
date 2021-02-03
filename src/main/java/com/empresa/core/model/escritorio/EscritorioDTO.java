package com.empresa.core.model.escritorio;

import lombok.Data;

@Data
public class EscritorioDTO {
	
	private Long codigo;
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private String descricao;

}

package com.empresa.core.model;

import lombok.Data;

@Data
public class AdvogadoDTO{
	
	private Long codigo;
	private String oab;
	private String oabUF;
    private String nome;
    private String apelido;
    private String email;
    private String rgNumero;
    private String rgOrgaoEmissor;
	private String rgUf;
    private String tituloEleitor;
    private String cpf;
 

}

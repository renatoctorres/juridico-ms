package com.empresa.core.model.acesso;

import java.util.Date;

import lombok.Data;

@Data
public class UsuarioDTO {
	
	Long codigo;
	
	String nome;
	
	Date dataCadastro;
	
	PerfilUsuarioDTO perfilUsuarioDTO;

}

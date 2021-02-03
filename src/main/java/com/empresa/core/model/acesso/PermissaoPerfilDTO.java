package com.empresa.core.model.acesso;

import lombok.Data;

@Data
public class PermissaoPerfilDTO {

	Long codigo;
	String descricao;
	PermissaoDTO permissaoDTO;
	PerfilUsuarioDTO perfilUsuarioDTO;
	
}

package com.empresa.core.model.acesso;

import lombok.Data;

@Data
public class PermissaoUsuarioDTO {
	
	Long codigo;
	String descricao;
	PermissaoDTO permissaoDTO;
	UsuarioDTO usuarioDTO;

}

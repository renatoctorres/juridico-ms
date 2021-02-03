package com.empresa.core.model.cliente;

import com.empresa.core.model.TipoTelefoneDTO;

import lombok.Data;

@Data
public class ClienteTelefoneDTO {
	
	private Long codigo;
	private ClienteDTO clienteDTO;
	private TipoTelefoneDTO tipoTelefoneDTO;
	private String numero;
	private String ddd;
	
	public ClienteTelefoneDTO(Long codigo, ClienteDTO clienteDTO, TipoTelefoneDTO tipoTelefoneDTO, String numero,
			String ddd) {
		super();
		this.codigo = codigo;
		this.clienteDTO = clienteDTO;
		this.tipoTelefoneDTO = tipoTelefoneDTO;
		this.numero = numero;
		this.ddd = ddd;
	}
	



	

}

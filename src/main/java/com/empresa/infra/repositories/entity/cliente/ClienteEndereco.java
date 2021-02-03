package com.empresa.infra.repositories.entity.cliente;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.empresa.infra.repositories.entity.Cidade;
import com.empresa.infra.repositories.entity.TipoEndereco;
import com.empresa.infra.repositories.entity.TipoLogradouro;
import lombok.Data;

@Data
@Entity
@Table(name="TB_CLIENTE_ENDERECO")
public class ClienteEndereco {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long codigo;
	
	@OneToOne
	@JoinColumn(name="cod_cliente")
	private Cliente cliente;
	
	@OneToOne
	@JoinColumn(name="cod_tipo_endereco")
	private TipoEndereco tipoEndereco;
	
	private String cep;
	
	@OneToOne
	@JoinColumn(name="cod_tipo_logradouro")
	private TipoLogradouro tipoLogradouro;
	
	private String logradouro;
	
	private String numero;
	
	private String complemento;
	
	private String bairro;
	
	@OneToOne
	@JoinColumn(name="cod_cidade")
	private Cidade cidade;

	public ClienteEndereco(Long codigo, Cliente cliente, TipoEndereco tipoEndereco, String cep,
			TipoLogradouro tipoLogradouro, String logradouro, String numero, String complemento, String bairro,
			Cidade cidade) {
		super();
		this.codigo = codigo;
		this.cliente = cliente;
		this.tipoEndereco = tipoEndereco;
		this.cep = cep;
		this.tipoLogradouro = tipoLogradouro;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
	}

	public ClienteEndereco() {
		super();
	}
	
}

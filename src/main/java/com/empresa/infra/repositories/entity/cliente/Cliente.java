package com.empresa.infra.repositories.entity.cliente;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.empresa.infra.repositories.entity.TipoPessoa;
import lombok.Data;

@Data
@Entity
@Table(name="TB_CLIENTE")
public class Cliente {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long codigo;
	
	@OneToOne
	@JoinColumn(name="cod_tipo_pessoa")
	TipoPessoa tipoPessoa;
	
    Date dataAtualizacao;
    
    Date dataCadastro;
    
    String observacoes;
    
	public Cliente(Long codigo, TipoPessoa tipoPessoa, Date dataAtualizacao, Date dataCadastro, String observacoes) {
		super();
		this.codigo = codigo;
		this.tipoPessoa = tipoPessoa;
		this.dataAtualizacao = dataAtualizacao;
		this.dataCadastro = dataCadastro;
		this.observacoes = observacoes;
	}

	public Cliente() {
		super();
	}

}

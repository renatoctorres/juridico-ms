package com.empresa.infra.repositories.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="TB_ESTADO")
public class Estado {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long codigo;
	
	@ManyToOne
	@JoinColumn(name="cod_regiao")
	Regiao regiao;
	
	String descricao;
	
	String uF;

	public Estado(Long codigo, Regiao regiao, String descricao, String uF) {
		super();
		this.codigo = codigo;
		this.regiao = regiao;
		this.descricao = descricao;
		this.uF = uF;
	}

	public Estado() {
		super();
	}
	
	
	
}

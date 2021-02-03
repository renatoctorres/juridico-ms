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
@Table(name="TB_CIDADE")
public class Cidade {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long codigo;
	
	@ManyToOne
	@JoinColumn(name="cod_estado")
	Estado estado;
	
	String descricao;

	public Cidade(Long codigo, Estado estado, String descricao) {
		super();
		this.codigo = codigo;
		this.estado = estado;
		this.descricao = descricao;
	}

	public Cidade() {
		super();
	}
	
	

}

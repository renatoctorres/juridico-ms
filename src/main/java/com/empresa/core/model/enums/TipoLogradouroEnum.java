package com.empresa.core.model.enums;

import java.util.Arrays;
import java.util.List;

public enum TipoLogradouroEnum {
	
	ACESSO("AC", "Acesso","Ac"),  
	AEROPORTO("AER", "Aeroporto","Aer"),
	ALAMEDA("AL", "Alameda","Al"),
	AREA("AREA", "Área","Área"),
	ASSENTAMENTO("ASS", "Assentamento","Ass"),
	AVENIDA("AV", "Avenida","Av"),
	BALNEÁRIO("BAL", "Balneário","Bal"),
	BECO("BC", "Beco","Bc"),
	CAMINHO("CAM", "Caminho","Cam"),
	CAMPO("CAMPO", "Campo","Cmp"),
	COLONIA("COL", "Colônia","Col"),
	COMUNIDADE("", "Comunidade","Com"),
	CORREDOR("COR", "Corredor","Cor"),
	DESVIO("DV", "Desvio","Dv"),
	ESCADA("ESC", "Escada","Esc"),
	ESQUINA("ESQ", "Esquina","Esq"),
	ESTRADA("EST", "Estrada","Est"),
	ESTACAO("ETA", "Estação","Eta"),
	ESTANCIA("ETN", "Estância","Etn"),
	FAZENDA("FAZ", "Fazenda","Faz"),
	GALERIA("GAL", "Galeria","Gal"),
	GRANJA("GRJ", "Granja","Grj"),
	HIPODROMO("HPD", "Hipódromo","Hpd"),
	ILHA("ILH", "Ilha","Ilh"),
	JARDIM("JD", "Jardim","Jd"),
	LARGO("LG", "Largo","Lg"),
	LAGOA("LGA", "Lagoa","Lga"),
	LINHA("LI", "Linha","Li"),
	LOCALIDADE("LOC", "Localidade","Loc"),
	LOTEAMENTO("LOT", "Loteamento","Lot"),
	MERCADO("MERC", "Mercado","Merc"),
	PASSARELA("PASSA", "Passarela","Passa"),
	PASSEIO("PAS", "Passeio","Pas"),
	PRACA("PC", "Praça","Pc"),
	PRARQUE("PRQ", "Parque","Pq"),
	QUADRA("QD", "Quadra","Qd"),
	QUARTEL("QTL", "Quartel","Qtl"),
	RODOVIARIA("RDV", "Rodoviária","Rdv"),
	RODOVIA("ROD", "Rodovia","Rod"),
	RUA("RUA", "Rua","R"),
	SUPERQUADRA("SQD", "Super quadra","Sqd"),
	TRAVESSA("TV", "Travessa","Tv"),
	VIADUTO("VD", "Viaduto","Vd"),
	VIA("VIA", "Via","Via"),
	VIELA("VIELA", "Viela","Viela"),
	VILA("VL", "Vila","Vl");
	
	private String siglaUpperCase;
	private String descricao;
	private String sigla;
	
	private TipoLogradouroEnum(String siglaUpperCase, String descricao, String sigla) {
		this.siglaUpperCase = siglaUpperCase;
		this.descricao = descricao;
		this.sigla = sigla;
	}
	
	public static List<TipoLogradouroEnum> listarTiposLogradouro(){
		List<TipoLogradouroEnum> lista = Arrays.asList(TipoLogradouroEnum.values());
		return lista;
	}

	


}

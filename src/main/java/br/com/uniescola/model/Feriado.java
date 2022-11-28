package br.com.uniescola.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Feriado {
	
	@Id
	@GeneratedValue
	Date dataFeriado;
	int descricao;

	public Date getDataFeriado() {
		return dataFeriado;
	}

	public void setDataFeriado(Date dataFeriado) {
		this.dataFeriado = dataFeriado;
	}

	public int getDescricao() {
		return descricao;
	}

	public void setDescricao(int descricao) {
		this.descricao = descricao;
	}

}

package br.com.uniescola.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.OneToOne;

@Embeddable
public class DiaAulaId implements Serializable {

	private static final long serialVersionUID = 1L;
	Date dataAula;
	@OneToOne
	Curso curso;

	public Date getDataAula() {
		return dataAula;
	}

	public void setDataAula(Date dataAula) {
		this.dataAula = dataAula;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
}

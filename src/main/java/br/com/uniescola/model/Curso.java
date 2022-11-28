package br.com.uniescola.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Curso {

	@Id
	@GeneratedValue
	Long id;
	String nomeCurso;
	float ChAula;
	float ChTotal;
	String turno;
	float valor;
	int seg;
	int ter;
	int qua;
	int qui;
	int sex;
	int sab;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public float getChAula() {
		return ChAula;
	}

	public void setChAula(float chAula) {
		ChAula = chAula;
	}

	public float getChTotal() {
		return ChTotal;
	}

	public void setChTotal(float chTotal) {
		ChTotal = chTotal;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getSeg() {
		return seg;
	}

	public void setSeg(int seg) {
		this.seg = seg;
	}

	public int getTer() {
		return ter;
	}

	public void setTer(int ter) {
		this.ter = ter;
	}

	public int getQua() {
		return qua;
	}

	public void setQua(int qua) {
		this.qua = qua;
	}

	public int getQui() {
		return qui;
	}

	public void setQui(int qui) {
		this.qui = qui;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getSab() {
		return sab;
	}

	public void setSab(int sab) {
		this.sab = sab;
	}

}

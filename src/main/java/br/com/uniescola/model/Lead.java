package br.com.uniescola.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Lead {
	@Id
	@GeneratedValue
	int id;
	String nome;
	String telefone;
	Date dataCadastro;
	String status_2;
	Date dataNovoEncontro;
	String observacao;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getStatus_2() {
		return status_2;
	}

	public void setStatus_2(String status_2) {
		this.status_2 = status_2;
	}

	public Date getDataNovoEncontro() {
		return dataNovoEncontro;
	}

	public void setDataNovoEncontro(Date dataNovoEncontro) {
		this.dataNovoEncontro = dataNovoEncontro;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
}

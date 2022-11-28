package br.com.uniescola.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class DiaAula {
	
	@EmbeddedId
	DiaAulaId aulaId;

	public DiaAulaId getAulaId() {
		return aulaId;
	}

	public void setAulaId(DiaAulaId aulaId) {
		this.aulaId = aulaId;
	}
	
}

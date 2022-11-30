package br.com.uniescola.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.uniescola.model.Feriado;
import br.com.uniescola.model.Lead;
import br.com.uniescola.repository.LeadRepository;

@Service
public class LeadService {
	@Autowired
	private LeadRepository leadRepository;

	public List<Lead> getAll() {
		List<Lead> lLeads = new ArrayList<Lead>();
		leadRepository.findAll().forEach(lLeads::add);
		return lLeads;
	}

	public Lead novaLead(Lead lead) {
		return leadRepository.save(lead);
	}

	public Lead atualizarLead(Lead lead) {
		return novaLead(lead);
	}

	public void deleteLead(Long id) {
		leadRepository.deleteById(id);
	}

	public Feriado novoFeriado(Feriado feriado) {
		// TODO Auto-generated method stub
		return null;
	}

}

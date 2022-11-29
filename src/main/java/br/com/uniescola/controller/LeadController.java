package br.com.uniescola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.uniescola.model.Lead;
import br.com.uniescola.model.Turma;
import br.com.uniescola.service.LeadService;

@RestController
@RequestMapping("/lead")
public class LeadController {
	@Autowired

	private LeadService leadService;

	@RequestMapping("")
	public List<Lead> getALL() {
		return leadService.getAll();
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public Lead novaLead(@RequestBody Lead lead) {
		return leadService.novaLead(lead);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteTurma(@PathVariable("id") Long id) {
		leadService.deleteLead(id);
	}

}

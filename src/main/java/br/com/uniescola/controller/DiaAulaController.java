package br.com.uniescola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.uniescola.model.DiaAula;
import br.com.uniescola.service.DiaAulaService;

@RestController
@RequestMapping("/dia-aula")
public class DiaAulaController {
	@Autowired

	private DiaAulaService diaAulaService;

	@RequestMapping("")
	public List<DiaAula> getALL() {
		return diaAulaService.getAll();
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public DiaAula novaLead(@RequestBody DiaAula diaAula) {
		return diaAulaService.novoFeriado(diaAula);
	}

	/*@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteTurma(@PathVariable("id") Long id) {
		leadService.deleteLead(id);
	}*/

}

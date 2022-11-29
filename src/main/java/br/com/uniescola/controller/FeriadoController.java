package br.com.uniescola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.uniescola.model.Feriado;
import br.com.uniescola.service.FeriadoService;

@RestController
@RequestMapping("/feriado")
public class FeriadoController {
	@Autowired

	private FeriadoService feriadoService;

	@RequestMapping("")
	public List<Feriado> getALL() {
		return feriadoService.getAll();
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public Feriado novaLead(@RequestBody Feriado feriado) {
		return feriadoService.novoFeriado(feriado);
	}

	/*@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteTurma(@PathVariable("id") Long id) {
		feriadoService.deleteLead(id);
	}*/

}

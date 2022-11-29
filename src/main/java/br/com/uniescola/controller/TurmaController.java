package br.com.uniescola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.uniescola.model.Turma;
import br.com.uniescola.service.TurmaService;

@RestController
@RequestMapping("/turma")
public class TurmaController {
	@Autowired

	private TurmaService turmaService;

	@RequestMapping("")
	public List<Turma> getAll() {
		return turmaService.getAll();
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public Turma novaTurma(@RequestBody Turma turma) {
		return turmaService.novaTurma(turma);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteTurma(@PathVariable("id") Long id) {
		turmaService.deleteTurma(id);
	}

}

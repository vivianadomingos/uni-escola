package br.com.uniescola.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.uniescola.model.Turma;
import br.com.uniescola.repository.TurmaRepository;

@Service
public class TurmaService {

	@Autowired
	private TurmaRepository turmaRepository;

	public List<Turma> getAll() {
		List<Turma> lTurmas = new ArrayList<Turma>();
		turmaRepository.findAll().forEach(lTurmas::add);
		return lTurmas;
	}

	public Turma novaTurma(Turma turma) {
		return turmaRepository.save(turma);
	}

	public Turma atualizarTurma(Turma turma) {
		return novaTurma(turma);
	}

	public void deleteTurma(Long id) {
		turmaRepository.deleteById(id);
	}

}

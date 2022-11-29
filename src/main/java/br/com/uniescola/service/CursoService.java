package br.com.uniescola.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.uniescola.exceptions.CursoNaoExisteException;
import br.com.uniescola.model.Curso;
import br.com.uniescola.repository.CursoRepository;

@Service
public class CursoService {

	@Autowired
	private CursoRepository cursoRepository;

	public List<Curso> getAll() {
		List<Curso> lCurso = new ArrayList<>();
		cursoRepository.findAll().forEach(lCurso::add);
		return lCurso;
	}

	public Curso novoCurso(Curso curso) {
		return cursoRepository.save(curso);
	}

	public Curso atualizarCurso(Curso curso) throws CursoNaoExisteException {
		if (curso.getId() != null) {
			return novoCurso(curso);
		} else {
			throw new CursoNaoExisteException("A tentativa de atualização falhou, o curso informado não existe.");
		}
	}

	public void deleteCurso(Long id) {
		cursoRepository.deleteById(id);
	}
}

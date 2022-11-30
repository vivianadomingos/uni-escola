package br.com.uniescola.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.uniescola.exceptions.UsuarioNaoExisteException;
import br.com.uniescola.model.Aluno;
import br.com.uniescola.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository alunoRepository;

	public List<Aluno> getAll() {
		List<Aluno> lAluno = new ArrayList<>();
		alunoRepository.findAll().forEach(lAluno::add);
		return lAluno;
	}

	public Aluno novoAluno(Aluno aluno) {
		return alunoRepository.save(aluno);
	}

	public Aluno atualizarAluno(Aluno aluno) throws UsuarioNaoExisteException {
		if (aluno.getId() != null) {
			return novoAluno(aluno);
		} else {
			throw new UsuarioNaoExisteException("A tentativa de atualização falhou, o usuário informado não existe.");
		}
	}

	public void deleteAluno(Integer id) {
		alunoRepository.deleteById(id);
	}
}

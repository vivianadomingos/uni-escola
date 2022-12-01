package br.com.uniescola.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.uniescola.model.Aluno;

public interface AlunoRepository extends CrudRepository<Aluno, Long> {

}

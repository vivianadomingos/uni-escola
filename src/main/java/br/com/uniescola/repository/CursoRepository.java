package br.com.uniescola.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.uniescola.model.Curso;

public interface CursoRepository extends CrudRepository<Curso, Long> {

}

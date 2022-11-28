package br.com.uniescola.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.uniescola.model.Professor;

public interface ProfessorRepository extends CrudRepository<Professor, Long> {}

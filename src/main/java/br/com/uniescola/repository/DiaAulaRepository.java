package br.com.uniescola.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.uniescola.model.DiaAula;
import br.com.uniescola.model.DiaAulaId;

public interface DiaAulaRepository extends CrudRepository<DiaAula,DiaAulaId > {

}

package br.com.uniescola.repository;

import java.util.Date;

import org.springframework.data.repository.CrudRepository;

import br.com.uniescola.model.Feriado;

public interface FeriadoRepository extends CrudRepository<Feriado, Date> {

}

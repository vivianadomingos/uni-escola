package br.com.uniescola.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.uniescola.model.Lead;



public interface LeadRepository extends CrudRepository<Lead, Long> {

}

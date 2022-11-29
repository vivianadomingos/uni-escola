package br.com.uniescola.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.uniescola.model.Feriado;
import br.com.uniescola.model.Lead;
import br.com.uniescola.repository.FeriadoRepository;

@Service
public class FeriadoService {
	@Autowired
	private FeriadoRepository feriadoRepository;

	public List<Lead> getAll() {
		List<Lead> lFeriado = new ArrayList<Lead>();
		feriadoRepository.findAll().forEach(lFeriado::add);
		return lFeriado;
	}

	public Feriado novoFeriado(Feriado feriado) {
		return feriadoRepository.save(feriado);
	}

public Feriado atualizarFeriado(Feriado feriado {
	return novoFeriado(feriado);
}

	public void deleteLead(Long id) {
		feriadoRepository.deleteById(id);
	}

}

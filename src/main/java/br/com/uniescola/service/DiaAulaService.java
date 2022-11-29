package br.com.uniescola.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.uniescola.model.DiaAula;
import br.com.uniescola.repository.DiaAulaRepository;

@Service
public class DiaAulaService {
	@Autowired
	private DiaAulaRepository diaAulaRepository;

	public List<DiaAula> getAll() {
		List<DiaAula> lDiaAula = new ArrayList<DiaAula>();
		diaAulaRepository.findAll().forEach(lDiaAula::add);
		return lDiaAula;
	}

	public DiaAula novoFeriado(DiaAula diaAula) {
		return diaAulaRepository.save(diaAula);
	}

public DiaAula atualizarFeriado(DiaAula diaAula) {
	return novoFeriado(diaAula);
}

	/*public void deleteLead(Long id) {
		feriadoRepository.deleteById(id);
	}*/

}

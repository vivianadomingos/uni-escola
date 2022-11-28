package br.com.uniescola.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.uniescola.exceptions.UsuarioNaoExisteException;
import br.com.uniescola.model.Professor;
import br.com.uniescola.repository.ProfessorRepository;

@Service
public class ProfessorService {
    
    @Autowired
    private ProfessorRepository professorRepository;

    public List<Professor> getAll() {
        List<Professor> lProfessors = new ArrayList<>();
        professorRepository.findAll().forEach(lProfessors::add);
        return lProfessors;
    }

    public Professor novoProfessor(Professor professor) {
        return professorRepository.save(professor);
    }

    public Professor atualizarProfessor(Professor professor) throws UsuarioNaoExisteException {
        if (professor.getId() != null) {
            return novoProfessor(professor);
        } else {
            throw new UsuarioNaoExisteException("A tentativa de atualização falhou, o usuário informado não existe.");
        }
    }

    public void deleteProfessor(Long id) {
        professorRepository.deleteById(id);
    }
}

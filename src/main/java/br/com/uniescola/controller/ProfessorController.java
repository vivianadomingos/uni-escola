package br.com.uniescola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.uniescola.exceptions.UsuarioNaoExisteException;
import br.com.uniescola.model.Professor;
import br.com.uniescola.service.ProfessorService;

@RestController
@RequestMapping("/professor")
public class ProfessorController {
    
    @Autowired
    private ProfessorService professorService;

    @RequestMapping("")
    public List<Professor> getAll() {
        return professorService.getAll();
    }
    
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Professor novoProfessor(@RequestBody Professor professor) {
        return professorService.novoProfessor(professor);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Professor editProfessor(@RequestBody Professor professor) throws UsuarioNaoExisteException {
        return professorService.atualizarProfessor(professor);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteProfessor(@PathVariable("id") Long id) {
        professorService.deleteProfessor(id);
    }
    
    @ExceptionHandler(value= {UsuarioNaoExisteException.class})
    public ResponseEntity<String> handleException(Exception e){
            
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
}

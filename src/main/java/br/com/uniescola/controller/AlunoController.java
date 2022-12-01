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
import br.com.uniescola.model.Aluno;
import br.com.uniescola.service.AlunoService;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
    
    @Autowired
    private AlunoService alunoService;

    @RequestMapping("")
    public List<Aluno> getAll() {
        return alunoService.getAll();
    }
    
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Aluno novoAluno(@RequestBody Aluno aluno) {
        return alunoService.novoAluno(aluno);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Aluno editAluno(@RequestBody Aluno aluno) throws UsuarioNaoExisteException {
        return alunoService.atualizarAluno(aluno);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteAluno(@PathVariable("id") Long id) {
    	alunoService.deleteAluno(id);
    }
    
    @ExceptionHandler(value= {UsuarioNaoExisteException.class})
    public ResponseEntity<String> handleException(Exception e){
            
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
}

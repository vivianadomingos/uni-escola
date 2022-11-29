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

import br.com.uniescola.exceptions.CursoNaoExisteException;
import br.com.uniescola.model.Curso;
import br.com.uniescola.service.CursoService;

@RestController
@RequestMapping("/curso")
public class CursoController {
    
    @Autowired
    private CursoService cursoService;

    @RequestMapping("")
    public List<Curso> getAll() {
        return cursoService.getAll();
    }
    
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Curso novoCurso(@RequestBody Curso curso) {
        return cursoService.novoCurso(curso);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Curso editAluno(@RequestBody Curso curso) throws CursoNaoExisteException {
        return cursoService.atualizarCurso(curso);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteAluno(@PathVariable("id") Long id) {
    	cursoService.deleteCurso(id);
    }
    
    @ExceptionHandler(value= {CursoNaoExisteException.class})
    public ResponseEntity<String> handleException(Exception e){
            
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
    
}

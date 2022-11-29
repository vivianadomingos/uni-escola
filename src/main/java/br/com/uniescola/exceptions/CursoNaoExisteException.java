package br.com.uniescola.exceptions;

public class CursoNaoExisteException extends Exception {

    private static final long serialVersionUID = -1689787069482410700L;

	public CursoNaoExisteException(String cause) {
        super(cause);
    }
    
}

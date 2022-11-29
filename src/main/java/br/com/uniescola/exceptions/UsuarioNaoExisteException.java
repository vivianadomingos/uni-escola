package br.com.uniescola.exceptions;

public class UsuarioNaoExisteException extends Exception {

    private static final long serialVersionUID = -1689787069482410700L;

	public UsuarioNaoExisteException(String cause) {
        super(cause);
    }
    
}

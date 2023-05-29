package it.prova.triage_be.web.exception;

public class PazienteNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public PazienteNotFoundException(String message) {
		super(message);
	}
}

package it.prova.triage_be.web.exception;

public class PazienteNonDimessoException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public PazienteNonDimessoException(String message) {
		super(message);
	}
}

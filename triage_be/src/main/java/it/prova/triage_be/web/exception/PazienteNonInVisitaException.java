package it.prova.triage_be.web.exception;

public class PazienteNonInVisitaException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public PazienteNonInVisitaException(String message) {
		super(message);
	}
}

package it.prova.triage_be.web.exception;

public class UtenteNotAuthorizedException extends RuntimeException {
	public UtenteNotAuthorizedException(String message) {
		super(message);
	}
}

package it.prova.triage_be.web.exception;

public class UtenteNotFoundException extends RuntimeException {
	public UtenteNotFoundException(String message) {
		super(message);
	}
}

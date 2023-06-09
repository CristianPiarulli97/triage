package it.prova.triage_be.service;

import java.util.List;

import it.prova.triage_be.model.Paziente;

public interface PazienteService {
	public List<Paziente> listAllPazienti();

	public Paziente caricaSingoloPaziente(Long id);

	public Paziente aggiorna(Paziente pazienteInstance);

	public Paziente inserisciNuovo(Paziente pazienteInstance);

	public void rimuovi(Paziente pazienteInstance);
	
	public void impostaCodiceDottore(String codiceFiscalePaziente, String codiceDottore);

	public void ricovera(Long id);
	
	public void dimetti(Long id);


}

package it.prova.triage_be.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.prova.triage_be.model.Ruolo;
import it.prova.triage_be.repository.ruolo.RuoloRepository;

@Transactional(readOnly = true)
@Service
public class RuoloServiceImpl implements RuoloService {
	
	@Autowired
	RuoloRepository ruoloRepository;

	
	@Override
	public List<Ruolo> listAll() {
		return (List<Ruolo>) ruoloRepository.findAll();

	}
	

	@Override
	public Ruolo caricaSingoloElemento(Long id) {
		return ruoloRepository.findById(id).orElse(null);

	}
	
	@Transactional
	@Override
	public void aggiorna(Ruolo ruoloInstance) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	@Override
	public void inserisciNuovo(Ruolo ruoloInstance) {
		ruoloRepository.save(ruoloInstance);

		
	}
	@Transactional
	@Override
	public void rimuovi(Long idToRemove) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public Ruolo cercaPerDescrizioneECodice(String descrizione, String codice) {
		return ruoloRepository.findByDescrizioneAndCodice(descrizione, codice);

	}
	
	

}

package it.prova.triage_be.repository.paziente;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import it.prova.triage_be.model.Paziente;

public interface PazienteRepository extends CrudRepository<Paziente, Long> {
	Optional<Paziente> findByCodiceFiscale (String codiceFiscale);

}

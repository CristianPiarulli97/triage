package it.prova.triage_be;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.prova.triage_be.model.Paziente;
import it.prova.triage_be.model.Ruolo;
import it.prova.triage_be.model.StatoPaziente;
import it.prova.triage_be.model.StatoUtente;
import it.prova.triage_be.model.Utente;
import it.prova.triage_be.service.PazienteService;
import it.prova.triage_be.service.RuoloService;
import it.prova.triage_be.service.UtenteService;
import java.time.LocalDate;

@SpringBootApplication
public class TriageBeApplication implements CommandLineRunner{

	@Autowired
	private RuoloService ruoloServiceInstance;
	@Autowired
	private UtenteService utenteServiceInstance;
	@Autowired
	private PazienteService pazienteServiceInstance;

	public static void main(String[] args) {
		SpringApplication.run(TriageBeApplication.class, args);
	}

	public void run(String... args) throws Exception {

		// inserimento ruoli
		if (ruoloServiceInstance.cercaPerDescrizioneECodice("Administrator", Ruolo.ROLE_ADMIN) == null) {
			ruoloServiceInstance
					.inserisciNuovo(Ruolo.builder().descrizione("Administrator").codice(Ruolo.ROLE_ADMIN).build());
		}

		if (ruoloServiceInstance.cercaPerDescrizioneECodice("Sub Operator", Ruolo.ROLE_SUB_OPERATOR) == null) {
			ruoloServiceInstance.inserisciNuovo(
					Ruolo.builder().descrizione("Sub Operator").codice(Ruolo.ROLE_SUB_OPERATOR).build());
		}
		
	
		// inserimento utenti

		if (utenteServiceInstance.findByUsername("admin") == null) {
			Utente admin = Utente.builder().username("admin").password("admin").nome("Pinko").cognome("Pallino")
					.dataRegistrazione(LocalDate.now()).stato(StatoUtente.CREATO).build();
			admin.getRuoli().add(ruoloServiceInstance.cercaPerDescrizioneECodice("Administrator", Ruolo.ROLE_ADMIN));
			utenteServiceInstance.inserisciNuovo(admin);

			// l'inserimento avviene come created ma io voglio attivarlo

			utenteServiceInstance.changeUserAbilitation(admin.getId());
			
		}

		
		if (utenteServiceInstance.findByUsername("suboperator") == null) {
			Utente subOperator = Utente.builder().username("suboperator").password("suboperator").nome("Antonio")
					.cognome("Verdi").dataRegistrazione(LocalDate.now()).stato(StatoUtente.CREATO).build();
			subOperator.getRuoli()
					.add(ruoloServiceInstance.cercaPerDescrizioneECodice("Sub Operator", Ruolo.ROLE_SUB_OPERATOR));
			utenteServiceInstance.inserisciNuovo(subOperator);
			// l'inserimento avviene come created ma io voglio attivarlo
			utenteServiceInstance.changeUserAbilitation(subOperator.getId());
		}

		Paziente paziente1 = Paziente.builder().nome("Mario").cognome("Rossi").stato(StatoPaziente.IN_ATTESA_VISITA).build();
		pazienteServiceInstance.inserisciNuovo(paziente1);
		
	}
}

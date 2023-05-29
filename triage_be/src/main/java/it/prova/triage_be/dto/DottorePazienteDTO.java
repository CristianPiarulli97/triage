package it.prova.triage_be.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DottorePazienteDTO {
	
	private String codiceDottore;
	private String codFiscalePazienteAttualmenteInVisita;

}

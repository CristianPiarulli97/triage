package it.prova.dottori_be.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "dottore")
public class Dottore {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private Long id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "cognome")
	private String cognome;
	@Column(name = "codicedottore")
	private String codiceDottore;
	@Column(name = "codfiscalepazienteattualmenteinvisita")
	private String codFiscalePazienteAttualmenteInVisita;
	@Column(name = "invisita")
	private Boolean inVisita;
	@Column(name = "inservizio")
	private Boolean inServizio;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCodiceDottore() {
		return codiceDottore;
	}
	public void setCodiceDottore(String codiceDottore) {
		this.codiceDottore = codiceDottore;
	}
	public String getCodFiscalePazienteAttualmenteInVisita() {
		return codFiscalePazienteAttualmenteInVisita;
	}
	public void setCodFiscalePazienteAttualmenteInVisita(String codFiscalePazienteAttualmenteInVisita) {
		this.codFiscalePazienteAttualmenteInVisita = codFiscalePazienteAttualmenteInVisita;
	}
	public Boolean getInVisita() {
		return inVisita;
	}
	public void setInVisita(Boolean inVisita) {
		this.inVisita = inVisita;
	}
	public Boolean getInServizio() {
		return inServizio;
	}
	public void setInServizio(Boolean inServizio) {
		this.inServizio = inServizio;
	}
	
	
	
}
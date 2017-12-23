package model;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Scheda {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	/*
	 * generated value or preassigned for id ???;
	 */

	private String indirizzo_invio_documentazione;
	private String corrispondente;
	private Integer anno;
	private String campagna;
	private Boolean laboratorio_informatica;
	private Boolean LIM;
	private Boolean ADSL;
	private String sistema_conferenza;
	private Boolean lezione_propedeutica;
	private Date data_creazione;

	/*
	 * Classi che partecipano alle attività della scheda
	 */
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "partecipa", joinColumns = { @JoinColumn(name = "id", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "cid", table = "Classe", nullable = false, updatable = false) })
	private Set<Classe> classe = new HashSet<Classe>(0);;

	/*
	 * Eventi collegati alla scheda
	 */
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "programma", joinColumns = { @JoinColumn(name = "id", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "eid", table = "Evento", nullable = false, updatable = false) })
	private Set<Evento> evento = new HashSet<Evento>(0);

	/*
	 * Scuola associata alla scheda di attività
	 */
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "codmec")
	private Scuola associa;

	/*
	 * Scheda può non avere un referente al momento della creazione
	 */
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "rid")
	private Referente referente_tecnico;

	/*
	 * Scheda deve avere un insegnante delegato a seguire le attività
	 */
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "iid")
	private Insegnante segue;

	@Override
	public String toString() {
		return "Scheda [id=" + id + ", indirizzo_invio_documentazione="
				+ indirizzo_invio_documentazione + ", corrispondente="
				+ corrispondente + ", anno=" + anno + ", campagna=" + campagna
				+ ", laboratorio_informatica=" + laboratorio_informatica
				+ ", LIM=" + LIM + ", ADSL=" + ADSL + ", sistema_conferenza="
				+ sistema_conferenza + ", lezione_propedeutica="
				+ lezione_propedeutica + ", associa=" + associa
				+ ", referente_tecnico=" + referente_tecnico + ", segue="
				+ segue + "]";
	}

	public Set<Classe> getClasse() {
		return classe;
	}

	public void setClasse(Set<Classe> classe) {
		this.classe = classe;
	}

	public Set<Evento> getEvento() {
		return evento;
	}

	public void setEvento(Set<Evento> evento) {
		this.evento = evento;
	}

	public Scuola getAssocia() {
		return associa;
	}

	public void setAssocia(Scuola scu) {
		this.associa = scu;
		scu.addScheda(this);
	}

	public Referente getReferente_tecnico() {
		return referente_tecnico;
	}

	public void setReferente_tecnico(Referente referente_tecnico) {
		this.referente_tecnico = referente_tecnico;
		referente_tecnico.addSchede(this);
	}

	public Insegnante getSegue() {
		return segue;
	}

	public void setSegue(Insegnante segue) {
		this.segue = segue;
		segue.addSchede(this);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIndirizzo_invio_documentazione() {
		return indirizzo_invio_documentazione;
	}

	public void setIndirizzo_invio_documentazione(
			String indirizzo_invio_documentazione) {
		this.indirizzo_invio_documentazione = indirizzo_invio_documentazione;
	}

	public String getCorrispondente() {
		return corrispondente;
	}

	public void setCorrispondente(String corrispondente) {
		this.corrispondente = corrispondente;
	}

	public Integer getAnno() {
		return anno;
	}

	public void setAnno(Integer anno) {
		this.anno = anno;
	}

	public String getCampagna() {
		return campagna;
	}

	public void setCampagna(String campagna) {
		this.campagna = campagna;
	}

	public Boolean getLaboratorio_informatica() {
		return laboratorio_informatica;
	}

	public void setLaboratorio_informatica(Boolean laboratorio_informatica) {
		this.laboratorio_informatica = laboratorio_informatica;
	}

	public Boolean getLIM() {
		return LIM;
	}

	public void setLIM(Boolean lIM) {
		LIM = lIM;
	}

	public Boolean getADSL() {
		return ADSL;
	}

	public void setADSL(Boolean aDSL) {
		ADSL = aDSL;
	}

	public String getSistema_conferenza() {
		return sistema_conferenza;
	}

	public void setSistema_conferenza(String sistema_conferenza) {
		this.sistema_conferenza = sistema_conferenza;
	}

	public Boolean getLezione_propedeutica() {
		return lezione_propedeutica;
	}

	public void setLezione_propedeutica(Boolean lezione_propedeutica) {
		this.lezione_propedeutica = lezione_propedeutica;
	}

	public Date getData_creazione() {
		return data_creazione;
	}

	public void setData_creazione(Date data_creazione) {
		this.data_creazione = data_creazione;
	}

	public Scheda() {
	}

	public Scheda(int id) {
		this.id = id;
	}

}

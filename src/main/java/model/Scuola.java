package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import model.Scheda;
import model.Tipo;

@Entity
public class Scuola {

	@Id
	private String codmec;
	private String nome;
	private String citta;
	private String indirizzo;
	private String provincia;
	private String localita;
	private String CAP;
	private String telefono;
	private String fax;
	private String mail;
	private String web;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tipologia", nullable = false, updatable = false)
	private Tipo tipo;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "associa", orphanRemoval = true)
	private Set<Scheda> schede = new HashSet<Scheda>(0);

	public Set<Scheda> removeScheda(Scheda sch) {

		return this.schede;
	}

	public void addScheda(Scheda sch) {
		if (sch != null)
			this.schede.add(sch);
	}

	public Set<Scheda> getSchede() {
		return schede;
	}

	public void setSchede(Set<Scheda> schede) {
		this.schede = schede;
	}

	@Override
	public String toString() {
		return "Scuola [codmec=" + codmec + ", nome=" + nome + ", citta="
				+ citta + ", indirizzo=" + indirizzo + ", provincia="
				+ provincia + ", localita=" + localita + ", CAP=" + CAP
				+ ", telefono=" + telefono + ", fax=" + fax + ", mail=" + mail
				+ ", web=" + web + ", tipo=" + tipo + "]";
	}

	public String getCodmec() {
		return codmec;
	}

	public void setCodmec(String codmec) {
		this.codmec = codmec;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getLocalita() {
		return localita;
	}

	public void setLocalita(String localita) {
		this.localita = localita;
	}

	public String getCAP() {
		return CAP;
	}

	public void setCAP(String cAP) {
		CAP = cAP;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Scuola() {
		// TODO Auto-generated constructor stub
	}

	public Scuola(Scheda sch) {
		if (sch != null) {
			this.schede.add(sch);
		}
	}
}

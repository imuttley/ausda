package model;

import java.util.Arrays;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Persona {

	private String nome;
	private String cognome;
	private String telefono;
	private String mail;
	private byte[] immagine;

	// @OneToMany
	// private Set<Scheda>

	@Override
	public String toString() {
		return "Persona [ nome=" + nome + ", cognome=" + cognome
				+ ", telefono=" + telefono + ", mail=" + mail + ", immagine="
				+ Arrays.toString(immagine) + "]";
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public byte[] getImmagine() {
		return immagine;
	}

	public void setImmagine(byte[] immagine) {
		this.immagine = immagine;
	}

	public Persona() {
		// TODO Auto-generated constructor stub
	}

}

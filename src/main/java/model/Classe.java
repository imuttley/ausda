package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import model.Scheda;

@Entity
public class Classe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cid;
	private Integer livello;
	private String sezione;
	private Integer numero_alunni;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "classe")
	private Set<Scheda> scheda = new HashSet<Scheda>(0);;

	@Override
	public String toString() {
		return "Classe [id=" + cid + ", livello=" + livello + ", sezione="
				+ sezione + ", numero_alunni=" + numero_alunni + "]";
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer id) {
		this.cid = id;
	}

	public Integer getLivello() {
		return livello;
	}

	public void setLivello(Integer livello) {
		this.livello = livello;
	}

	public String getSezione() {
		return sezione;
	}

	public void setSezione(String sezione) {
		this.sezione = sezione;
	}

	public Integer getNumero_alunni() {
		return numero_alunni;
	}

	public void setNumero_alunni(Integer numero_alunni) {
		this.numero_alunni = numero_alunni;
	}

	public Classe() {
		// TODO Auto-generated constructor stub
	}

}

package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Insegnante extends Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer iid;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "segue", orphanRemoval = true)
	private Set<Scheda> schede = new HashSet<Scheda>(0);

	@Embedded
	private Materia corso;

	public void addSchede(Scheda scheda) {
		this.schede.add(scheda);
	}

	public void removeSchede(Scheda scheda) {
		this.schede.remove(scheda);
	}

	public Set<Scheda> getSchede() {
		return this.schede;
	}

	public Insegnante() {
		super();
	}

	public Insegnante(int i) {
		super();
		this.iid = i;
	}

	public Integer getIid() {
		return iid;
	}

	public void setIid(Integer iid) {
		this.iid = iid;
	}

	public Materia getCorso() {
		return corso;
	}

	public void setCorso(Materia corso) {
		this.corso = corso;
	}

}

package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Referente extends Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer rid;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "referente_tecnico", orphanRemoval = true)
	private Set<Scheda> schede = new HashSet<Scheda>(0);

	public void addSchede(Scheda scheda) {
		this.schede.add(scheda);
	}

	public void removeSchede(Scheda scheda) {
		this.schede.remove(scheda);
	}

	public Set<Scheda> getSchede() {
		return schede;
	}

	public void setSchede(Set<Scheda> schede) {
		this.schede = schede;
	}

	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public Referente() {
		super();
	}

	public Referente(int i) {
		super();
		this.rid = i;
	}
}

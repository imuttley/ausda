package model;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eid;
	private Date Data_ora;
	private String note;
	private String tipo_evento;
	private String base;
	private String media_evento;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "evento")
	private Set<Scheda> scheda=new HashSet<Scheda>(0);;
	
	
	@Override
	public String toString() {
		return "Evento [id=" + eid + ", Data_ora=" + Data_ora + ", note=" + note
				+ ", tipo_evento=" + tipo_evento + ", base=" + base
				+ ", media_evento=" + media_evento + "]";
	}

	public Set<Scheda> getScheda() {
		return scheda;
	}
	public void setScheda(Set<Scheda> scheda) {
		this.scheda = scheda;
	}
	
	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer id) {
		this.eid = id;
	}

	public Date getData_ora() {
		return Data_ora;
	}

	public void setData_ora(Date data_ora) {
		Data_ora = data_ora;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getTipo_evento() {
		return tipo_evento;
	}

	public void setTipo_evento(String tipo_evento) {
		this.tipo_evento = tipo_evento;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base1) {
		base = base1;
	}

	public String getMedia_evento() {
		return media_evento;
	}

	public void setMedia_evento(String media_evento) {
		this.media_evento = media_evento;
	}

	public Evento() {
		// TODO Auto-generated constructor stub
	}

}

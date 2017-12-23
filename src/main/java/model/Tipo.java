package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tipo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer tid;
	private String tipologia;

	@Override
	public String toString() {
		return "Tipo [tipologia=" + tipologia + "]";
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	public Tipo() {
		// TODO Auto-generated constructor stub
	}

	public Tipo(String tipo) {
		this.tipologia = tipo;
	}

}

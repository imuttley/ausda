package model;

import javax.persistence.Embeddable;

@Embeddable
public class Materia {

	// @Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	// @Id
	private String nome_corso;

	// @ManyToOne
	// private Categoria ci;
	// private Insegnante insegnante;

	public Materia() {
		// TODO Auto-generated constructor stub
	}

	public Materia(String nome_corso) {
		this.nome_corso = nome_corso;
	}

	public String getNome_corso() {
		return nome_corso;
	}

	public void setNome_corso(String nome_corso) {
		this.nome_corso = nome_corso;
	}

	@Override
	public String toString() {
		return "Materia [nome_corso=" + nome_corso + "]";
	}

}

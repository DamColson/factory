package factory.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "competence")
public class Competence {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	
	@Transient
	private Set<Matiere> matieres;
	@Transient
	private Set<Formateur> formateurs;
	
	public Competence() {
		
	}
	
	public Competence(Integer id, String nom) {
		this.id = id;
		this.nom = nom;
	}
	
	public Competence(Integer id, String nom, Set<Matiere> matieres, Set<Formateur> formateurs) {
		this.id = id;
		this.nom = nom;
		this.matieres = matieres;
		this.formateurs = formateurs;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Set<Matiere> getMatieres() {
		return matieres;
	}

	public void setMatieres(Set<Matiere> matieres) {
		this.matieres = matieres;
	}

	public Set<Formateur> getFormateurs() {
		return formateurs;
	}

	public void setFormateurs(Set<Formateur> formateurs) {
		this.formateurs = formateurs;
	}
	
	
}

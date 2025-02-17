package factory.model;

import java.time.LocalDate;

public class Bloc {
	private Integer id;
	private LocalDate dateDebut;
	private LocalDate dateFin;
	private String code;
	private String objectif;
	private Formateur formateur;
	private Matiere matiere;
	private Salle salle;

	public Bloc() {

	}

	public Bloc(Integer id, LocalDate dateDebut, LocalDate dateFin, String code, String objectif, Formateur formateur,
			Matiere matiere, Salle salle) {
		this.id = id;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.code = code;
		this.objectif = objectif;
		this.formateur = formateur;
		this.matiere = matiere;
		this.salle = salle;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	public LocalDate getDateFin() {
		return dateFin;
	}

	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getObjectif() {
		return objectif;
	}

	public void setObjectif(String objectif) {
		this.objectif = objectif;
	}

	public Formateur getFormateur() {
		return formateur;
	}

	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}
	
}

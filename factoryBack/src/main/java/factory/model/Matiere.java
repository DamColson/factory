package factory.model;

import java.util.Set;

public class Matiere {

	private Integer id;
	private String titre;
	private String contenu;
	private Set<Competence> competences;
	
	public Matiere() {
	}

	public Matiere(Integer id, String titre, String contenu, Set<Competence> competences) {
		this.id = id;
		this.titre = titre;
		this.contenu = contenu;
		this.competences = competences;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public Set<Competence> getCompetences() {
		return competences;
	}

	public void setCompetences(Set<Competence> competences) {
		this.competences = competences;
	}
	
	
}

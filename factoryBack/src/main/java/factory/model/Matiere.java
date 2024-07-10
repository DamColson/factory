package factory.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="matiere")
public class Matiere {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String titre;
	
	private String contenu;
	
	@Transient
	private Set<Competence> competences;
	
	@OneToMany(mappedBy="matiere")
	private Set<Bloc> blocs;
	
	public Matiere() {
	}

	public Matiere(Integer id, String titre, String contenu, Set<Competence> competences) {
		this.id = id;
		this.titre = titre;
		this.contenu = contenu;
		this.competences = competences;
	}

	
	
	public Matiere(Integer id, String titre, String contenu, Set<Competence> competences, Set<Bloc> blocs) {
		this.id = id;
		this.titre = titre;
		this.contenu = contenu;
		this.competences = competences;
		this.blocs = blocs;
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

	public Set<Bloc> getBlocs() {
		return blocs;
	}

	public void setBlocs(Set<Bloc> blocs) {
		this.blocs = blocs;
	}
	
	
}

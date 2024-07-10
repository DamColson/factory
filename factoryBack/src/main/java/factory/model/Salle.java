package factory.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "salle")
public class Salle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotBlank
	private String libelle;
	
	private Integer superficie;
	@Transient
	private Set<Ordinateur> ordinateurs;
	@Transient
	private VideoProjecteur videoProjecteurs;
	
	public Salle() {
	}

	public Salle(String libelle, Integer id, Integer superficie, Set<Ordinateur> ordinateurs,
			VideoProjecteur videoProjecteurs) {
		this.libelle = libelle;
		this.id = id;
		this.superficie = superficie;
		this.ordinateurs = ordinateurs;
		this.videoProjecteurs = videoProjecteurs;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSuperficie() {
		return superficie;
	}

	public void setSuperficie(Integer superficie) {
		this.superficie = superficie;
	}

	public Set<Ordinateur> getOrdinateurs() {
		return ordinateurs;
	}

	public void setOrdinateurs(Set<Ordinateur> ordinateurs) {
		this.ordinateurs = ordinateurs;
	}

	public VideoProjecteur getVideoProjecteurs() {
		return videoProjecteurs;
	}

	public void setVideoProjecteurs(VideoProjecteur videoProjecteurs) {
		this.videoProjecteurs = videoProjecteurs;
	}

	
	
}

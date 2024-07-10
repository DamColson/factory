package factory.model;

import java.util.Set;

public class Salle {
	private String libelle;
	private Integer id;
	private Integer superficie;
	private Set<Ordinateur> ordinateurs;
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

package factory.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "videoProjecteur")
public class VideoProjecteur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotBlank
	private String libelle;
	@NotBlank
	private String adresseMac;
	@NotBlank
	private String dateAchat;
	@NotBlank
	private Salle emplacement;
	@NotBlank
	private String status;
	
	public VideoProjecteur() {
	}

	public VideoProjecteur(String libelle, String adresseMac, String dateAchat, Salle emplacement, String status,
			Integer id) {
		this.libelle = libelle;
		this.adresseMac = adresseMac;
		this.dateAchat = dateAchat;
		this.emplacement = emplacement;
		this.status = status;
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getAdresseMac() {
		return adresseMac;
	}

	public void setAdresseMac(String adresseMac) {
		this.adresseMac = adresseMac;
	}

	public String getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(String dateAchat) {
		this.dateAchat = dateAchat;
	}

	public Salle getEmplacemeht() {
		return emplacement;
	}

	public void setEmplacemeht(Salle emplacemeht) {
		this.emplacement = emplacemeht;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	
}

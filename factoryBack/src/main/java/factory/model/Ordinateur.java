package factory.model;

public class Ordinateur {
	private String libelle;
	private String adresseMac;
	private String dateAchat;
	private Salle emplacemeht;
	private String status;
	private Integer id;
	private String os;
	
	public Ordinateur() {
	}

	public Ordinateur(String libelle, String adresseMac, String dateAchat, Salle emplacemeht, String status, Integer id,
			String os) {
		this.libelle = libelle;
		this.adresseMac = adresseMac;
		this.dateAchat = dateAchat;
		this.emplacemeht = emplacemeht;
		this.status = status;
		this.id = id;
		this.os = os;
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
		return emplacemeht;
	}

	public void setEmplacemeht(Salle emplacemeht) {
		this.emplacemeht = emplacemeht;
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

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}
	
	
}

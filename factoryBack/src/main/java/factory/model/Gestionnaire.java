package factory.model;

public class Gestionnaire {

	private Integer id;
	private String nom;
	private String prenom;
	private String telelphone;
	private String mail;
	private String password;
	private Ordinateur ordinateur;
	
	public Gestionnaire() {
	}

	public Gestionnaire(Integer id, String nom, String prenom, String telelphone, String mail, String password,
			Ordinateur ordinateur) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.telelphone = telelphone;
		this.mail = mail;
		this.password = password;
		this.ordinateur = ordinateur;
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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTelelphone() {
		return telelphone;
	}

	public void setTelelphone(String telelphone) {
		this.telelphone = telelphone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Ordinateur getOrdinateur() {
		return ordinateur;
	}

	public void setOrdinateur(Ordinateur ordinateur) {
		this.ordinateur = ordinateur;
	}
	
	
}

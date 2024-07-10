package factory.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "technicien")
public class Technicien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    private String nom;
    @NotBlank
    private String prenom;
    @NotBlank
    private String telephone;
    @NotBlank
    private String mail;
    @NotBlank
    private String password;
    @Transient
    private Ordinateur ordinateur;

    public Technicien(){}

    public int getId() {
        return id;
    }

    public Technicien(int id, String nom, String prenom, String telephone, String mail, String password,
            Ordinateur ordinateur) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.mail = mail;
        this.password = password;
        this.ordinateur = ordinateur;
    }

    public void setId(int id) {
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
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

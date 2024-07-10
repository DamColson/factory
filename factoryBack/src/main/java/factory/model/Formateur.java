package factory.model;

import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "formateur")
public class Formateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;
    private String prenom;
    private String telephone;
    private String mail;
    private String password;
    
    @OneToOne(mappedBy = "formateur")
    private Ordinateur ordinateur;
    
    @OneToMany(mappedBy="formateur")
    private List<Bloc> blocs;
    
    @OneToOne(mappedBy="formateur")
    private VideoProjecteur emprunt;
    
    @Transient
    private Set<Competence> competences;

    public Formateur(){}
    

    public Formateur(int id, String nom, String prenom, String telephone, String mail, String password,
            Ordinateur ordinateur, List<Bloc> blocs, VideoProjecteur emprunt, Set<Competence> competences) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.mail = mail;
        this.password = password;
        this.ordinateur = ordinateur;
        this.blocs = blocs;
        this.emprunt = emprunt;
        this.competences = competences;
    }


    public int getId() {
        return id;
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

    public List<Bloc> getBlocs() {
        return blocs;
    }

    public void setBlocs(List<Bloc> blocs) {
        this.blocs = blocs;
    }

    public VideoProjecteur getEmprunt() {
        return emprunt;
    }

    public void setEmprunt(VideoProjecteur emprunt) {
        this.emprunt = emprunt;
    }

    public Set<Competence> getCompetences() {
        return competences;
    }

    public void setCompetences(Set<Competence> competences) {
        this.competences = competences;
    }

    

}

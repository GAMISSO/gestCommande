package entity;

public class Client {
    private String nom;
    private String prenom;
    private int telephone;
    private int id;

    public Client(String nom, String prenom, int telephone, int id) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.id = 1;
    }

    public Client() {}

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

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getId() {
        return id;
    }

    public String toChaine(){
        return "Nom: "+nom + "Prénom " + prenom + "Téléphone: " + telephone + "identifiant " + id;
    }
}

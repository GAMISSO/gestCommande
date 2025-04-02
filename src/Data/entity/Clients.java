package Data.entity;

public class Clients {
    private String nom;
    private String prenom;
    private String telephone;
    private int id;

    public Clients(String nom, String prenom, String telephone, int id) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.id = 1;
    }

    public Clients() {}

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Clients{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", telephone=" + telephone +
                ", id=" + id +
                '}';
    }
}

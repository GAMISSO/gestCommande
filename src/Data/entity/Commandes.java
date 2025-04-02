package Data.entity;

import java.time.LocalDate;

public class Commandes {
    private int id;
    private LocalDate date;
    private double montant;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    @Override
    public String toString() {
        return "Commandes{" +
                "id=" + id +
                ", date=" + date +
                ", montant=" + montant +
                '}';
    }
}

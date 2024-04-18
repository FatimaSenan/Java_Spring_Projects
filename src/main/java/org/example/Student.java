package org.example;

public class Student {
    private int id;
    private String Nom;
    private String Prenom;
    private String Filiere;

   //Getters
    public int getId() {
        return id;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }
    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public void setFiliere(String filiere) {
        Filiere = filiere;
    }

    public String getFiliere() {
        return Filiere;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Nom='" + Nom + '\'' +
                ", Prenom='" + Prenom + '\'' +
                ", Filiere='" + Filiere + '\'' +
                '}';
    }
}

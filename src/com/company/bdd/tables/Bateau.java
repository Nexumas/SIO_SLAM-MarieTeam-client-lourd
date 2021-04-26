package com.company.bdd.tables;

public class Bateau {

    private int idBateau;
    private String nom;
    private double largeur;
    private double longueur;

    public int getIdBateau(){
        return this.idBateau;
    }

    public String getNom(){
        return this.nom;
    }

    public double getLargeur(){
        return this.largeur;
    }

    public double getLongueur(){
        return this.longueur;
    }
}

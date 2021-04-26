package com.company.bdd.tables;

import java.util.ArrayList;

public class BateauVoyageur extends Bateau {

    private int idBateau;
    private int vitesse;
    private ArrayList<Equipement> lesEquipements = new ArrayList<>();

    public int getIdBateau(){
        return this.idBateau;
    }

    public int getVitesse(){
        return this.vitesse;
    }

    public ArrayList<Equipement> getLesEquipements(){
        return this.lesEquipements;
    }
}

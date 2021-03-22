package com.company;
import java.util.List;

public class BateauVoyageur extends Bateau {

    private int vitesseBatVoy;

    private List<Equipement> lesEquipements;

    private String imageBatVoy;

    public BateauVoyageur(int id, String nom, float longueur, float largeur, int vitesse, List<Equipement> desEquip, String image){
        super(id, nom, longueur, largeur);
        this.vitesseBatVoy = vitesse;
        this.lesEquipements = desEquip;
        this.imageBatVoy = image;
    }

    public int getVitesseBatVoy() {
        return vitesseBatVoy;
    }

    public List<Equipement> getLesEquipements(){
        return lesEquipements;
    }

    public String getImage(){
        return imageBatVoy;
    }

    public String toString(){
        String sBat = "";
        sBat += "Nom du bateau : "+this.nomBat+"\n";
        sBat += "Longueur : "+this.longueurBat+"\n";
        sBat += "Largeur : "+this.largeurBat+"\n";
        sBat += "Vitesse : "+this.vitesseBatVoy+"\n";
        sBat += "Liste des équipements : \n";
        for(Equipement unEquip : this.lesEquipements){
            sBat += " - "+unEquip.getLibEquip()+"\n";
        }

        return sBat;
    }
}

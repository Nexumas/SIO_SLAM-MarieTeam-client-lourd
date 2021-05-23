package com.company;

import com.company.bdd.Connexion;
import com.itextpdf.text.DocumentException;

import java.io.FileNotFoundException;
import java.sql.ResultSet;


public class Main {

    public static void main(String[] args){

        Fenetre f = new Fenetre();

        String nom = "Posologie";
        String req = "SELECT bateau.idbateau, nom, largeur, longueur, vitesse FROM bateau, bateauvoyageur " +
                "where bateau.idbateau = bateauvoyageur.idbateau";

        try{
            Connexion conn = new Connexion();
            conn.querySelect(req);

            Pdf pdf = new Pdf(1, "test");


        }catch(Exception e){
            e.printStackTrace();
        }


    }

}


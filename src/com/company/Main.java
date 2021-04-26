package com.company;

import com.company.bdd.Connexion;
import com.itextpdf.text.DocumentException;

import java.io.FileNotFoundException;
import java.sql.ResultSet;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, DocumentException{

        new Fenetre();

        try {
            Connexion conn = new Connexion();
            ResultSet r = conn.querySelect("SELECT * FROM utilisateur");
            while(r.next()){
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Pdf pdf = new Pdf(1, "test");

    }

}


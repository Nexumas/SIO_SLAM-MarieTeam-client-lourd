package com.company;

import com.company.bdd.Connexion;
import com.itextpdf.text.DocumentException;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, DocumentException{

        new Fenetre();

        try {
            Connexion conn = new Connexion();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Pdf pdf = new Pdf(1, "test");

    }

}

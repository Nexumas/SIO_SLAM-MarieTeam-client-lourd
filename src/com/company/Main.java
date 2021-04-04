package com.company;

import com.company.bdd.Connexion;
import com.itextpdf.text.DocumentException;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, DocumentException {

        Fenetre fen = new Fenetre();
        fen.afficher_fenetre();

        Connexion conn = new Connexion();

        Pdf pdf = new Pdf(1, "test");

    }
}

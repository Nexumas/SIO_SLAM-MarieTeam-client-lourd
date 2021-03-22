package com.company;

import com.company.bdd.Connexion;

public class Main {

    public static void main(String[] args) {

        Fenetre fen = new Fenetre();
        fen.afficher_fenetre();

        Connexion conn = new Connexion();

    }
}

package com.company.bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {

    public Connexion(){

        /* Connexion à la base de données */
        String url = "jdbc:mysql://localhost:3306/bdd_sdzee";
        String utilisateur = "root";
        String motDePasse = "";
        Connection connexion = null;
        try {
            connexion = DriverManager.getConnection( url, utilisateur, motDePasse );
            System.out.println("ok");
            /* Ici, nous placerons nos requêtes vers la BDD */
            /* ... */

        } catch ( SQLException e ) {
            /* Gérer les éventuelles erreurs ici */
        } finally {
            if ( connexion != null )
                try {
                    /* Fermeture de la connexion */
                    connexion.close();
                } catch ( SQLException ignore ) {
                    /* Si une erreur survient lors de la fermeture, il suffit de l'ignorer. */
                }
        }

    }
}

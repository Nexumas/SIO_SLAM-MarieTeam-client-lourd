package com.company.bdd;

import com.company.Bateau;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class Gestionnaire {

    private ArrayList<Bateau> batList = new ArrayList<>();

    //execute une requête SELECT avec la requete donné en paramètre et retourne le résultat
    public ResultSet selectListeBateaux(){

        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/marieteam", "root", "");
            JOptionPane.showMessageDialog(null, "connexion ok");
            Statement st = conn.createStatement();
            ResultSet r = st.executeQuery("SELECT bateau.idbateau, nom, largeur, longueur, vitesse FROM bateau, bateauvoyageur " +
                    "where bateau.idbateau = bateauvoyageur.idbateau");
            while (r.next()){

                //test
                System.out.println(r.getString(1)+" " + r.getString(2)
                        +" "+r.getString(3)+" "+r.getString(4)
                        +" "+ r.getString(5));

                Bateau bat = new Bateau(Integer.parseInt(r.getString(1))
                        , r.getString(2)
                        , Float.parseFloat(r.getString(3))
                        , Float.parseFloat(r.getString(4)));

                batList.add(bat);

            }

            return r;

        }catch (SQLException | ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "connexion impossible : " + ex.getMessage());
        }

        finally {
            try{
                if(conn != null){
                    conn.close();
                }
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }
        System.exit(0);

        return null;
    }

    public ResultSet selectBateauVoyageur(){

        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/marieteam", "root", "");
            JOptionPane.showMessageDialog(null, "connexion ok");
            Statement st = conn.createStatement();
            ResultSet r = st.executeQuery("SELECT bateau.idbateau, nom, largeur, longueur, vitesse, idequipement, libelle " +
                    "FROM bateau, bateauvoyageur, equipement " +
                    "where bateau.idbateau = bateauvoyageur.idbateau and bateau.idbateau = equipement.idbateau");
            while (r.next()){

                //test
                System.out.println(r.getString(1)+" " + r.getString(2)
                        +" "+r.getString(3)+" "+r.getString(4)
                        +" "+ r.getString(5)+" "+ r.getString(6)+" "+ r.getString(7));

            }

            return r;

        }catch (SQLException | ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "connexion impossible : " + ex.getMessage());
        }

        finally {
            try{
                if(conn != null){
                    conn.close();
                }
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }
        System.exit(0);

        return null;
    }

    public ArrayList<Bateau> getBatList(){
        return this.batList;
    }
}

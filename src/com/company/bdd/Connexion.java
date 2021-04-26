package com.company.bdd;

import javax.swing.*;
import java.sql.*;

public class Connexion {

    //execute une requête SELECT avec la requete donné en paramètre et retourne le résultat
    public ResultSet querySelect(String req) throws Exception {

        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/marieteam", "root", "");
            JOptionPane.showMessageDialog(null, "connexion ok");
            Statement st = conn.createStatement();
            ResultSet r = st.executeQuery(req);

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
}

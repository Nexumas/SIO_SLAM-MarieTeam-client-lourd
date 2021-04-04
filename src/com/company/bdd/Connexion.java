package com.company.bdd;

import javax.swing.*;
import java.sql.*;

public class Connexion {

    public Connexion() throws Exception {

        Connection conn;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(p.getServeurBD()+"xelfi", p.getNomUtilisateur(), p.getMotDePasse());
            JOptionPane.showMessageDialog(null, "connexion ok");
            Statement st = conn.createStatement();
            String req = "INSERT INTO client VALUES (1, 'robert', 'dupont', 1, '2020/12/3')";
            st.executeUpdate(req);
            String req2 = "SELECT * FROM client";
            ResultSet r = st.executeQuery(req2);

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

    }
}

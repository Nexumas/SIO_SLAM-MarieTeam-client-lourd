package com.company;

import com.company.bdd.Gestionnaire;
import com.itextpdf.text.DocumentException;

import java.io.FileNotFoundException;
import java.sql.ResultSet;


public class Main {

    public static void main(String[] args){

        Fenetre f = new Fenetre();

        try{
            Gestionnaire conn = new Gestionnaire();
            conn.selectListeBateaux();

            Pdf pdf = new Pdf(1, "test");


        }catch(Exception e){
            e.printStackTrace();
        }


    }

}


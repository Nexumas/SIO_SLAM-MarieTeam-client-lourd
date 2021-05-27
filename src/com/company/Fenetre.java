package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import com.company.bdd.Gestionnaire;

public class Fenetre extends JFrame implements ActionListener {

    private TextField titre = new TextField();
    private JComboBox selecBat = new JComboBox();
    private JButton modifier = new JButton();
    private JButton generer = new JButton();
    private JButton terminer = new JButton();

    //lance l'affichage de la fenêtre et des composants graphiques
    Fenetre(){
        try{
            FenInit();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private void FenInit(){
        this.getContentPane().setLayout(null);

        this.pack();
        this.setVisible(true);
        this.setSize(800,600);
        this.setTitle("MarieTeam");

        titre.setBounds(350, 520, 100, 20);
        titre.setText("MarieTeam");

        selecBat.setBounds(200,480,400, 40);
        initListBat();
        this.add(selecBat);

        generer.setBounds(250, 120, 300, 80);
        generer.setText("GENERER");
        modifier.setBounds(75, 20, 300, 80);
        modifier.setText("MODIFIER");
        terminer.setBounds(425, 20, 300, 80);
        terminer.setText("TERMINER");

    }

    private void initListBat(){
        //Initialise la liste des bateaux disponibles dans la comboBox selecBat
        Gestionnaire forBatList = new Gestionnaire();
        ArrayList<Bateau> lesBateaux = forBatList.getBatList();
        for(Bateau unBateau : lesBateaux){
            selecBat.addItem(unBateau.getNomBat());
        }
    }




    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

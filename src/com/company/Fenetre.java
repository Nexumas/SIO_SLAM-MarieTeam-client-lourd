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
    private Gestionnaire bdd = new Gestionnaire();
    private BateauVoyageur batVoy;

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

        titre.setBounds(350, 0, 100, 20);
        titre.setText("MarieTeam");

        selecBat.setBounds(625,250,300, 40);
        this.add(selecBat);
        initListBat();

        generer.setBounds(300, 700, 150, 50);
        generer.setText("GENERER");
        modifier.setBounds(700, 700, 150, 50);
        modifier.setText("MODIFIER");
        terminer.setBounds(1100, 700, 150, 50);
        terminer.setText("TERMINER");
        this.add(generer);
        this.add(terminer);
        this.add(modifier);

        selecBat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bdd.selectBateauVoyageur(selecBat.getSelectedItem().toString());
                batVoy = bdd.getBateauvoyageur();
                System.out.println(batVoy.getNomBat() + " " + batVoy.getVitesseBatVoy());
            }
        });

    }

    private void initListBat(){
        //Initialise la liste des bateaux disponibles dans la comboBox selecBat
        Gestionnaire forBatList = new Gestionnaire();
        this.bdd.selectListeBateaux();
        for(Bateau unBateau : this.bdd.getBatList()){
            selecBat.addItem(unBateau.getNomBat());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

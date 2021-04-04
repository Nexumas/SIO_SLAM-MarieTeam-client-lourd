package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame implements ActionListener {

    private Boolean creerIsShown;
    private Boolean modifierIsShown;
    //lance l'affichage de la fenêtre et des composants graphiques
    Fenetre(){
        this.setLayout(new FlowLayout());

        radioBoutons();

        this.pack();
        this.setVisible(true);
        this.setSize(800,600);
        this.setTitle("MarieTeam");
        this.creerIsShown = false;
        this.modifierIsShown = false;
    }

    private void texts(){
        TextField chemin = new TextField();
        TextField recherche = new TextField();
        TextField resultat = new TextField();
        TextField listeBatPDF = new TextField();
    }

    //initialisation des radioboutons
    private void radioBoutons(){
        JRadioButton creer = new JRadioButton("creer");
        this.add(creer);

        JRadioButton modifier = new JRadioButton("modifier");
        this.add(modifier);

        ButtonGroup btGroup = new ButtonGroup();
        btGroup.add(creer);
        btGroup.add(modifier);

        creer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                this.afficherCreer();
            }
        });
    }

    private void afficherCreer(){
        if(!(modifierIsShown)){

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

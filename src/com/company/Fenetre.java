package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame implements ActionListener {

    //lance l'affichage de la fenêtre et des composants graphiques
    Fenetre(){
        this.setLayout(new FlowLayout());

        radioBoutons();

        this.pack();
        this.setVisible(true);
        this.setSize(800,600);
        this.setTitle("MarieTeam");
    }

    //initialisation des radioboutons
    private void radioBoutons(){
        JRadioButton creer = new JRadioButton("creer");
        this.add(creer);


        JRadioButton modifier = new JRadioButton("modifier");
        this.add(modifier);
    }

    //evenements composants graphiques
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class Modification extends JFrame implements ActionListener {

    private Boolean creerIsShown;
    private Boolean modifierIsShown;
    private JButton boutonModifier;
    private JButton boutonTerminer;

    //lance l'affichage de la fenêtre et des composants graphiques
    Modification(){
        this.setLayout(new FlowLayout());

        this.pack();
        this.setVisible(true);
        this.setSize(800,600);
        this.setTitle("MarieTeam");
        this.creerIsShown = false;
        this.modifierIsShown = false;
        buildContentPanel();
    }

    private JPanel buildContentPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel Titre = new JLabel("Modification");
        boutonModifier = new JButton("Modifier");
        boutonTerminer = new JButton("Terminer");

        panel.add(boutonModifier);
        panel.add(boutonTerminer);
        panel.add(Titre);

        return panel;
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if(source == boutonModifier){
            //ecrire le code pour effectuer les modifcation.
            System.out.println("Modification Effectuer");
        } else if(source == boutonTerminer){
            //ecrire le code pour retourner sur la page d'accueil.
            System.out.println("Retour sur la page d'accueil");
        }
    }
}

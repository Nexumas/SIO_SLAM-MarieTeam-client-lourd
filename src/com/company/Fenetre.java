package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame implements ActionListener {

    Fenetre(){
        JFrame fenetre = new JFrame();
        fenetre.setSize(800,600);
        fenetre.setTitle("MarieTeam");

        this.setLayout(new FlowLayout());

        JRadioButton creer = new JRadioButton("creer");
        this.add(creer);


        JRadioButton modifier = new JRadioButton();

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

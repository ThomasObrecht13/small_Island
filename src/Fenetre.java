import javax.swing.*;
import java.awt.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame{
    // menu pour la creation d une nouvelle game
    JMenuBar barMenu;
    JButton newGame;
    ControleBouton actionGame;

    public Fenetre() {
        initAtribut();
        creerInterface();
        creerMenu();
        pack();
        setSize(800,800);                    // Fixe la taille par défaut
        setVisible(true);                                // Affiche la fenetre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Gestion de la fermeture
    }


    public void initAtribut() {
        barMenu = new JMenuBar();
        newGame = new JButton("Nouvelle Partie");
        actionGame = new ControleBouton(this);

    }

    public void creerMenu()
    {
        barMenu.add(newGame);
        setJMenuBar(barMenu);
        newGame.addActionListener(actionGame);
    }

    public void creerInterface() {

    }




}

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class FenetreNewGame extends JFrame {

    // Creation des 4 boutons de selection du nombre de joueur
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;

    JPanel panelButton;

    // Creation des champs de text pour que les different joueurs entre leurs noms
    JTextField joueur1;
    JTextField joueur2;
    JTextField joueur3;
    JTextField joueur4;
    JButton butValidate;

    JPanel panJoueur;

    // Creation des boutons de choix de la difficulte
    JButton difficulty1;
    JButton difficulty2;

    JPanel panDificulty;

    ControlBoutonMenu controlBoutonMenu;
    JPanel panFenetre;


    public FenetreNewGame() {
        initAtribut();
        creerInterface();
        creerBouton();
        pack();
        setSize(400,400);                    // Fixe la taille par défaut
        setVisible(true);                                // Affiche la fenetre
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // Gestion de la fermeture
    }


    public void initAtribut() {

        controlBoutonMenu = new ControlBoutonMenu(this);

        // initialisation des boutons joueurs
        button1 = new JButton("Solo");
        button2 = new JButton("2 joueurs");
        button3 = new JButton("3 joueurs");
        button4 = new JButton("4 joueurs");

        panelButton = new JPanel();
        panelButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelButton.add(button1);
        panelButton.add(button2);
        panelButton.add(button3);
        panelButton.add(button4);
        panelButton.setVisible(true);

        // initialisations des champs de texte
        joueur1 = new JTextField();
        joueur1.setSize(50,50);
        joueur2 = new JTextField();
        joueur2.setSize(50,50);
        joueur3 = new JTextField();
        joueur3.setSize(50,50);
        joueur4 = new JTextField();
        joueur4.setSize(50,50);
        butValidate = new JButton("Validate");

        panJoueur = new JPanel();
        panJoueur.setAlignmentX(Component.CENTER_ALIGNMENT);
        panJoueur.add(joueur1);
        panJoueur.add(joueur2);
        panJoueur.add(joueur3);
        panJoueur.add(joueur4);
        panJoueur.add(butValidate);
        panJoueur.setVisible(false);

        // initialisation des bouttons de difficulté
        difficulty1 = new JButton("difficulty level 1");
        difficulty2 = new JButton("difficulty level 2");
        panDificulty = new JPanel();
        panDificulty.add(difficulty1);
        panDificulty.add(difficulty2);
        panDificulty.setAlignmentX(Component.CENTER_ALIGNMENT);
        panDificulty.setVisible(false);

        panFenetre = new JPanel();
        panFenetre.add(panelButton);
        panFenetre.add(panJoueur);
        panFenetre.add(panDificulty);
        panFenetre.setVisible(true);

    }

    public void creerBouton()
    {
        button1.addActionListener(controlBoutonMenu);
        button2.addActionListener(controlBoutonMenu);
        button3.addActionListener(controlBoutonMenu);
        button4.addActionListener(controlBoutonMenu);

        butValidate.addActionListener(controlBoutonMenu);

        difficulty1.addActionListener(controlBoutonMenu);
        difficulty2.addActionListener(controlBoutonMenu);
    }

    public void creerInterface() {

        // ce panel va contenir tout les autres panel visible ou invisible selon leurs états
        panFenetre = new JPanel();
        panFenetre.setLayout(new BoxLayout(panFenetre, BoxLayout.Y_AXIS));

        panFenetre.add(panelButton);
        panFenetre.add(panJoueur);
        panFenetre.add(panDificulty);
        setContentPane(panFenetre);
    }
}

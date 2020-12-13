import java.awt.event.*;
import javax.swing.*;

public class ControleBouton implements ActionListener {
    Fenetre fenetre;
    FenetreSquelette fenetreSquelette;
    public ControleBouton(Fenetre fenetre) {
        this.fenetre=fenetre;
    }

    public ControleBouton(FenetreSquelette fenetreSquelette) {
        this.fenetreSquelette=fenetreSquelette;

    }

    public void actionPerformed(ActionEvent e){
        FenetreNewGame fenetre2 = new FenetreNewGame();
    }

}

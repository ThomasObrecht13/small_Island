import java.awt.event.*;
import javax.swing.*;

public class ControleBouton implements ActionListener {
    Fenetre fenetre;

    public ControleBouton(Fenetre fenetre) {
        this.fenetre=fenetre;
    }

    public void actionPerformed(ActionEvent e){
        FenetreNewGame fenetre2 = new FenetreNewGame();
    }

}

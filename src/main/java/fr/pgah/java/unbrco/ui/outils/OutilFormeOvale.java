package fr.pgah.java.unbrco.ui.outils;

import fr.pgah.java.unbrco.model.Forme;
import fr.pgah.java.unbrco.ui.EditeurDeFormes;

import javax.swing.JButton;
import javax.swing.JComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class OutilFormeOvale extends Outil {

    private Forme formeOvale;

    public OutilFormeOvale(EditeurDeFormes editeur, JComponent parent) {
        super(editeur, parent);
        formeOvale = null;
    }

    @Override
    protected void creerBouton(JComponent parent) {
        bouton = new JButton("Forme Ovale");
        bouton = customiserButton(bouton);
        ajouterAuParent(parent);
    }

    @Override
    protected void ajouterListener() {
        bouton.addActionListener(new OutilFormeOvaleClicHandler());
    }

    private class OutilFormeOvaleClicHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            editeur.setOutilActif(OutilFormeOvale.this);
        }
    }

}
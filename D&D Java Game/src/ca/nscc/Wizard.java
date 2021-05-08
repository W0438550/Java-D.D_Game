package ca.nscc;

import javax.swing.*;
import java.awt.*;

public class Wizard extends Player {
    private ImageIcon wizardPicture;

    public Wizard(String name, int hpPoint, int defence, int agility, int baseAttack, String charDescription){
        super(name, hpPoint, defence, agility, baseAttack, charDescription);
        wizardPicture = new ImageIcon("Image/wizard.jpg");

        //Set image for this Player

    }

    public ImageIcon getWizardPicture() {
        return wizardPicture;
    }

    public void setWizardPic(ImageIcon wizardPic)
    {
        this.wizardPicture = wizardPic;
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "wizardPic=" + wizardPicture +
                '}';
    }
}


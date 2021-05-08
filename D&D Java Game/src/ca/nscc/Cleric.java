package ca.nscc;

import ca.nscc.Player;

import javax.swing.*;
import java.awt.*;


public class Cleric extends Player {
    private ImageIcon ClericPicture;

    public Cleric(String name, int hpPoint, int defence, int agility, int baseAttack,  String charDescription)  {
        super(name, hpPoint, defence, agility, baseAttack, charDescription);
        //ClericPic = new ImageIcon(this.getClass().getResource("/Image/ClericImage.jpg"));
        ClericPicture = new ImageIcon("Image/cleric.jpg");
    }

    public ImageIcon getClericPicture() {
        return ClericPicture;
    }

    public void setClericPicture(ImageIcon clericPicture) {
        ClericPicture = clericPicture;
    }
}


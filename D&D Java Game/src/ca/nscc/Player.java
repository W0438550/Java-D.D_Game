package ca.nscc;

// java libraries
import javax.swing.*;
import java.awt.*;

// attributes for the Player class
public class Player extends Character{

    private String charDescription;

    public Player(String name, int hpPoint, int defence, int agility, int baseAttack, String charDescription) throws HeadlessException {
        super(name, hpPoint, defence, agility, baseAttack); // super method; inherits from character
        this.charDescription = charDescription;
    }

    // getter and setter methods for the attribute
    public String getCharDescription() {
        return charDescription;
    }

    public void setCharDescription(String charDescription) {
        this.charDescription = charDescription;
    }

    // abstract method inherited from character class
    @Override
    public String battleAbility() {
        return "I shall battle till the death!";
    }
}


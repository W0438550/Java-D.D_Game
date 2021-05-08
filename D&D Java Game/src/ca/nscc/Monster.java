package ca.nscc;

// java libraries
import javax.swing.*;
import java.awt.*;

// a monster class that contains the attributes below
public class Monster extends Character {
    private String description;

    // constructor with attributes inherited from character and its own attributes
    public Monster(String name, int hpPoint, int defence, int agility, int baseAttack,  String description) {
        super(name, hpPoint, defence, agility, baseAttack); // super method to inherit attributes from parent class
        this.description = description;
    }

    // getter and setter methods
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

// abstract method inherited from the character class
    @Override
    public String battleAbility() {
        return "I am ready to taste some good fight!";
    }
}


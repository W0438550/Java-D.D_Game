package ca.nscc;

// java libraries
import javax.swing.*;
import java.awt.*;

// an abstract class with the following attributes below; objects cannot be created using this class
public abstract class Character {
    private String name;
    private int hpPoint;
    private int defence;
    private int agility;
    private int baseAttack;

    // constructor that contains the attributes of the class
    public Character(String name, int hpPoint, int defence, int agility, int baseAttack)  {
        this.name = name;
        this.hpPoint = hpPoint;
        this.defence = defence;
        this.agility = agility;
        this.baseAttack = baseAttack;

    }
// getter and setter methods for the class
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getHpPoint() {
        return hpPoint;
    }

    public void setHpPoint(int hpPoint) {
        this.hpPoint = hpPoint;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }

    public abstract String battleAbility();

}



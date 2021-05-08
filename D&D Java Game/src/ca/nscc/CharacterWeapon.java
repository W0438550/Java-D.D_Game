package ca.nscc;

import javax.swing.*;

// character weapon with the attributes
public class CharacterWeapon {
    String WeaponDescription;
    String name;
    int hpPoint;
    int defence;
    int agility;
    int baseAttack;
    ImageIcon image;
    int weight;
    int attackModifier;

    // constructor with the character from the attributes above
    public CharacterWeapon(String weaponDescription, String name, int hpPoint, int defence, int agility, int baseAttack,  int weight, int attackModifier) {
        WeaponDescription = weaponDescription;
        this.name = name;
        this.hpPoint = hpPoint;
        this.defence = defence;
        this.agility = agility;
        this.baseAttack = baseAttack;
        this.image = image;
        this.weight = weight;
        this.attackModifier = attackModifier;
    }

    // getter and setter methods
    public String getWeaponDescription() {
        return WeaponDescription;
    }

    public void setWeaponDescription(String weaponDescription) {
        WeaponDescription = weaponDescription;
    }

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

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAttackModifier() {
        return attackModifier;
    }

    public void setAttackModifier(int attackModifier) {
        this.attackModifier = attackModifier;
    }
}



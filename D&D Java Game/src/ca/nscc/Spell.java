package ca.nscc;

import javax.swing.*;

public class Spell extends CharacterWeapon {
    private ImageIcon spellPicture = new ImageIcon("Image/spell.jpg");
    public Spell(String weaponDescription, String name, int hpPoint, int defence, int agility, int baseAttack,  int weight, int attackModifier) {
        super(weaponDescription, name, hpPoint, defence, agility, baseAttack,  weight, attackModifier);
    }

    public ImageIcon getSpellPicture() {
        return spellPicture;
    }

    public void setDaggerPic(ImageIcon spellPicture)
    {
        this.spellPicture = spellPicture;
    }

    @Override
    public String getWeaponDescription() {
        return super.getWeaponDescription();
    }

    @Override
    public void setWeaponDescription(String weaponDescription) {
        super.setWeaponDescription(weaponDescription);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getHpPoint() {
        return super.getHpPoint();
    }

    @Override
    public void setHpPoint(int hpPoint) {
        super.setHpPoint(hpPoint);
    }

    @Override
    public int getDefence() {
        return super.getDefence();
    }

    @Override
    public void setDefence(int defence) {
        super.setDefence(defence);
    }

    @Override
    public int getAgility() {
        return super.getAgility();
    }

    @Override
    public void setAgility(int agility) {
        super.setAgility(agility);
    }

    @Override
    public int getBaseAttack() {
        return super.getBaseAttack();
    }

    @Override
    public void setBaseAttack(int baseAttack) {
        super.setBaseAttack(baseAttack);
    }


    @Override
    public int getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }

    @Override
    public int getAttackModifier() {
        return super.getAttackModifier();
    }

    @Override
    public void setAttackModifier(int attackModifier) {
        super.setAttackModifier(attackModifier);
    }
}


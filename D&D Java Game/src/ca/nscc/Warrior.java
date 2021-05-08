package ca.nscc;

import javax.swing.*;
import java.awt.*;

public class Warrior extends Player {
    private ImageIcon warriorPicture;

    public Warrior(String name, int hpPoint, int defence, int agility, int baseAttack, String charDescription)  {
        super(name, hpPoint, defence, agility, baseAttack, charDescription);
        warriorPicture = new ImageIcon("Image/warrior.jpg");

    }

    public ImageIcon getWarriorPicture() {
        return warriorPicture;
    }

    public void setWarriorPicture(ImageIcon warriorPic) {
        this.warriorPicture = warriorPicture;
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


}


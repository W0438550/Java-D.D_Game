package ca.nscc;

import javax.swing.*;

public class HuayChivos extends Monster {
    private ImageIcon HuayChivosPicture = new ImageIcon("Image/huay_chivos.jpg");
    public HuayChivos(String name, int hpPoint, int defence, int agility, int baseAttack, String description) {
        super(name, hpPoint, defence, agility, baseAttack, description);
//        MimiPic = new ImageIcon(this.getClass().getResource("/Image/MimiImage.jpg"));
    }

    public ImageIcon getHuayChivosPicture() {
        return HuayChivosPicture;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(description);
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


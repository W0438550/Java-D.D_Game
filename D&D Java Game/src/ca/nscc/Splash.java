package ca.nscc;
import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Splash extends JPanel {
    private JLabel gameTitle;
    private JLabel splashPic;
    private JButton createCharBtn;
    private JRadioButton selectedButton;


    public JButton getCreateCharBtn() {
        return createCharBtn;
    }

    public Splash()
    {
        setLayout(null);
        setVisible(true);


        gameTitle = new JLabel("Dungeons of Despair!");
        gameTitle.setFont(new Font("Old English Text MT",Font.BOLD,44));
        gameTitle.setBounds(170,50,600,100);




        splashPic = new JLabel();
        splashPic.setIcon(new ImageIcon("Image/splash.jpg"));
//        splashPic.setIcon(new ImageIcon(this.getClass().getResource("Image/images.jfif")));
        splashPic.setBounds(237,150,275,183);

        createCharBtn = new JButton("Build a Character");
        createCharBtn.setFont(new Font("Old English Text MT",Font.BOLD,22));
        createCharBtn.setBounds(125,350,500,100);

        add(gameTitle);
        add(splashPic);
        add(createCharBtn);
//        add(selectedButton);













    }
    public JRadioButton getSelectedButton()
    {
        return selectedButton;
    }
}


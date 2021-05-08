package ca.nscc;

// java libraries are imported
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// the attributes for the Battle Summary Screen are created, extend JPanel package
public class BattleSummaryScreen extends JPanel {
    private JButton displayBtn;
    private JLabel dimensionsLabel;
    private JLabel imageLabel;
    private JTextField nameText;
    private JTextArea description;
    private JLabel wePimageLabel;
    private JLabel charimageLabel;
    private JLabel monsterImageLabel;
    private JRadioButton selectedCharacter;
    private JRadioButton selectedWeapon;
    private JLabel character;
    private JLabel monster;
    private StringBuilder characterDescription = new StringBuilder();
    private StringBuilder weaponDescription = new StringBuilder();

    // constructor for the Battle Summary Screen is created
    public BattleSummaryScreen(JPanel splash) {

        // Set Panel Properties
        setLayout(null);
        // Set font object
        Font myFont = new Font("Calibri", Font.BOLD, 24);
        Font myCfont = new Font("Old English Text MT", Font.BOLD, 38);
        Font mydfont = new Font("Old English Text MT", Font.BOLD, 20);
        Font myFontDescription = new Font("Calibri", Font.PLAIN, 20);

        // Label control for name
        JLabel battle_to_the_deathLabel = new JLabel("Battle to the Death!");
        battle_to_the_deathLabel.setFont(myCfont);
        battle_to_the_deathLabel.setBounds(200, 25, 650, 100);

        // a new JLabel object is created with a text message as parameter, its font and size is defined below
        JLabel player = new JLabel("Player:");
        player.setFont(myFont);
        player.setBounds(100, 100, 175, 100);

        // a new JLabel object is created with a text message as parameter, its font and size is defined below
        character = new JLabel("Warrior");
        character.setFont(myFont);
        character.setBounds(195, 100, 175, 100);

        // a new JLabel object is created, its font and size is defined below
        charimageLabel = new JLabel();
        charimageLabel.setFont(myFont);
        charimageLabel.setBounds(95, 180, 250, 160);

        // a new JLabel object is created, its font and size is defined below
        monsterImageLabel = new JLabel();
        monsterImageLabel.setFont(myFont);
        monsterImageLabel.setBounds(400, 180, 250, 160);

        // a new JLabel object is created with a text message as parameter, its font and size is defined below
        wePimageLabel = new JLabel("Monster:");
        wePimageLabel.setFont(myFont);
        wePimageLabel.setBounds(422, 100, 175, 100);

        // a new JLabel object is created with a text message as parameter, its font and size is defined below
        monster = new JLabel("Gazer");
        monster.setFont(myFont);
        monster.setBounds(545, 100, 175, 100);

        // a new JTextArea is created, its font and size is defined below
        description = new JTextArea(20, 50);
        description.setFont(myFontDescription);
        description.setEditable(false);
        description.setBounds(50, 350, 650, 200);
        description.setLineWrap(true);
        description.setText("Here");

        // a new JButton object is created with a text message as a parameter, its font and size is defined below
        displayBtn = new JButton("Start Again");
        displayBtn.setFont(mydfont);
        displayBtn.setBounds(300, 580, 200, 50);
        onClickRestart(displayBtn, splash, this);

        // added to the battle screen summary
        add(battle_to_the_deathLabel);
        add(player);
        add(character);
        add(wePimageLabel);
        add(monster);
        add(charimageLabel);
        add(monsterImageLabel);
        add(description);
        add(displayBtn);
    }

    public void onClickRestart(JButton restart, JPanel splash, BattleSummaryScreen screen) {
        restart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                screen.setVisible(false);
                splash.setVisible(true);
            }
        });
    }

    // the setters for the character, monster and weapon
    public void setCharacterImage(ImageIcon image) {
        charimageLabel.setIcon(image);
    }

    public void setCharacterText(String characterText) {
        character.setText(characterText);
    }

    public void setMonsterImage(ImageIcon image) {
        monsterImageLabel.setIcon(image);
    }

    public void setMonsterText(String characterText) {
        monster.setText(characterText);
    }

    public void setWeaponImage(ImageIcon image) {
        wePimageLabel.setIcon(image);
    }

    // the description for the player character that will be displayed is written in this method
    public void setDescription(Player p) {
        characterDescription.append("Player: ").append(p.getName()).append("\n").append("------------------")
                .append("\n").append("Class: ").append(p.getName()).append("    HP: ").append(p.getHpPoint())
                .append("    Defense: ").append(p.getDefence()).append("    Agility: ").append(p.getAgility())
                .append("    Base Attack: ").append(p.getBaseAttack()).append("    Weapon: ").append("replace_weapon")
                .append("\n\n");
    }

    // the description for the monster character that will be displayed is written in this method
    public void setMonsterDescription(Monster m) {
        characterDescription.append("Monster: ").append(m.getName()).append("\n").append("------------------")
                .append("\n").append("HP: ").append(m.getHpPoint()).append("    Defense: ").append(m.getDefence())
                .append("    Agility: ").append(m.getAgility()).append("    Base Attack: ").append(m.getBaseAttack());
    }

    // a method that will generate the character details based on the user's choice on the screen
    public void setSelectedCharacter(JRadioButton selectedCharacter) {
        this.selectedCharacter = selectedCharacter;
        if (this.selectedCharacter != null) {
            if ("Warrior".equalsIgnoreCase(this.selectedCharacter.getText())) {
                Warrior p = MainFrame.getTheWarrior();
                setCharacterImage(p.getWarriorPicture());
                setCharacterText(p.getName());
                setDescription(p);

            } else if ("Cleric".equalsIgnoreCase(this.selectedCharacter.getText())) {
                Cleric p = MainFrame.getTheCleric();
                setCharacterImage(p.getClericPicture());
                setCharacterText(p.getName());
                setDescription(p);
            } else if ("Wizard".equalsIgnoreCase(this.selectedCharacter.getText())) {
                Wizard p = MainFrame.getTheWizard();
                setCharacterImage(p.getWizardPicture());
                setCharacterText(p.getName());
                setDescription(p);
            }

            int r = getRandom(1, 100);
            if (r % 2 == 0) {
                HuayChivos m = MainFrame.getHuayChivos();
                setMonsterImage(m.getHuayChivosPicture());
                setMonsterText(m.getName());
                setMonsterDescription(m);
            } else if (r % 2 == 1) {
                Jormungandr m = MainFrame.getJormungandr();
                setMonsterImage(m.getJormungandrPicture());
                setMonsterText(m.getName());
                setMonsterDescription(m);
            } else {
                Kraken m = MainFrame.getKraken();
                setMonsterImage(m.getKrakenPicture());
                setMonsterText(m.getName());
                setMonsterDescription(m);
            }
        }
    }

    // a method that give the weapon description based on the user's choice on the screen
    public void setSelectedWeapon(JRadioButton selectedWeapon) {
        this.selectedWeapon = selectedWeapon;
        if (this.selectedWeapon != null) {
            if (this.selectedWeapon.getText().equalsIgnoreCase("Spell")) {
                description.setText(characterDescription.toString().replace("replace_weapon", "Spell"));
            } else if (this.selectedWeapon.getText().equalsIgnoreCase("Staff")) {
                description.setText(characterDescription.toString().replace("replace_weapon", "Staff"));
            } else if (this.selectedWeapon.getText().equalsIgnoreCase("Battle Axe")) {
                description.setText(characterDescription.toString().replace("replace_weapon", "Battle Axe"));
            }
        }
    }

    // generate a random value using this method
    private int getRandom(int upper, int lower) {
        int value = (int) (Math.random() * (upper - lower)) + lower;
        return value;
    }
}
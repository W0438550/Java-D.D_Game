package ca.nscc;

// java libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// character screen class that inherits from JPanel class, it has the attributes below
public class CharacterScreen extends JPanel {
    private JButton displayBtn;
    private JButton rerollBtn;
    private JLabel dimensionsLabel;
    private JLabel charimageLabel;
    private JLabel wePimageLabel;
    private JLabel imageLabel;
    private JTextField nameText;
    private JRadioButton rdoWizard;
    private JRadioButton rdoWarrior;
    private JRadioButton rdoCleric;
    private JRadioButton rdoBattleAxe;
    private JRadioButton rdoStaff;
    private JRadioButton rdoSpell;
    private JRadioButton selectedCharacter;
    private JRadioButton selectedWeapon;
    private JTextArea charachterdescription;
    private JTextField hit_description1;
    private JTextField defensedescription;
    private JTextField agilitydescription;
    private JTextField bAdescription ;
    private JTextArea weapondescription;
    private JTextField aMdescription;
    private JTextField weightdescription;
    private Wizard wizard = null;
    private Warrior warrior = null;
    private Cleric cleric = null;
    private HuayChivos huayChivos = null;
    private Jormungandr jormungandr = null;
    private Kraken kraken = null;
    private static BattleAxe battleAxe = null;
    private static Staff staff = null;
    private static Spell spell = null;


    public JButton getDisplayBtn() {
        return displayBtn;
    }

    public CharacterScreen() {
        //Set font object
        Font myFont = new Font("Calibri", Font.BOLD, 18);
        Font myCfont = new Font("Old English Text MT", Font.BOLD, 28);
        Font myIFont = new Font("Calibri", Font.BOLD, 14);

        //Set Panel Properties
        setLayout(null);
//        setVisible(true);

        //Create all GUI objects
        addPlayerRadios(myFont);
        createCharacter();
        addWeaponRadios(myFont);

        //new JLabel control for name
        JLabel generateLabel = new JLabel("Character Generator");
        generateLabel.setFont(myCfont);
        generateLabel.setBounds(50, 5, 400, 50);

        // new Jlabel for the weapon choice
        JLabel weaponLabel = new JLabel("Select your Weapon");
        weaponLabel.setFont(myCfont);
        weaponLabel.setBounds(50, 350, 400, 50);

        // new Jlabel for the weapon stats
        JLabel weaponstatsLabel = new JLabel("Weapon Stats");
        weaponstatsLabel.setFont(myCfont);
        weaponstatsLabel.setBounds(600, 350, 400, 70);

        // new Jlabel for the attack modifier
        JLabel AttackLabel = new JLabel("Attack Modifer");
        AttackLabel.setFont(myIFont);
        AttackLabel.setBounds(600, 400, 400, 70);

        // new Jlabel for the weight
        JLabel weightLabel = new JLabel("Weight");
        weightLabel.setFont(myIFont);
        weightLabel.setBounds(600, 450, 200, 70);

        // new Jlabel for the Name
        JLabel nameLabel = new JLabel("Enter Name");
        nameLabel.setFont(myFont);
        nameLabel.setBounds(50, 40, 200, 50);

        // new Jlabel for the character type
        JLabel characterLabel = new JLabel("Character Type");
        characterLabel.setFont(myCfont);
        characterLabel.setBounds(50, 70, 200, 50);

        // new Jlabel for the character stats
        JLabel statsLabel = new JLabel("Character Stats");
        statsLabel.setFont(myCfont);
        statsLabel.setBounds(600, 70, 200, 50);

        // new Jlabel for the hit points
        JLabel hitPointLabel = new JLabel("Hit Points");
        hitPointLabel.setFont(myIFont);
        hitPointLabel.setBounds(600, 110, 200, 70);

        // new Jlabel for the defense
        JLabel defenseLabel = new JLabel("Defense");
        defenseLabel.setFont(myIFont);
        defenseLabel.setBounds(600, 140, 200, 70);

        // new Jlabel for the agility
        JLabel agilityLabel = new JLabel("Agility");
        agilityLabel.setFont(myIFont);
        agilityLabel.setBounds(600, 170, 200, 70);

        // new Jlabel for the class selection
        charimageLabel = new JLabel("Select a Class");
        charimageLabel.setFont(myIFont);
        charimageLabel.setBounds(250, 100, 250, 160);

        // new Jlabel for the weapon selection
        wePimageLabel = new JLabel("Select a Weapon");
        wePimageLabel.setFont(myIFont);
        wePimageLabel.setBounds(250, 400, 250, 160);

        // new Jlabel for the base attack
        JLabel baseAttackLabel = new JLabel("Base Attack");
        baseAttackLabel.setFont(myIFont);
        baseAttackLabel.setBounds(600, 200, 200, 70);


        //Textfield control for name
        nameText = new JTextField();
        nameText.setFont(myIFont);
        nameText.setBounds(260, 50, 200, 30);

        //Textfield control for description
        charachterdescription = new JTextArea(10, 30);
        charachterdescription.setFont(myIFont);
        charachterdescription.setEditable(false);
        charachterdescription.setBounds(50, 270, 400, 80);
        charachterdescription.setLineWrap(true);


        hit_description1 = new JTextField();
        hit_description1.setFont(myIFont);
        hit_description1.setEditable(false);
        hit_description1.setBounds(750, 130, 50, 20);



        defensedescription = new JTextField();
        defensedescription.setFont(myIFont);
        defensedescription.setEditable(false);
        defensedescription.setBounds(750, 160, 50, 20);



        agilitydescription = new JTextField();
        agilitydescription.setFont(myIFont);
        agilitydescription.setEditable(false);
        agilitydescription.setBounds(750, 190, 50, 20);



        bAdescription = new JTextField();
        bAdescription .setFont(myIFont);
        bAdescription .setEditable(false);
        bAdescription .setBounds(750, 220, 50, 20);



        weapondescription = new JTextArea(10, 30);
        weapondescription.setFont(myIFont);
        weapondescription.setEditable(false);
        weapondescription.setBounds(50, 560, 400, 100);
        weapondescription.setLineWrap(true);


        aMdescription = new JTextField();
        aMdescription.setFont(myIFont);
        aMdescription.setEditable(false);
        aMdescription.setBounds(755, 425, 40, 20);



        weightdescription = new JTextField();
        weightdescription.setFont(myIFont);
        weightdescription.setEditable(false);
        weightdescription.setBounds(755, 470, 40, 20);




        //Labels to show dimensions of each shape in a single field
        dimensionsLabel = new JLabel();
        dimensionsLabel.setFont(myIFont);
        dimensionsLabel.setBounds(260, 70, 300, 50);

        //Label for shape image
        warrior = MainFrame.getTheWarrior();
        imageLabel = new JLabel();
        imageLabel.setBounds(300, 120, 80, 80);

        warrior = MainFrame.getTheWarrior();
        imageLabel = new JLabel();
        imageLabel.setBounds(300, 450, 100, 80);




        //Change screen button
        rerollBtn = new JButton("Reroll");
        rerollBtn.setFont(myCfont);
        rerollBtn.setBounds(500, 270, 200, 50);
        onClickReroll(rerollBtn);

        displayBtn = new JButton("Start Battle");
        displayBtn.setFont(myCfont);
        displayBtn.setBounds(500, 580, 200, 50);

        //Add all controls to Panel
        add(rerollBtn);
        add(rdoWizard);
        add(rdoWarrior);
        add(rdoCleric);
        add(rdoBattleAxe);
        add(rdoStaff);
        add(rdoSpell);
        add(nameLabel);
        add(nameText);
        add(imageLabel);
        add(charimageLabel);
        add(wePimageLabel);
        add(dimensionsLabel);
        add(displayBtn);
        add(charachterdescription);
        add(weapondescription);
        add(hit_description1);
        add(weightdescription);
        add(aMdescription);
        add(bAdescription);
        add(defensedescription);
        add(agilitydescription);
        add(characterLabel);
        add(statsLabel);
        add(generateLabel);
        add(hitPointLabel);
        add(defenseLabel);
        add(agilityLabel);
        add(baseAttackLabel);
        add(weaponLabel);
        add(weaponstatsLabel);
        add(AttackLabel);
        add(weightLabel);

    }

    private void addPlayerRadios(Font myIFont) {
        rdoWarrior = new JRadioButton("Warrior");
        rdoWarrior.setFont(myIFont);
        rdoWarrior.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                warrior = MainFrame.getTheWarrior();
                charachterdescription.setText(warrior.getCharDescription());
                setCharacterImage(warrior.getWarriorPicture());
                setWarriorStatistics(warrior);
                selectedCharacter = rdoWarrior;
            }



        });
        rdoWizard = new JRadioButton("Wizard");
        rdoWizard.setFont(myIFont);
        rdoWizard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                wizard = MainFrame.getTheWizard();
                charachterdescription.setText(wizard.getCharDescription());
                setCharacterImage(wizard.getWizardPicture());
                setWizardStatistics(wizard);
                selectedCharacter = rdoWizard;
            }
        });
        rdoCleric = new JRadioButton("Cleric");
        rdoCleric.setFont(myIFont);
        rdoCleric.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                cleric = MainFrame.getTheCleric();
                charachterdescription.setText(cleric.getCharDescription());
                setCharacterImage(cleric.getClericPicture());
                setClericStatistics(cleric);
                selectedCharacter = rdoCleric;

            }
        });

        rdoWarrior.setBounds(50, 110, 150, 50);
        rdoWizard.setBounds(50, 150, 150, 50);
        rdoCleric.setBounds(50, 190, 150, 50);

        //ButtonGroup to group the radio buttons
        ButtonGroup grpColorRadios = new ButtonGroup();
        grpColorRadios.add(rdoWarrior);
        grpColorRadios.add(rdoWizard);
        grpColorRadios.add(rdoCleric);

    }

    private void addWeaponRadios(Font myIFont) {
        rdoBattleAxe = new JRadioButton("Battle Axe");
        rdoBattleAxe.setFont(myIFont);
        rdoBattleAxe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                battleAxe = MainFrame.getTheDagger();
                weapondescription.setText(battleAxe.getWeaponDescription());
                setWeaponImage(battleAxe.getBattleAxePicture());
                setBattleAxeStatistic(battleAxe);
                selectedWeapon = rdoBattleAxe;
            }


        });
        rdoStaff = new JRadioButton("Staff");
        rdoStaff.setFont(myIFont);
        rdoStaff.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                staff = MainFrame.getTheSword();
                weapondescription.setText(staff.getWeaponDescription());
                setWeaponImage(staff.getStaffPicture());
                setStaffStatistic(staff);
                selectedWeapon = rdoStaff;
            }
        });
        rdoSpell = new JRadioButton("Spell");
        rdoSpell.setFont(myIFont);
        rdoSpell.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                spell = MainFrame.getTheHammer();
                weapondescription.setText(spell.getWeaponDescription());
                setWeaponImage(spell.getSpellPicture());
                setSpellStatistic(spell);
                selectedWeapon = rdoSpell;
            }
        });
        rdoBattleAxe.setBounds(50, 400, 150, 50);
        rdoStaff.setBounds(50, 440, 150, 50);
        rdoSpell.setBounds(50, 480, 150, 50);
        ButtonGroup grpColorRadios = new ButtonGroup();
        grpColorRadios.add(rdoBattleAxe);
        grpColorRadios.add(rdoStaff);
        grpColorRadios.add(rdoSpell);
    }

    public void createCharacter() {
//        String name = new String(nameText.getText());
        if (rdoWarrior.isSelected()) {
            warrior = MainFrame.getTheWarrior();
            charachterdescription.append(warrior.getCharDescription());
//            warrior.setName(name);
        } else if (rdoWizard.isSelected()) {
            wizard = MainFrame.getTheWizard();
            charachterdescription.append(wizard.getCharDescription());

        } else if (rdoCleric.isSelected()) {
            cleric = MainFrame.getTheCleric();
            charachterdescription.append(cleric.getCharDescription());

        }


    }

    public void setCharacterImage(ImageIcon image){
        charimageLabel.setIcon(image);
    }

    public void setWeaponImage(ImageIcon image){
        wePimageLabel.setIcon(image);
    }

    public void setWarriorStatistics(Player p) {
        hit_description1.setText(p.getHpPoint() + "");
        defensedescription.setText(p.getDefence() + "");
        agilitydescription.setText(p.getAgility() + "");
        bAdescription.setText(p.getBaseAttack() + "");
    }

    public void setWizardStatistics(Wizard p) {
        hit_description1.setText(p.getHpPoint() + "");
        defensedescription.setText(p.getDefence() + "");
        agilitydescription.setText(p.getAgility() + "");
        bAdescription.setText(p.getBaseAttack() + "");
    }

    public void setClericStatistics(Cleric p) {
        hit_description1.setText(p.getHpPoint() + "");
        defensedescription.setText(p.getDefence() + "");
        agilitydescription.setText(p.getAgility() + "");
        bAdescription.setText(p.getBaseAttack() + "");
    }

    public void setBattleAxeStatistic(BattleAxe d)
    {
        aMdescription.setText(d.getAttackModifier()+"");
        weightdescription.setText(d.getWeight()+"");
    }

    public void setStaffStatistic(Staff s)
    {
        aMdescription.setText(s.getAttackModifier() + "");
        weightdescription.setText(s.getWeight()+"");
    }

    public void setSpellStatistic(Spell h)
    {
        aMdescription.setText(h.getAttackModifier() + "");
        weightdescription.setText(h.getWeight()+"");
    }

    public void onClickReroll(JButton reroll) {
        reroll.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if ((rdoWizard != null && rdoWizard.isSelected() || (rdoCleric != null && rdoCleric.isSelected())
                        || (rdoWarrior != null && rdoWarrior.isSelected()))) {
                    setCharacterStatistics(getRandom(100, 50), getRandom(100, 50), getRandom(100, 50), getRandom(100, 50));
                }

            }
        });
    }

    private int getRandom(int upper, int lower) {
        int value = (int) (Math.random() * (upper - lower)) + lower;
        return value;
    }

    public void setCharacterStatistics(int hpPoint, int defence, int agility, int baseAttack) {
        hit_description1.setText(hpPoint + "");
        defensedescription.setText(defence + "");
        agilitydescription.setText(agility + "");
        bAdescription.setText(baseAttack + "");
    }

    public JRadioButton getSelectedCharacter()
    {
        return selectedCharacter;
    }

    public JRadioButton getSelectedWeapon()
    {
        return selectedWeapon;
    }



}



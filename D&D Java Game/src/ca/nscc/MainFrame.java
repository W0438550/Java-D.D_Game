package ca.nscc;

// import java libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// the attributes of the MainFrame is declared
public class MainFrame extends JFrame {
    private static Warrior warrior;
    private static Wizard wizard;
    private static Cleric cleric;
    private static HuayChivos huayChivos;
    private static Jormungandr jormungandr;
    private static Kraken kraken;
    private static BattleAxe battleAxe;
    private static Staff staff;
    private static Spell spell;

    // constructor that contains the warrior, wizard, cleric, huay chivos, jormungandr, battle axe, staff, spell that will be used to create objects
    public MainFrame()  {
        warrior = new Warrior("Warrior", getRandom(100, 50), getRandom(100, 50), getRandom(100, 50),
                getRandom(100, 50), "The myth on whom stories were chanted to raise an army of powerful men");
        wizard = new Wizard("Wizard", getRandom(100, 50), getRandom(100, 50), getRandom(100, 50), getRandom(100, 50),
                "The wizard who is as old as time itself, has no ending as he possesses the knowledege of the infinite");
        cleric = new Cleric("Cleric", getRandom(100, 50), getRandom(100, 50), getRandom(100, 50), getRandom(100, 50),
                "They come bearing the word of god and, and that word shall be BEGONE");
        huayChivos = new HuayChivos("Huay Chivos", getRandom(100, 50), getRandom(100, 50), getRandom(100, 50), getRandom(100, 50),
                "Said to be a sorcerer who can transform into beasts and wreak havoc in the lives of villages");
        jormungandr = new Jormungandr("Jormungandr", getRandom(100, 50), getRandom(100, 50), getRandom(100, 50),
                getRandom(100, 50), "Resting in the deapth of the ocean, the midgard serpent shall rise at the end of time to destroy the nine worlds");
        kraken = new Kraken("Kraken", getRandom(100, 50), getRandom(100, 50), getRandom(100, 50),
                getRandom(100, 50), "Release shall be the Kraken, Doom should be the world");
        battleAxe = new BattleAxe("Forged on Asgard, the Leviathan Axe holds the power of the Gods ", "Battle Axe",
                getRandom(100, 50), getRandom(100, 50), getRandom(100, 50), getRandom(100, 50), getRandom(100, 50),
                getRandom(100, 50));
        staff = new Staff("The legendary staff of the lords of wizards, only a master wizard can wield its power ", "Staff",
                getRandom(100, 50), getRandom(100, 50), getRandom(100, 50), getRandom(100, 50), getRandom(100, 50),
                getRandom(100, 50));
        spell = new Spell("Sky above me, Stars so bright Hear my plea upon this night, Restore health and Vigor in me, the spell is done, so mote it be!", "Spell", getRandom(100, 50),
                getRandom(100, 50), getRandom(100, 50), getRandom(100, 50), getRandom(100, 50), getRandom(100, 50));

        // method that closes the program when the red x button is clicked
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // the size of the frame is set to the dimensions below
        setBounds(50, 50, 850,750);
        // the title of the screen is set using setTitle method
        setTitle("Dungeons of Death!");
        //setBackground(Color.red);
        setLayout(new CardLayout());
        //a new splash object is created; the startup screen
        Splash splash = new Splash();
        // a new character screen object is created
        CharacterScreen characterScreen = new CharacterScreen();
        // a new new battle summary screen object is created
        BattleSummaryScreen battleSummaryScreen = new BattleSummaryScreen(splash);
        //the splash, the character screen and the battle summary screen are added to the MainFrame
        add(splash);
        add(characterScreen);
        add(battleSummaryScreen);

        // a create character button is created in the splash screen, the button is assigned to a switchButton variable
        JButton switchButton = splash.getCreateCharBtn();
        switchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                splash.setVisible(false); // set to false after the user clicks on the the create button
                characterScreen.setVisible(true); // set to true after the user clicked on the create button, to allow display of the second screen
            }
        });
        //a display button is created in the character screen, the button is assigned to a variable called switchButton1
        JButton switchButton1 = characterScreen.getDisplayBtn();
        switchButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                characterScreen.setVisible(false);  // set to false after the user clicks on the play button
                battleSummaryScreen.setSelectedCharacter(characterScreen.getSelectedCharacter());
                battleSummaryScreen.setSelectedWeapon(characterScreen.getSelectedWeapon());
                battleSummaryScreen.setVisible(true); // set to true after the user clicked on the play button, which allows the display of the third screen

            }
        });

    }

    // the getter and setter methods for the attributes above are created
    public static Warrior getTheWarrior() {
        return warrior;
    }

    public static Wizard getTheWizard() {
        return wizard;
    }

    public static Cleric getTheCleric() {
        return cleric;
    }

    public static HuayChivos getHuayChivos() {
        return huayChivos;
    }

    public static Jormungandr getJormungandr() {
        return jormungandr;
    }

    public static Kraken getKraken() {
        return kraken;
    }

    public static BattleAxe getTheDagger() {
        return battleAxe;
    }

    public static Staff getTheSword() {
        return staff;
    }

    public static Spell getTheHammer() {
        return spell;
    }

    // a random method that will generate a random value for stats
    private int getRandom(int upper, int lower) {
        int value = (int) (Math.random() * (upper - lower)) + lower;
        return value;
    }
}

package ca.nscc;


import java.awt.*;
import java.util.concurrent.Callable;

// The main function contains the code for the mainframe; the mainframe is called in the main
public class Main {

    public static void main (String[] args) {
        // write your code here
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainFrame frame = new MainFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
}

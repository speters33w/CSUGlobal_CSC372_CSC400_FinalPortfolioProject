package edu.csuglobal.csc372.milestone1.user_interface;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

import static util.speters33w.RandomColorGenerator.shadesOfGreen;
import static util.speters33w.RandomColorGenerator.shadesOfOrange;

/*
Create a user interface that has a top bar that includes a menu. The menu should have four items.

    When the user selects the first menu option, then the date and time should be printed in a text box.
    When the user selects the second menu option, then the text box contents should be written to a text file named "log.txt."
    When the user selects the third menu item then the frame background color changes to random color hue of the color orange. 
    The menu option should display the initial random hue each time selected for a single execution of the program. 
    See https://www.w3schools.com/colors/colors_picker.asp 

When the user selects the fourth menu option then the program exits.
*/

/**
 * @author StephanPeters
 */
@SuppressWarnings("unused")
public class UserInterface extends JPanel {

    private JLabel displayField;

    public UserInterface() {
        initComponents();
    }

    public static void main(String[] args) {
        // Load the font file into the graphics environment.
        try {
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("src/main/resources/fonts/D-DIN-Bold.ttf")));
        } catch (IOException | FontFormatException ioe) {
            System.out.println("Font file not found or cannot be loaded.");
            // If font file is not found or cannot be loaded, use default font.
        }

        // Create the frame.
        JFrame frame = new JFrame("Simple Menu Example");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        ImageIcon icon = new ImageIcon("src/main/resources/CSU_Global_Circle.png");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(icon.getImage());
        frame.add(new UserInterface());
        frame.setLocation(
                (int) screenSize.getWidth() / 2 - (int) frame.getPreferredSize().getWidth() / 2,
                (int) screenSize.getHeight() / 2 - (int) frame.getPreferredSize().getHeight() / 2);
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * Gets and formats the local date and time onto the display field.
     * @param e Action Event.
     */
    private void showDateAndTime(ActionEvent e) {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date dateTime = new Date();
        displayField.setText(formatter.format(dateTime));
    }

    /**
     * Saves the date and time displayed in the display field to log.txt.
     * @param e Action Event.
     */
    private void save(ActionEvent e) {
        try {
            PrintWriter log = new PrintWriter("log.txt");
            if(!displayField.getText().equals("")) {
                log.println(displayField.getText());
            } else {
                log.println("No date and time recorded.");
            }
            log.close();
        } catch (FileNotFoundException fnf) {
            JOptionPane.showMessageDialog(this, "File was not saved!",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Changes the background color of the display field to random green color hue.
     * @param e Action Event.
     */
    private void green(ActionEvent e) {
        displayField.setOpaque(true);
        displayField.setBackground(shadesOfGreen());
    }

    /**
     * Changes the background color of the display field to random orange color hue.
     * @param e Action Event.
     */
    private void orange(ActionEvent e) {
        displayField.setOpaque(true);
        displayField.setBackground(shadesOfOrange());
    }

    /**
     * Exits the program.
     *
     * @param e Action Event.
     */
    private void exit(ActionEvent e) {
        System.exit(0);
    }

    /**
     * Initializes the components of the user interface.
     */
    private void initComponents() {

        JMenuBar menuBar1 = new JMenuBar();
        JMenu file = new JMenu();
        JMenuItem show = new JMenuItem();
        JMenuItem save = new JMenuItem();
        JMenu changeBackground = new JMenu();
        JMenuItem green = new JMenuItem();
        JMenuItem orange = new JMenuItem();
        JMenuItem exit = new JMenuItem();
        displayField = new JLabel();

        // this
        setMinimumSize(new Dimension(320, 240));
        setPreferredSize(new Dimension(640, 480));
        setMaximumSize(new Dimension(1280, 960));
        setLayout(new BorderLayout());

        // menuBar1
        {

            // file
            {
                file.setText("File");
                file.setFont(new Font("D-DIN", Font.BOLD, 16));
                file.setDisplayedMnemonicIndex(0);
                file.setMnemonic('F');

                // show 
                show.setText("Show Date and Time");
                show.setFont(new Font("D-DIN", Font.BOLD, 16));
                show.addActionListener(this::showDateAndTime);
                file.add(show);

                // save 
                save.setText("Save Date and Time");
                save.setMnemonic('S');
                save.setFont(new Font("D-DIN", Font.BOLD, 16));
                save.addActionListener(this::save);
                file.add(save);

                // changeBackground
                {
                    changeBackground.setText("Change Background Color");
                    changeBackground.setFont(new Font("D-DIN", Font.BOLD, 16));

                    // green 
                    green.setText("Green");
                    green.setBackground(Color.green);
                    green.setFont(new Font("D-DIN", Font.BOLD, 16));
                    green.addActionListener(this::green);
                    changeBackground.add(green);

                    // orange 
                    orange.setText("Orange");
                    orange.setFont(new Font("D-DIN", Font.BOLD, 16));
                    orange.setBackground(Color.orange);
                    orange.addActionListener(this::orange);
                    changeBackground.add(orange);
                }
                file.add(changeBackground);

                // exit 
                exit.setText("Exit");
                exit.setFont(new Font("D-DIN", Font.BOLD, 16));
                exit.setMnemonic('X');
                exit.addActionListener(this::exit);
                file.add(exit);
            }
            menuBar1.add(file);
        }
        add(menuBar1, BorderLayout.NORTH);

        // displayField 
        displayField.setFont(new Font("D-DIN", Font.BOLD, 44));
        displayField.setHorizontalAlignment(SwingConstants.CENTER);
        add(displayField, BorderLayout.CENTER);
    }
}

import javax.swing.*;
import java.awt.*;
// awt

public class Main {
    public static void main(String[] args) {
        // create a frame / window
        JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menu Bar
        JMenuBar mb = new JMenuBar();

        //menu
        JMenu file = new JMenu("File");
        JMenu help = new JMenu("Help");
        mb.add(file);
        mb.add(help);

        // Menu items
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save As");

        // add menu items to menu
        file.add(open);
        file.add(save);

        //create buttons and textfield and label
        //JButton, JTextField, JLabel

        JPanel panel = new JPanel();
        JLabel name = new JLabel("Enter Text");
        JTextField tf = new JTextField(12);
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");

        //attach control to panel
        panel.add(name);
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        JTextArea txt = new JTextArea();

        // size of the window
        frame.setSize(400,400);
        //Border layout
        frame.getContentPane().add(BorderLayout.NORTH,mb);
        frame.getContentPane().add(BorderLayout.SOUTH,panel);
        frame.getContentPane().add(BorderLayout.CENTER,txt);



        // set visible
        frame.setVisible(true);
    }
}
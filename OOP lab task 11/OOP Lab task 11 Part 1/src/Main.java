import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {

        // Frame
        JFrame frame = new JFrame("University Portal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu helpMenu = new JMenu("Help");

        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save As");

        fileMenu.add(openItem);
        fileMenu.add(saveItem);

        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        JPanel formPanel = new JPanel(new GridLayout(5, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 20));

        JLabel cmsLabel = new JLabel("CMS ID:");
        JTextField cmsField = new JTextField();

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField();

        JLabel addressLabel = new JLabel("Address:");
        JTextField addressField = new JTextField();

        JLabel semesterLabel = new JLabel("Semester:");
        JTextField semesterField = new JTextField();

        formPanel.add(cmsLabel);
        formPanel.add(cmsField);

        formPanel.add(nameLabel);
        formPanel.add(nameField);

        formPanel.add(ageLabel);
        formPanel.add(ageField);

        formPanel.add(addressLabel);
        formPanel.add(addressField);

        formPanel.add(semesterLabel);
        formPanel.add(semesterField);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton submitButton = new JButton("Submit");
        buttonPanel.add(submitButton);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        inputPanel.add(formPanel, BorderLayout.CENTER);
        inputPanel.add(buttonPanel, BorderLayout.SOUTH);

        JTextArea outputArea = new JTextArea();
        outputArea.setEditable(false);
        outputArea.setMargin(new Insets(10, 10, 10, 10));

        frame.getContentPane().add(menuBar, BorderLayout.NORTH);
        frame.getContentPane().add(inputPanel, BorderLayout.CENTER);
        frame.getContentPane().add(outputArea, BorderLayout.SOUTH);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String cms = cmsField.getText();
                String name = nameField.getText();
                String age = ageField.getText();
                String address = addressField.getText();
                String semester = semesterField.getText();

                outputArea.setText
                        ("Student Information:\n\n" + "CMS ID    : " + cms + "\n" + "Name      : " + name + "\n" + "Age       : " + age + "\n" + "Address   : " + address + "\n" + "Semester  : " + semester);
            }
        });
        frame.setVisible(true);
    }
}

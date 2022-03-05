import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class GFG {

    // Function to write a student information in JFrame and storing it in a file
    public static void StudentInfo()
    {

        // Creating a new frame using JFrame
        JFrame f = new JFrame("Student Details Form");
        ImageIcon icon = new ImageIcon("C:\\Users\\eriik\\Desktop\\CIS36B\\Final project\\EFA.png");
        JLabel label = new JLabel(icon);

        JLabel l1, l2, l3,l4, l5;// Creating the labels


        JTextField t1, t2, t3;// Creating three text fields. One for student name, one for college mail ID and one for Mobile No


        JComboBox<String> j1;// Creating two JCombobox one for Level and one for availability
        JComboBox<String> j2;// Creating two JCombobox one for Level and one for availability

        // Creating two buttons
        JButton b1, b2;

        // Naming the labels and setting and the bounds for the labels
        l1 = new JLabel("Student Name:");
        l1.setBounds(50, 50, 100, 30);
        l2 = new JLabel("Email:");
        l2.setBounds(50, 120, 120, 30);
        l3 = new JLabel("Level:");
        l3.setBounds(50, 190, 50, 30);
        l4 = new JLabel("Availability"); // X -> width Y-> Height
        l4.setBounds(300, 190, 400, 30);
        l5 = new JLabel("Mobile No:");
        l5.setBounds(420, 120, 70, 30);

        // Creating the text fields and setting the bounds for text fields
        t1 = new JTextField();
        t1.setBounds(150, 50, 130, 30);
        t2 = new JTextField();
        t2.setBounds(160, 120, 130, 30);
        t3 = new JTextField();
        t3.setBounds(490, 120, 130, 30);

        // Creating two string arrays one for levels and other for availability
        String[] s1 = { " ", "Beginner", "Intermediate", "Advance"};
        String[] s2 = {" "};

        // Creating two JComboBoxes one for selecting level and other for selecting the availability and setting the bounds
        j1 = new JComboBox<>(s1);
        j1.setBounds(120, 190, 100, 30);
        j2 = new JComboBox<>(s2);
        MyLessonOne test = new MyLessonOne();
        for (int i = 0; i < test.pInfo.size(); i++) {
            j2.addItem(test.pInfo.get(i));
        }
        j2.setBounds(400, 190, 320, 30);

        // Creating one button for Saving and other button to close and setting the bounds
        b1 = new JButton("Save");
        b1.setBounds(150, 300, 70, 30);
        b2 = new JButton("Close");
        b2.setBounds(450, 300, 70, 30);

        // Adding action listener
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String s1 = t1.getText();
                String s2 = t2.getText();
                String s3 = j1.getSelectedItem() + "";
                String s4 = j2.getSelectedItem() + " ";
                String s5 = t3.getText();
                String s6 = " ";
                if (e.getSource() == b1) {
                    try {

                        FileWriter w = new FileWriter("GFG.txt", true);

                        w.write(s1 + " - ");//-
                        w.write(s2 + " - ");
                        w.write(s3 + " - ");
                        w.write(s5 + " - ");
                        w.write( s4 + " - ");//professors Line
                        w.write(s6 + " \n ");
                        w.close();
                    }
                    catch (Exception ae) {
                        System.out.println("ae");
                    }
                }

                JOptionPane.showMessageDialog(f, "Your class has been schedule, please wait " +
                        "to hear from your professor by email");
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                f.dispose();
            }
        });

        // Default method for closing the frame
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(j1);
        f.add(l4);
        f.add(j2);
        f.add(l5);
        f.add(t3);
        f.add(b1);
        f.add(b2);
        f.setSize(800, 700);
        f.add(label, BorderLayout.CENTER);
        f.setVisible(true);
    }
}

class GuiInterface{
    // Driver code
    public static void main(String[] args)
    {
        GFG.StudentInfo();
    }
}


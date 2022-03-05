import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;

public class MyprofessorRunning {

    // Function to write a professor information in JFrame and storing it in a file
    public static void Myprofessor() {

        // Creating a new frame using JFrame
        JFrame f = new JFrame("Professor Details Form");
        ImageIcon icon = new ImageIcon("C:\\Users\\eriik\\Desktop\\CIS36B\\Final project\\EFA.png");
        JLabel label = new JLabel(icon);


        JLabel l1, l2, l4, l5;// Creating the labels

        JTextField t1, t2, t3;// Creating three text fields. One for student name, one for college mail ID and one for Mobile No

        //JComboBox<String> j1;// Creating two JCombobox one for Level and one for availability
        JComboBox<String> j2;// Creating two JCombobox one for Level and one for availability

        // Creating two buttons
        JButton b1, b2;

        // Naming the labels and setting and the bounds for the labels
        l1 = new JLabel("Professor Name:");
        l1.setBounds(50, 50, 100, 30);
        l2 = new JLabel("Email:");
        l2.setBounds(50, 120, 120, 30);
        //l3 = new JLabel("Level:");
        //l3.setBounds(50, 190, 50, 30);
        l4 = new JLabel("Availability:");
        l4.setBounds(400, 50, 120, 30);
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
        //String[] s1 = {" ", "Beginner", "Intermediate", "Advance"};
        String[] s2 = {" ", "9:00 am- 10:00 am", "10:00 am - 11:00 am", "1:00 pm - 2:00 pm", "2:00 pm - 3:00 pm", "3:00 pm - 4:00 pm"};

        // Creating two JComboBoxes one for selecting level and other for selecting the availability and setting the bounds
        //j1 = new JComboBox<>(s1);
        //j1.setBounds(120, 190, 100, 30);
        j2 = new JComboBox<>(s2);
        j2.setBounds(470, 50, 140, 30);

        // Creating one button for Saving and other button to close and setting the bounds
        b1 = new JButton("Save");
        b1.setBounds(150, 300, 70, 30);
        b2 = new JButton("close");
        b2.setBounds(420, 300, 70, 30);

        // Adding action listener
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // Getting the text from text fields and JComboboxes and copying it to a strings

                String s1 = t1.getText();
                String s2 = t2.getText();
                //String s3 = j1.getSelectedItem() + "";
                String s4 = j2.getSelectedItem() + "";
                String s5 = t3.getText();
                String s6 = " ";
                if (e.getSource() == b1) {
                    try {

                        // Creating a file and writing the data into a Textfile.
                        FileWriter w = new FileWriter("ProfessorInfo.txt", true);

                        w.write(s1 + " - ");//-
                        w.write(s2 + " - ");
                        //w.write(s3 + " - ");
                        w.write(s4 + " - ");
                        w.write(s5 + " - ");
                        w.write(s6 + " \n ");
                        w.close();
                    } catch (Exception ae) {
                        System.out.println("ae");
                    }
                }

                // Shows a Pop up Message when save button is clicked
                JOptionPane.showMessageDialog(f, "Successfully Saved" + " The Details");
            }
        });

        // Action listener to close the form
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });

        // Default method for closing the frame
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Adding the created objects to the frame
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        //f.add(l3);
        //f.add(j1);
        f.add(l4);
        f.add(j2);
        f.add(l5);
        f.add(t3);
        f.add(b1);
        f.add(b2);
        //f.setLayout(true);
        f.setSize(700, 600);
        f.add(label, BorderLayout.CENTER);
        f.setVisible(true);
    }
}
class ProfessorGuiDemo{
    // Driver code
    public static void main(String[] args)
    {
        MyprofessorRunning.Myprofessor();
    }
}


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class StudentPilot {

    public static void toStudent() {
        JFrame f = new JFrame("Pick your first English class");
        ImageIcon icon = new ImageIcon("C:\\Users\\eriik\\Desktop\\CIS36B\\Final project\\EFA.png");
        JLabel label = new JLabel(icon);

        JLabel l1;//labels for text boxes

        JComboBox<String> j1;//plegable menu

        JButton b1, b2;

        l1 = new JLabel("Availability"); // X -> width Y-> Height
        l1.setBounds(50, 50, 400, 30);

        String[] s1 = {" "};

        j1 = new JComboBox<>(s1);
        MyLessonOne test = new MyLessonOne();
        for (int i = 0; i < test.pInfo.size(); i++) {
            j1.addItem(test.pInfo.get(i));
            //j1.addItem(test.profNames.get(i) + test.level.get(i));
        }
        j1.setBounds(120, 50, 320, 30);

        b1 = new JButton("Save");
        b1.setBounds(150, 280, 70, 30);
        b2 = new JButton("close");
        b2.setBounds(250, 280, 70, 30);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String s1 = j1.getSelectedItem()+ " ";//

                if (e.getSource() == b1) {


                    try {
                        FileWriter listed = new FileWriter("Schedule.txt", true);

                        listed.write(s1 + " - ");
                        listed.close();
                    } catch (Exception ei) {
                        System.out.println("Error");
                    }
                }
                JOptionPane.showMessageDialog(f, "Your class has been schedule, please wait " +
                        "to hear from your professor by email");
            }
        });
        b2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.add(l1);
        f.add(j1);
        f.add(b1);
        f.add(b2);
        f.setSize(500, 400);
        f.add(label, BorderLayout.CENTER);
        f.setVisible(true);
    }
}
class StudentPilotDemo{
    public static void main(String[] args) {
        StudentPilot.toStudent();
    }
}

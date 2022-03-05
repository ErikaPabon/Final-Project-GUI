import javax.swing.*;
import java.io.IOException;
import java.awt.*;
import java.awt.event.*;

public class MenuPilot {
    public static void main(String[] args) throws IOException {

        JFrame menu = new JFrame("English For All");
        ImageIcon icon = new ImageIcon("C:\\Users\\eriik\\Desktop\\CIS36B\\Final project\\EFA.png");
        JLabel label = new JLabel(icon);

        JLabel l1;
        JButton b1, b2;

        l1 = new JLabel("<html> <p> Thank you for participating in English For All !! <br/> " +
                "<br/> A platform that allows for the connection between English teachers and " +
                " people from disadvantage " +
                "countries have access to English classes at no cost. <br/>" +
                " <br/>Please select your role from the below " +
                "options: </p></html>");
        l1.setFont(new Font("Arial", Font.BOLD, 20));
        l1.setForeground(Color.BLUE);
        l1.setBounds(40, 10, 550, 280);

        b1 = new JButton("Student");
        b1.setBounds(150, 400, 100, 30);
        b2 = new JButton("Professor");
        b2.setBounds(420, 400, 100, 30);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GFG.StudentInfo();
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyprofessorRunning.Myprofessor();
            }
        });
        menu.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        menu.add(l1);
        menu.add(b1);
        menu.add(b2);
        menu.setSize(700, 700);
        menu.add(label, BorderLayout.CENTER);
        menu.setVisible(true);
    }
}

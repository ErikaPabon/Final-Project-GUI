import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class myGuiQuestion {

    public static void main(String[] args) {

        String[] options = {"", "Professor", "Student"};
        ImageIcon icon = new ImageIcon("C:\\Users\\eriik\\Desktop\\CIS36B\\Final project\\EFA.png");
        String n = (String)JOptionPane.showInputDialog(null, "What will be your role??",
                "Participation role", JOptionPane.QUESTION_MESSAGE, icon, options, options[2]);
        System.out.println(n);

    }
}
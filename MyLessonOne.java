import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;

public class MyLessonOne {//this class reads the info from professors stores in a arraylist to be display on GUIStudent

    public ArrayList<String> pInfo;
    public ArrayList<String> profNames;
    public ArrayList<String> times;
    public ArrayList<String> level;

    public MyLessonOne(){

        try
        {

            File file = new File("ProfessorInfo.txt");
            Scanner sc = new Scanner(file);


            pInfo = new ArrayList<>();//initializing the infolist as an arraylist


            while (sc.hasNextLine())//while there is a line a to read
            {
                String temp = sc.nextLine();// a new temp strings is equal to the line
                pInfo.add(temp);//the line is add to the info list with temp as a parameter
            }
            sc.close();
            System.out.println(pInfo.size());

            for (int j = 0; j < pInfo.size(); j++)
            {
                String temp1 = pInfo.get(j);//temp is equal to the elements of the infolist
                //compare
                String [] row = temp1.split("\\s+");
                //profNames.add(row[0] + " " + row[1]);
                //times.add(row[4]+ " " + row[5]);
                //level.add(row[3]);
            }

            for (int j=0; j < profNames.size(); j++)
                System.out.println(profNames.get(j));
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Error");
        }
    }
}
class LessonOneDemo {
    public static void main(String[] args) {
        MyLessonOne test = new MyLessonOne();
    }
}

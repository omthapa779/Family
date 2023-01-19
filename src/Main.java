import models.Children;
import models.Parent;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Adding Hobbies to ArrayList
        System.out.println("\n");
        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("Gaming");
        hobbies.add("Editing And Visual Effects");
        hobbies.add("Programming");
        hobbies.add("Travelling");

        //populating Children's Field
        Children c1 = new Children("Om ",12,18,hobbies);

        //print All
        System.out.println(c1.getFullName()+ " reading in grade " + c1.getGrade() + " of age " + c1.getAge() + " who lives in " + c1.getHouseAddress() + " has following Hobbies: " );
        System.out.println(c1.getHobbies());
    }
}
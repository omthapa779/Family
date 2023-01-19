package models;
import java.util.ArrayList;

public class Children extends Parent{
    public String name;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int grade;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int age;
    public String FullName;

    public ArrayList<String> getHobbies() {
        for(String singleHobbies: hobbies){
            System.out.println(singleHobbies);
        }
        return hobbies;
    }

    public void setHobbies(ArrayList<String> hobbies){
        this.hobbies = hobbies;
    }

    public ArrayList<String> hobbies;

    public Children(String name, int grade, int age, ArrayList<String> hobbies){
        this.name = name;
        this.grade = grade;
        this.age = age;
        this.hobbies = hobbies;
    }

    public String getFullName(){
        String name = (this.name + "" + this.family_name);
        return name;
    }

    public void setFullName(String FullName){
         this.FullName = FullName;
    }
    public Children(String FullName){
        this.FullName = FullName;
    }
}

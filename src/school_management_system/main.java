package school_management_system;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Teacher Mary = new Teacher(1,"Mary",10000);
        Teacher Victoria = new Teacher(2,"Victoria",500);
        Teacher Luke = new Teacher(3,"Luke",20000);
        List <Teacher> teacherList = new ArrayList<>();
        teacherList.add(Mary);
        teacherList.add(Victoria);
        teacherList.add(Luke);

        Student Ezekiel = new Student(1,"Ezekiel",3);
        Student Eiser = new Student(2,"Eiser",2);
        Student Alexandra = new Student(3, "Alexandra",5);
        List<Student> studentList = new ArrayList<>();
        studentList.add(Ezekiel);
        studentList.add(Eiser);
        studentList.add(Alexandra);


        School ghs = new School(teacherList,studentList);

        Ezekiel.payFees(5000);
        Eiser.payFees(6000);
        System.out.println("GHS has earned Php "+ ghs.getTotalMoneyEarned());

        System.out.println("------MAKING SCHOOL PAY SALARY-------");
        Mary.receiveSalary(Mary.getSalary());
        System.out.println("The school paid "+Mary.getName()+" "+ ghs.getTotalMoneyEarned()+"php");

        Victoria.receiveSalary(Victoria.getSalary());
        System.out.println("The school paid "+Victoria.getName()+" "+ ghs.getTotalMoneyEarned()+"php");

    }
}

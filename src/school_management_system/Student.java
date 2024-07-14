package school_management_system;
/*
* This class is responsible for keeping
* track of students
* id, name, grade/class/course, fees paid, fees total
* */
public class Student {
    private int id;
    private String name;
    private int grade;
    private int fees_paid;
    private int fees_total;

    /*
    * To create a new student by initializing
    * Fees for every student is 60,000 php
    * Fees paid initially is 0.
    * id - unique identifier
    * name - name of the student
    * grade - unique / grade of student
    * */

    public Student(int id, String name, int grade){
        this.fees_paid=0;
        this.fees_total=60000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Not going to alert student's name, student's id

    /**
     * Used to update the student's grade
     * @param grade new grade of the student
     */
    public void setGrade(int grade){
        this.grade = grade;
    }

    /**
     * Keep adding the fees to fees_paid field.
     * Add the fees to the fees paid
     * The school is going to receive the funds.
     * @param fees
     */

     public void payFees(int fees){
         fees_paid += fees;
         School.updateTotalMoneyEarned(fees_paid);
     }

    /**
     *
     * @return id of student
     */
    public int getId(){
         return id;
    }

    /**
     *
     * @return name of student
     */
    public String getName(){
         return name;
    }

    /**
     *
     * @return grade of student / class
     */
    public int getGrade(){
         return grade;
    }

    /**
     *
     * @return fees paid of student
     */
    public int getFeesPaid(){
         return fees_paid;
    }

    /**
     *
     * @return total fees of student
     */
    public int getFeesTotal(){
         return fees_total;
    }

    /**
     *
     * @return the remaining fees
     */
    public int getRemainingFees(){
        return fees_total -= fees_paid;
    }

    @Override
    public String toString(){
        return "Student's name: "+name+ "Total fees paid so far "+fees_paid;
    }
}

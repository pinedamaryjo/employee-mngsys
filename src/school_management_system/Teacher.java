package school_management_system;

/**
 * This class is responsible for keeping the track
 * of teacher's id, name and salary.
 */

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Create Teacher Object
     * @param id unique identifier for teacher
     * @param name name of teacher
     * @param salary salary of teacher
     */
    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     *
     * @return id of the teacher
     */
    public int getId(){
        return id;
    }

    /**
     *
     * @return name of the teacher
     */
    public String getName(){
        return this.name;
    }

    /**
     *
     * @return the salary of the teacher
     */
    public int getSalary(){
        return salary;
    }

    /**
     * Set the salary
     * @param salary
     */
    public void setSalary(int salary){
        this.salary = salary;
    }

    /**
     * adds to the salary
     * removes from the total money earned to GHS
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }



}

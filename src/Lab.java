/**
 * this class is a simulation of Lab
 * with students and Lab's property
 * @author Mahmoud Hosseini
 * */
public class Lab {
    /*  Fields  */
    private Student[] students;
    private int avg;
    private String day;
    private int capacity;
    private int currentSize;

    /**
     * define a constructor
     * @param cap is for this.capacity
     * @param d is for this.day
     */
    public Lab(int cap, String d) {
        this.capacity = cap;
        this.day = d;
    }

    /**
     * getters and setters
     * @return students
     */
    public Student[] getStudents() {
        return students;
    }

    /**
    *@return avg
     */
    public int getAvg() {
        return avg;
    }

    /**
     * @return day
     */
    public String getDay() {
        return day;
    }

    /**
    *@return capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
    *@param day for this.day
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
    *@param capacity for this.capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * @param students for this.students
     * */
    public void setStudents(Student[] students) {
        this.students = students;
    }

    /*   Methods   */
    public void calculateAvg() {

    }

    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        } else {
            System.out.println("Lab if full!!!");
        }
    }

    /*print method to just print every property*/
    public void print() {
        System.out.print("the avg is:" + avg + "\n" + "capacirty is :" + capacity + "\n"
                + "currentSize is :" + currentSize + "\n");
    }
}










/**
 * this class is a simulation of Lab
 * with students and Lab's property
 *
 * @author Mahmoud Hosseini
 */
public class Lab {
    /*  Fields  */
    private int capacity;
    private Student[] students = new Student[3];
    private int avg;
    private String day;
    public int currentSize;

    /**
     * define a constructor
     *
     * @param cap is for this.capacity
     * @param d   is for this.day
     */
    public Lab(int cap, String d) {
        this.capacity = cap;
        this.day = d;
    }

    /**
     * getters and setters
     *
     * @return students
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * @return avg
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
     * @return capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param day for this.day
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * @param capacity for this.capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * @param students for this.students
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }

    /**
     * @param avg for this avg
     */
    public void setAvg(int avg) {
        this.avg = avg;
    }

    /*   Methods   */
    /**
     * A method for calculating average score with
     * scores of students
     */
    int count = 0 ;
    public void calculateAvg() {
        for (Student std : students){
            avg += std.getGrade();
            count += 1 ;
        }
        avg = avg / count ;
    }

    /**
    * A method that put Students object
     * into an array named students
     * @param std for students[capacity]
     * */
    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize += 1 ;
        } else {
            System.out.println("Lab if full!!!");
        }
    }

    /*print method to just print every property*/
    public void print() {
        for (Student std : students){
            System.out.print("Firstname: " + std.getFirstName() + "\n" +
                     "Lastname: " + std.getLastName() + "\n" +
                     "ID: " + std.getId() + "\n" +
                     "Grade: " + std.getGrade() + "\n*******\n");
        }
        calculateAvg();
        System.out.print("Avg: "+ getAvg() + "\n");
    }
}










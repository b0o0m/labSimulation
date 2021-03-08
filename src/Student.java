/**
 * The Student class represents a student in a student administration system
 * this class making student object with detail of student
 *
 * @author Mahmoud Hosseini
 */

public class Student {
    /*  instance var  */
    // first name of the student
    private String firstName;

    // last name of the student
    private String lastName;

    // student ID
    private String id;

    // the grade of the student
    private int grade;

    /**
     * A constructor for student with default value
     * i did this with THIS keyword, hope you dont mine :(
     *
     * @param firstName for this.firstName
     * @param lastName  for this.lastname
     * @param id        for this.id
     */
    public Student(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.grade = 0;
    }

    /**
     * setter and getter for private instance var
     * @param firstName for this.firstname
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @param lastName for this.lastname
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @param grade for this.grade
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * @param id for this.id
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     * @return grade field
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @return firtName field
     */
    public String getFirstName() {
        return firstName;
    }

    /**
    *@return id field
    */
    public String getId() {
        return id;
    }

    /**
    @return lastName field
    */
    public String getLastName() {
        return lastName;
    }

    /* print output */
    public void print() {
        System.out.println(lastName + ", student ID: " + id + ",grade: " + grade);
    }
}






































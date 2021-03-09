/**
 * this class is a simulation of Lab
 * with students and Lab's property
 *
 * @author Mahmoud Hosseini
 */

import java.lang.*;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Lab {
    /*  Fields  */
    private int capacity;
    private Student[] students;
    private int avg;
    private String day;
    private int currentSize;
    List<Student> waitingList = new CopyOnWriteArrayList<>();

    /**
     * define a constructor
     * @param capacity is for this.capacity
     * @param d        is for this.day
     */
    public Lab(int capacity, String d) {
        this.capacity = capacity;
        students = new Student[capacity];
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
     * @return currentSize
     */
    public int getCurrentSize() {
        return currentSize;
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

    /**
     * @param currentSize for this.currentsize
     */
    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    /*   Methods   */
    /**
     * A method for calculating average score with
     * scores of students
     */
    int count = 0;
    public void calculateAvg() {
        for (Student std : students) {
            avg += std.getGrade();
            count += 1;
        }
        avg = avg / count;
        count = 0 ;
    }

    /**
     * A method that put Students object
     * into an array named students
     * @param std for students[capacity]
     */
    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize += 1;
        } else {
            System.out.println("Lab if full!!!");
            waitingList.add(std);
            System.out.println(std + "Just added to waiting list");
        }
    }

    /**
     * unrolling Student object from students array...
    * and set it to null
     * @param std for finding it in student array
     */
    public void unrollStudent(Student std) {
        for (int i = 0 ; i < capacity ; i++){
            Student wow = students[i] ;
            if (wow.equals(std)){
                System.out.println("this is student array AFTER unrolling");
                students[i] = waitingList.get(0) ;
                waitingList.remove(0) ;
                printStudent();

            }
        }
    }

    /**
     * A method for printing students array*/
    public void printStudent(){
        System.out.println("students are now :");
        for (Student i : students){
            System.out.println(i);
        }
    }

    /**
     * A method for printing waitingList
     */
    public void printWaitingList(){
        for (Student i : waitingList){
            System.out.println(i);
        }
    }

    /*print method to just print every property*/
    public void print() {
        for (Student std : students) {
            System.out.print("Firstname: " + std.getFirstName() + "\n" +
                    "Lastname: " + std.getLastName() + "\n" +
                    "ID: " + std.getId() + "\n" +
                    "Grade: " + std.getGrade() + "\n*******\n");
        }
        calculateAvg();
        System.out.print("Avg: " + getAvg() + "\n");
    }

}










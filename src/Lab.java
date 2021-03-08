/**
 * this class is a simulation of Lab
 * with students and Lab's property
 *
 * @author Mahmoud Hosseini
 */


import java.lang.*;
import java.util.*;

public class Lab {
    /*  Fields  */
    private int capacity;
    private Student[] students;
    private int avg;
    private String day;
    private int currentSize;
    ArrayList<Student> waitingList = new ArrayList<Student>();

    /**
     * define a constructor
     *
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
    }

    /**
     * A method that put Students object
     * into an array named students
     *
     * @param std for students[capacity]
     */
    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize += 1;
        } else {
            System.out.println("Lab if full!!!");
            waitingList.add(std);
            System.out.println(std + "is in waitinglist now...");
        }
    }

    public void unrollStudent(Student std) {
        System.out.printf("unrolling %s" , std);
        std = null;
        System.out.println("Done");
    }

    Student newarr[] = new Student[capacity + 1];
    public void cancelVahed(Student std) {
        if (waitingList.contains(std)) {
            waitingList.remove(std);
            for (int i = 0; i < capacity + 1; i++)
                newarr[i] = waitingList.get(0);
            newarr[capacity] = std;

        } else {
            System.out.println("You are not in waiting list dude!");
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
    public void print1(){
        System.out.println("Waithing list :");
        for (Student i : newarr){
            System.out.println(i);
        }
    }
}










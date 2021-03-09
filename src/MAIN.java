/**
 * this is the main class which mostly
 * call methods and print things
 *
 * @author Mahmoud Hosseini
 * @version 0.0
 */

public class MAIN {
    public static void main(String[] args) {
        /* creating object*/
        Student std1 = new Student("Ehsan", "Edalat", "9031066");
        Student std2 = new Student("Seyed", "Ahamdpanah", "9031806");
        Student std3 = new Student("Ahmad", "Asadi", "9031054");
        Student std4 = new Student("Mahmoud", "Hosseini", "9931091");
        Student std5 = new Student("Ali", "rezaii", "9930192");
        Student std6 = new Student("Mahmoud", "Hosseini", "9931093");

        /* set grade for each of them*/
        std1.setGrade(15);
        std2.setGrade(18);
        std3.setGrade(20);
        std4.setGrade(15);
        std5.setGrade(19);
        std6.setGrade(3);
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
        ;

        /*creating lab object*/
        Lab l1 = new Lab(3, "12");
        l1.setCurrentSize(0);
        l1.enrollStudent(std1);
        l1.enrollStudent(std2);
        l1.enrollStudent(std3);
        l1.enrollStudent(std4);
        l1.enrollStudent(std5);
        l1.enrollStudent(std6);
        l1.print();


        System.out.println("this is student array BEFORE unrolling.");
        l1.printStudent();
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/");

        System.out.println("this is our waiting list.");
        l1.printWaitingList();
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/");


        l1.unrollStudent(std2);
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/");
        System.out.println("this is final waiting list");
        l1.printWaitingList();

    }
}

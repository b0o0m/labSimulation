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

        /* set grade for each of them*/
        std1.setGrade(15);
        std2.setGrade(18);
        std3.setGrade(20);

        std1.print();
        std1.setGrade(15);
        std1.print();

        std2.print();
        std2.setGrade(11);
        std2.print();

        std3.print();
        std3.setFirstName("HamidReza");
        std3.print();
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*"); ;
        /*creating lab object*/
        Lab l1 = new Lab(3, "12");
        l1.setCurrentSize(0);
        l1.enrollStudent(std1);
        l1.enrollStudent(std2);
        l1.enrollStudent(std3);
        l1.print();

        // tamrin akhar
        l1.unrollStudent(std1);
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/");
        l1.cancelVahed(std2);
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/");
        l1.print1();
    }
}

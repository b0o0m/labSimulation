/** this is the main class which mostly
call methods and print things
 @author Mahmoud Hosseini
 @version 0.0
 */

public class MAIN {
    public static void main(String[] args){
        Student std1 = new Student("Ehsan","Edalat","9031066") ;
        Student std2 = new Student("Seyed","Ahamdpanah","9031806") ;
        Student std3 = new Student("Ahmad","Asadi","9031054") ;

        std1.print() ;
        std1.setGrade(15);
        std1.print();

        std2.print() ;
        std2.setGrade(11);
        std2.print();

        std3.print() ;
        std3.setFirstName("HamidReza");
        std3.print();
    }
}

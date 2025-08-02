package classpractise;
import java.util.Scanner;

public class Employee {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the name,age and salary");


        String name=obj.nextLine();

        int age=obj.nextInt();
        double salary=obj.nextDouble();

        System.out.println("Name of the employee="+ name);
        System.out.println("age of the employee="+ age);
        System.out.println("Salary of the employee="+ salary);


    }
}

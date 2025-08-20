package classpractise;

public class Person {

    int age;
    String name;

    Person(int a,String n){
        age=a;
        name=n;
    }

    void displaydetails(){
        System.out.println("Name" + " "+ name +" "+"age"+" " + age);
    }
}

class Student extends Person{
    int rollnumber;
    int sub1;
    int sub2;
    int sub3;

    Student(int a,String n,int r,int s1,int s2,int s3){
        super(a,n);
        rollnumber=r;
        sub1=s1;
        sub2=s2;
        sub3=s3;
    }

    int calculatepercentage(){
        int avg=(sub1+sub2+sub3)/300;
        return avg *100;
    }

    void displaydetail(){
        super.displaydetails();
        System.out.println("rollnumber ="+ rollnumber);

    }
}

class Teacher extends Person{
    String subject;
    Teacher(int a,String n,String s){
        super(a,n);
        subject=s;

    }

    void teach(){
        System.out.println("Subject =" + subject);
    }
}

class Demo{
    public static void main(String[] args){
        Person p=new Person(19,"ram") ;
        Student s=new Student(19,"ram",20, 12, 34, 45);
        Teacher T=new Teacher(45,"Rahul","Mathmatics");

        p.displaydetails();
        s.calculatepercentage();
        s.displaydetail();
        T.teach();
    }
}


/*output*/

Name ram age 19
Name ram age 19
rollnumber =20
Subject =Mathmatics

Process finished with exit code 0


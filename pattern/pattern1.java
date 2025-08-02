package classpractise;
import java.util.Scanner;

class Pattern{
    public static void main(String[] args){
        System.out.println("print the pattern");
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int num=obj.nextInt();

        int i=0;
        char ch='A';
        while(i<num){
            int j=1;
            int k=i;
            ;
            while(j<=i){
                System.out.print(k);
                System.out.print(ch+" ");

                ch++;
                k++;
                j++;
            }
            System.out.println(" ");

            i++;
        }



    }
}

//"C:\Program Files\Java\jdk-24\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2025.1.4.1\lib\idea_rt.jar=58111" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\JavaCodes\out\production\JavaCodes classpractise.Pattern
print the pattern
enter the number of rows
5
 
1A  
2B 3C  
3D 4E 5F  
4G 5H 6I 7J  







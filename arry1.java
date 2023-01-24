import java.util.*;
public class arry1 {
    public static void main(String[] args) {
       // int marks[]=new int[5];
       int marks[]= new int[20];
       Scanner sc = new Scanner(System.in);
       marks[0]=sc.nextInt();
       marks[1]= sc.nextInt();
       marks[2]= sc.nextInt();
       sc.close();
       marks[0]= 90;
        System.out.println("phy : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("maths : " + marks[2]);
    }
}

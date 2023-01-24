import java.util.Scanner;

public class leapyear {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int year =sc.nextInt();
    sc.close();
    boolean x =(year % 4)==0;

   } 
}

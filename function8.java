import java.util.*;
public class function8 {
    public static void digit(int num){ 
    int i;
    int sum=0;
        while( num!=0){
         sum+= num%10;
          num/=10;
         
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        //digit(45667);
        int number;
        Scanner sc = new Scanner(System.in);
        number=sc.nextInt();
        sc.close();
        digit(number);
    }
}

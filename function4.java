public class function4 {
   public static int factorial(int num) {
    int number;
    int number = sc.nextInt();
    int i=1;
   int fact =1;
    while(i<=number)  {
    fact =fact*i;
    i++; 
    return fact ;
}
   }
    public static void main(String[] args) {
       System.out.println ( factorial(4));
    }
   }


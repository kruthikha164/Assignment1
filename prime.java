import java.util.Scanner;
public class prime
 {
   public static void main (String[]args)
   {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter two numbers:");
     int n1=s.nextInt();
     int n2=s.nextInt();
     for (int i = n1; i <= n2; i++)
       if (isPrime (i))
        System.out.println (i);
   }
   static boolean isPrime (int n)
   {
     if (n < 2)
       return false;
     for (int i = 2; i < n; i++)
       {
     if (n % i == 0)
        return false;
       }
     return true;
   }
 }
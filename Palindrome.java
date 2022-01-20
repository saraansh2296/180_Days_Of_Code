import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        int check , num, rem ,input, rev ;
        check=num=rem=rev=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        input =sc.nextInt();
        num = input;
         while(num>0)
         {
             rem = num %10;
             rev = rev*10+rem;
             num = num / 10;
         }
         if(rev==input)
        System.out.println("Palindrome");
         else
         System.out.println("Not Palindrome");


    }
}

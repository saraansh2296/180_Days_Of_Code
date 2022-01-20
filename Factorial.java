import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        int num , fact ; fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        num=sc.nextInt();
        for(int i=2;i<=num;i++)
        {
         fact = fact * i;
        }
        System.out.println("Factorial is :"+fact);
        fact = 0;
        System.out.println("Recurion Factorial is :"+fact(num));
    }

    // Solution using Recursion
    public static int fact(int num)
    {
        if(num==0)
            return 1;

        return num*fact(num-1);
    }


}

import java.util.Scanner;

public class Count_Trailing_Zeros {
    public static void main(String[] args) {
        int num , fact , count ;
       count = 0; fact =1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        num = sc.nextInt();
        for (int i= 2;i<=num;i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial is : "+fact);
        while (fact%10==0)
        {
            count++;
            fact = fact /10 ;
        }
        System.out.println("Trailing zeros:"+count);
        System.out.println("Trailing zeros:"+efficientSolution(num));
    }

    public static int efficientSolution(int num)
    {
        int count =0;
        for (int i=5;i<=num;i=i*5)
        {
            count = count + num/i;
        }
        return count;
    }


}

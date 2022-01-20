import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {

        int a,n,count,func; a=count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        n=sc.nextInt();
        func = count(n);
        a=n;
        while(a%10!=0)
        {
            count++;
            n=n/10;
            a=n;

        }
        System.out.println("Total Digits is : "+count);
        System.out.println("Total Digits is Function: "+func);
        count=0;
    }

    // Solution 2

    public static  int count(int n)
    {
        int count =0;
        while(n>0)
        {
            count ++;
            n=n/10;
        }

        return count;
    }

}

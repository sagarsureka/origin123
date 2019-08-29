// To find whether a number is a Smith Number or not

import java.util.*;
class SmithNumber
{
    public static void ShowSmithNumber()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input a number");
        int a=sc.nextInt();
        int x=a,r=0,s=0;
        while(x>0)
        {
            r=x%10;
            x=x/10;
            s=s+r;
        }
        int t=PrimeFactor(a);
        if(s==t)
        System.out.println(a+" is a Smith Number");
        else
        System.out.println(a+" is not a Smith Number");
    }
    // Finding the sum of all the prime factors of a number
    public static int PrimeFactor(int x)
    {
        int s=0,i=2;
        while(i<=x/2)
        {
            if(x%i==0)
            {
                x=x/i;
                if(IsPrime(i))
                s=s+Sum(i);
            }
            else
            i++;    
        }
        s=s+Sum(x);
        return s;
    }
    // Checking whether a number is prime or not
    public static boolean IsPrime(int x)
    {
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
            return false;
        }
        return true;
    }
    // Finding the sum
    public static int Sum(int x)
    {
        int r=0,s=0;
        while(x>0)
        {
            r=x%10;
            x=x/10;
            s=s+r;
        }
        return s;
    }
}
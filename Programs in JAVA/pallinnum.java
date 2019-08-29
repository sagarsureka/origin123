import java.util.*;
class pallinnum
{
    boolean ispall(int a)
    {
        int rev=0,copy=a;
        while(copy!=0)
        {
            rev=rev*10+copy%10;
            copy/=10;
        }
        if(rev==a)
        return true;
        else 
        return false;
    }
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int d=0,c1=num;
        while(c1!=0)
        {
            d++;
            c1/=10;
        }
        int expi=(int)Math.pow(10,d-1);
        System.out.println("Pallindromes:");
        for(int i=1;i<=d;i++)
        {
            for(int j=1;j<=d-i;j++)
            {
                int a=(num/expi)%10;
                int expi2=expi/((int)Math.pow(10,j));
                int expi3=(int)Math.pow(10,j);
                int c=(num/expi2)%expi3;
                a=a*expi3+c;
                if(ispall(a))
                System.out.println(a);
            }
            expi=expi/10;
        }
    }
}
                
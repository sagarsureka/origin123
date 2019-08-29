import java.util.*;
class conseccompsum
{
    public void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a and b");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int x=0; int sum=0;
        int max=0; int j=0;
        for(int i=a;i<=b;i++)
        {
            x=i;
            sum=0;
            while(prime(x)==0)
            {
                sum=sum+x;
                x++;
            }
            if(sum>max)
            {
                max=sum;
                j=i;
            }
        }
        int sum2=0;
        for(int  i=j;;i++)
        {
            System.out.println(i);
            sum2=sum2+i;
            if(sum2==max)
            break;
        }
    }
    int prime(int a)
    {
        for(int i=2; i<=(a/2);i++)
        {
            if(a%i==0)
            return 0;
        }
        return 1;
    }
}
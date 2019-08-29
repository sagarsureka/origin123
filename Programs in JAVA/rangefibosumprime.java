import java.util.*;
class rangefibosumprime
{
    public void main()
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("enter range limit");
        int ll=sc.nextInt();
        int ul=sc.nextInt();
        int a[]=new int[ul];
        int b[]=new int[ul-ll ];
        int x=0;
        a[0]=1;a[1]=1;a[2]=2;
        if(ll<=1)
        {
            b[0]=1;
            b[1]=1;
            x=2;
        }   
        for(int i=2;i<ul;i++)
        {
             a[i]=a[i-1]+a[i-2];
             if(a[i]>ul)
             break;
             if(a[i]>=ll && a[i]<=ul)
             b[x++]=a[i];
        }
        System.out.println("a:");
        for(int i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
        System.out.println();
        System.out.println("b:");
        for(int i=0;i<b.length;i++)
        System.out.print(b[i]+" ");
        System.out.println();
        int l=0;int lmax=0;int pos=0;
        for( int i=0;i<x;i++)
        {
            for(int k=0;k<x-i;k++)
            {
                int sum=0;l=0;
                for(int j=i;j<x-k;j++)
                {
                    sum+=b[j];l++;
                }
                if(isprime(sum))
                {
                    if(l>=lmax)
                    {
                        lmax=l;
                        pos=i;
                    }
                }
            }
        }
        System.out.println("longest range");
        for(int i=pos;i<pos+lmax;i++)
        System.out.print(b[i]+" ");
    }
    boolean isprime(int a)
    {
        for(int i=2;i<=(a/2);i++)
        if(a%i==0)
        return false;
        return true;
    }
}
                
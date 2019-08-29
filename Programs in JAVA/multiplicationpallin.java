import java.util.*;
class multiplicationpallin
{//class begins
    public void main()
    {//main function begins
        int a[]=new int[100];
        x:for(int i=10;i<100;i++)
        {
            if(i==rev(i))
            continue x;
            y:for(int j=10;j<100;j++)
            {
                 if(a[i]==1 || a[rev(i)]==1)
                 continue x;
                if(a[j]==1 || a[rev(j)]==1)
                continue y;
                if(j==rev(i))
                continue y;
                if(i*j==rev(i)*rev(j))
                {
                    System.out.println(i+" , "+j+" : "+rev(i)+" , "+rev(j));
                    a[i]=1;
                    a[j]=1;
                    a[rev(i)]=1;
                    a[rev(j)]=1;
                }
            }
        }
    }
    int rev(int a)
    {
        int r=0;
        while(a!=0)
        {
            r=r*10+a%10;
            a/=10;
        }
        return r;
    }//rev function ends
}//class ends
        
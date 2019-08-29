import java.util.*;
class patch
{
    int arr[][];
    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();
        arr = new int [size][size];
        System.out.println("enter the numbers");
        for( int i=0;i<size;i++)
        {
            for(int j=0;j<size; j++)
            arr[i][j]=sc.nextInt();
        }
        int n=0,max=0,p=2,pmax=0;
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(arr[i][j]==1)
                {
                    n=check(i,j,p++);
                    if(n>max)
                    {
                        max=n;
                        pmax=p;
                    }
                }
            }
        }
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if( arr[i][j]==0)
                System.out.print("0");
                else
                if( arr[i][j] ==pmax)
                System.out.print("9");
                else
                 System.out.print("1");
            }
            System.out.println();
        }
    }
    int check(int r,int c, int var)
    {
        arr[r][c]=var;
        int l=0,d=0,ri=0,dr=0,dl=0,ur=0,ul=0,u=0;
        if(c-1>=0)
        {
            if(arr[r][c-1]==1)
            l=check(r,c-1,var)+1;
            if(r+1<arr[0].length)
            {
                if(arr[r+1][c-1]==1)
                dl=check(r+1,c-1,var)+1;
            }
        }
        if(r+1<arr[0].length)
        {
            if(arr[r+1][c]==1)
            d=check(r+1,c,var)+1;
        }
        if(c+1<arr[0].length)
        {
            if(arr[r][c+1]==1)
            ri=check(r,c+1,var)+1;
            if(r+1<arr[0].length)
            {
                if(arr[r+1][c+1]==1)
                dr=check(r+1,c+1,var)+1;
            }
        }
        if(r-1>=0)
        {
            if(c+1<arr[0].length)
            {
                if(arr[r-1][c+1]==1)
                ur=check(r-1,c+1,var)+1;
            }
            if(c-1>=0)
            {
                if(arr[r-1][c-1]==1)
                ur=check(r-1,c-1,var)+1;
            }
            if(arr[r-1][c]==1)
            u=check(r-1,c,var)+1;
        }
        return (ri+d+l+dr+dl+ur+ul+u);
    }
}
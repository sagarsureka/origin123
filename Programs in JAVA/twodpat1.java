import java.util.*;
class twodpat1
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the required 2-D matrix.");
        int size=sc.nextInt();
        int arr[][]=new int[size][size];
        int n=(size+1)/2;
        for(int i=n;i<size;i++)
        {
            for(int j=0;j<size;j++)
            arr[i][j]=(i+1);
        }
        int a=2;
        n=n-1;
        arr[0][n]=1;
        int hor=0;
        while(a<=n+1)
        {
            for(int i=0;i<a;i++)
            arr[i][n-a+1]=a;
            for(int i=0;i<a;i++)
            arr[i][n+a-1]=a;
            for(int i=n-hor;i<=n+hor;i++)
            arr[a-1][i]=a;
            hor++;
            a++;
        }
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            System.out.print(arr[i][j] +" " );
            System.out.println();
        }
    }
}
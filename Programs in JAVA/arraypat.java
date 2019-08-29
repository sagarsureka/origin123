import java.util.*;
class arraypat
{
    public void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter required number of outputs");
        int n=sc.nextInt();
        int a=1;
        int c=(int)Math.pow(2,0);
        int b=(int)Math.pow(2,n);
        int arr[][]=new int[b][b];
        arr[b-1][0]=a;
        for(int k=1;k<=n;k++)
        {
            for(int i=b-c;i<b;i++)
            {
                for(int j=0;j<c;j++)
                {
                    arr[i-c][j]=arr[i][j];
                    arr[i-c][j+c]=arr[i][j];
                    arr[i][j+c]=arr[i][j];
                    if(arr[i][j]==0)
                    arr[i][j]=a;
                    else
                    arr[i][j]=0;
                }
            }
            c=(int)Math.pow(2,k);
            for(int i=b-c;i<b;i++)
            {
                for(int j=0;j<c;j++) 
                    System.out.print(arr[i][j]);
                System.out.println();
           }
        }
    }
}
                
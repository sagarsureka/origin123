class twoDnumpat
{
    public void main(int n,int num1)
    {
        int a[][]=new int[n][8*n];
        a[0][0]=num1;
        int c=1; int p=0;
        for(int i=0; i<n-1;i++)
        {
            p=0;
            for(int j=0;j<8*n-1;j++)
            {
                if(a[i][j]!=0)
                {
                    for(int k=0;k<j;k++)
                    if(a[i][k]==a[i][j])
                    continue;
                    for(int k=j+1;k<n;k++)
                    if(a[i][k]==a[i][j])
                    c++;
                    a[i+1][p++]=a[i][j];
                    a[i+1][p++]=c;
                }
            }
            c=1;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<8*n;j++)
            if(a[i][j]!=0)
            System.out.print(a[i][j]);
            System.out.println();
        }
    }
}
            
               
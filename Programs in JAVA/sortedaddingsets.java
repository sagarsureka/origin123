import java.util.*;
class sortedaddingsets
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements and values of set 1 in ascending");
        int len1=sc.nextInt();//accepts the number of elements in set 1
        int a[]=new int[len1];
        for(int i=0;i<len1;i++)
        a[i]=sc.nextInt();//accepts values of set 1
        System.out.println("Enter number of elements and values of set 2 in descending");
        int len2=sc.nextInt();//accepts number of elements in set 2
        int b[]=new int[len2];
        int c[] = new int[len1+len2];
        for(int i=1;i<=len2;i++)
        {
            b[len2-i]=sc.nextInt();
            c[len2-i]=b[len2-i];
        }
        int x=0;
        a:for(int i=0;i<len1;i++)
        {
            for(int j=x;j<len2+i;j++)
            {
                if(c[j]<=a[i] && c[j+1]>=a[i])
                {
                    for(int k=len2+i;k>=j+2;k--)
                    c[k]=c[k-1];
                    c[j+1]=a[i];
                    x=j;
                    continue a;
                }
            }
        }
         System.out.println("union set:");
        for(int i=0;i<c.length;i++)
        System.out.println(c[i]);
    }//main function ends
}//class ends
import java.util.*;
class factors
{
    public void main()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int s=sc.nextInt();
    int arr[]=new int[s];
    for(int i=0;i<s;i++)
    {
         System.out.println("Enter factor");
         arr[i]=sc.nextInt();
        }
        int max=0;
    for(int i=0;i<s;i++)
    {
        if(arr[i]>max)
        max=arr[i];
    }
    System.out.println("Number 1="+max);
    for(int i=0;i<s;i++)
    {
        if(max%arr[i]==0 && arr[i]!=0)
            arr[i]=0;
    }
    int max2=0;
    for(int i=0;i<s;i++)
    {
        if(arr[i]>max2)
        max2=arr[i];
    }
    if(max2!=0)
    {
        System.out.println("Number 2="+max2);
    }
    else
        System.out.println("Number 2="+max);
    }
}
import java.util.*;
class keith_number
{
     public void main()
     {
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter a number");
         int num=sc.nextInt();//Accepts the number from the user
         int x=num,d=0;
         while(x>0)
         {
             x=x/10;
             d++;//stores the number of digits
         }
         int arr[]=new int[d];//initialises an array to store the digits
         int c=num,sum=0;int i;
         for(i=arr.length-1;i>=0;i--)
         {//loop to store the digits of the number in the array
             arr[i]=c%10;
             c/=10;
         }
         while(sum<num)
         {
             sum=0;
             for(i=0;i<arr.length;i++)
                 sum=sum+arr[i];
             for(i=1;i<arr.length;i++)
                 arr[i-1]=arr[i];
             arr[arr.length-1]=sum;
         }
         if(sum==num)
         System.out.println("The number is a KEITH NUMBER "+num);
         else
         System.out.println("The number is NOT a KEITH NUMBER"+num);
     }
    
}











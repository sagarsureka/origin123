//write a program to print a unique pattern
import java.util.*;
public class PatternHappy
{//start of class
    public static void main()
    {//start of main method
        Scanner sc= new Scanner(System.in);
         System.out.println("Enter Word");
        String n = sc.nextLine();
       int i,j,s=1,f=4;
        for(i=1;i<=11;i++)
        {
            System.out.print(n.substring(0,f+1));//displays the left part of the line
            if(i==1||i==11)
                System.out.print("-");
            else
            {
                for(j=1;j<=s;j++)
                    System.out.print(" ");//displays the spaces
            }
            System.out.print(n.substring(4-f,5));//displays the right side of the line
            if(i==1||i==10)
                s=s;
            else if(i<6)
            {
                s+=2;
                f--;
            }
            else
            {
                s-=2;
                f++;
            }
            System.out.println();
        }
    } //end of the function main
}//end of class

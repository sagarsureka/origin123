import java.util.*;
class letter2D
{
    public void main()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter string");
        String sen=sc.nextLine();
        int arr[][]=new int[26][26];
        System.out.print("  ");
        for(int i=0;i<26;i++)
        {
             System.out.print((char)(65+i)+" ");
        }
        System.out.println();
        for(int i=0;i<sen.length()-1;i++)
        {
            char a=sen.charAt(i);
            char b=sen.charAt(i+1);
            if(a!=' ' && b!=' ')
            arr[(int)(a)-65][(int)(b)-65]= arr[(int)(a)-65][(int)(b)-65]+1;
        }
        for(int i=0;i<26;i++)
        {
            System.out.print((char)(65+i)+" ");
            for(int j=0;j<26;j++)
            System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
}
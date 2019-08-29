import java.util.*;
class lenarrg
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a sentence in lowercase");
        String Sentence=sc.nextLine();
        String s=Sentence+" ";
        String A[]=new String[s.length()];
        int k=0;
        String w="";
        for(int i=0;i<s.length();i++)// Stores each word in an array
        {
            if(s.charAt(i)!=' ')
                w=w+s.charAt(i);
            else
            {
                A[k++]=w;
                w="";
            }
        }
        for(int i=0;i<k;i++)// Arranges the words lengthwise in ascending order
        {
            for(int j=0;j<k-i-1;j++)
            {
                if(A[j].length()>A[j+1].length())
                {//interchanges position of words based on length
                    String t=A[j];
                    A[j]=A[j+1];
                    A[j+1]=t;
                }
            }
        }
        System.out.println("The inputed string is: "+s);
        System.out.print("Arranging lengthwise in ascending order: ");
        for(int i=0;i<k;i++)
        {
            System.out.print(A[i]+" ");//prints the altered string
        }
        System.out.println();
    }
}
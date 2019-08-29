
//write a program to input two strings and show if inputs are anagrams of one another
import java.io.*;
class AnagramicWords
{//start of class
    public static void main()throws IOException
    {//start of main method
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print(" Enter the first word : ");
        String str=br.readLine();
        System.out.print(" enter the second word : ");
        String str1=br.readLine();
        String a[]=new String[str.length()];
        String b[]=new String[str1.length()];
        if(str.length()!=str1.length())
        {//to eliminate random inputs as anagram 
            System.out.println("Not anagramic");
            System.exit(0);
        }
        for(int i=0;i<str.length();i++)
        {
            a[i]="";
            b[i]="";
        }
        for(int i=0;i<str.length();i++)
        {
            a[i]+=str.charAt(i);
            b[i]+=str1.charAt(i);
        }        
        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<str.length()-1-i;j++)
            {
                if(a[j].compareToIgnoreCase(a[j+1])>0)
                {
                    String temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
                if(b[j].compareToIgnoreCase(b[j+1])>0)
                {
                    String temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                }
            }
        }        
        for(int i=0;i<str.length();i++)
        {
            if(a[i].equalsIgnoreCase(b[i]))
            continue;
            else
            {
                System.out.println("Not Anagramic");
                System.exit(0);
            }
        }
        System.out.println("Anagramic");
    }//end of main method
}

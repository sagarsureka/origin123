import java.io.*;
public class Counting
{
    public static void main()throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("enter text...");
        String a = br.readLine();
        char c;
        int i=0,d=a.length(),ascii=0,v=0,co=0,sp=0,sc=0,n=0;
        while(i<d)//counting 
        {
            c=a.charAt(i);
            ascii=(int)c;
            if(ascii==32)
            sp++;
            else if(ascii>=65 && ascii<=90)
            {
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                v++;
                else
                co++;
            }
            else if(ascii>=97 && ascii<=122)
            {
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                v++;
                else
                co++;
            }
            else if(ascii>=48 && ascii<=57)
            n++;
            else
            sc++;
            
            i++;
        }
        System.out.println();//displaying menu
        System.out.println("enter your choice - e.g. type 1 to get the frequency of spaces");
        System.out.println("1 - Spaces");
        System.out.println("2 - Vowels");
        System.out.println("3 - Consonants");
        System.out.println("4 - Digits");
        System.out.println("5 - Special Characters");
        System.out.println("6 - all of the above");
        System.out.println();
        System.out.println("choice ?");
        int ch=Integer.parseInt(br.readLine());
        System.out.println();
        if(ch==1)//printing accordingly
        System.out.println("frequency of spaces - "+sp);
        else if(ch==2)
        System.out.println("frequency of vowels - "+v);
        else if(ch==3)
        System.out.println("frequency of consonants - "+co);
        else if(ch==4)
        System.out.println("frequency of digits - "+n);
        else if(ch==5)
        System.out.println("frequency of special characters - "+sc);
        else if(ch==6)
        {
            System.out.println("frequency of spaces - "+sp);
            System.out.println("frequency of vowels - "+v);
            System.out.println("frequency of consonants - "+co);
            System.out.println("frequency of digits - "+n);
            System.out.println("frequency of special characters - "+sc);
        }
        else
        System.out.println(" Wrong choice ");
    }
}

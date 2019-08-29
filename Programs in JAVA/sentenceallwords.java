import java.util.*;
class sentenceallwords
{
    public void main()
    {//main function begins
        Scanner sc= new Scanner (System.in);
        String sen[]=new String[5];
        System.out.println("enter 5 sentences");
        int wordtot=0;
        for(int i=0;i<5;i++)
        {//for loop begins
            sen[i]=sc.nextLine()+" ";
            wordtot+=num(sen[i]);
        }
        String wordarr[]=new String[wordtot];
        String word="";
        int p=0;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<sen[i].length();j++)
            {
                if(sen[i].charAt(j)!=' ')
                word=word+sen[i].charAt(j);
                else
                {
                    wordarr[p]=word;
                    word="";//word is changed to null
                    p++;
                }
            }
        }
        System.out.println("required sentence(if any):");
        for(int i=0;i<5;i++)
        {
            if(containsall(sen[i],wordarr))
            {
                System.out.println(sen[i]);
                break;
            }
        }
    }
    int num(String a)
    {
        int n=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)==' ')
            n++;
        }
        return n;
    }
    boolean containsall(String a, String arr[])
    {
        String word="";
        for(int i=0;i<a.length();i++)
        {
             if(a.charAt(i)!=' ')
                word=word+a.charAt(i);
             else
             {
                 for(int j=0;j<arr.length;j++)
                 {
                     if(word.equals(arr[j]))
                     arr[j]="";
                 }
                 word="";
             }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(!arr[i].equals(""))
            return false;
        }
        return true;
    }
}//class ends
                
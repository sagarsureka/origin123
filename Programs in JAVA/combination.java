import java.util.*;
class combination
{
    String word;//initialises class variable
    combination(String w)
    {//constructor
        word=w;
    }
    public void main()
    {//main function begins
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a word");
        String w=sc.nextLine();//accepts string
        combination cc1=new combination(w);
        cc1.recur(word,"");
    }
    void recur(String cb, String pre)
    {
        if(cb.equals(""))
        {
            System.out.println(pre);
            return;
        }
        for(int i=0;i<cb.length();i++)
        {
            if(i<(cb.length()-1))
            {
                String a=cb.substring(i,i+1);
                String b=cb.substring(0,i)+cb.substring(i+1);
                recur(b,pre+a);
            }
            else
            {
                String a=cb.substring(cb.length()-1);
                String b="";
                if(cb.length()!=1)
                 b=cb.substring(0,cb.length()-1);
                else
                 b="";
                recur(b,pre+a);
            }
        }
    }
}//class ends
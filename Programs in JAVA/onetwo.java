import java.util.*;
class onetwo
{
    public void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        int p=0;
        str=" "+str+" ";
        String ar[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                String s=str.substring(p+1,i);
                p=i;
                a:for(int j=0;j<10;j++)
                {
                    if(s.equalsIgnoreCase(ar[j]))
                    {
                        System.out.print(j);
                        break a;
                    }
                }
            }
        }
        
    }
}
import java.util.*;
class bin2hexanodec
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Binary number");
        String bin=sc.nextLine();
        String befdecbin="";
        String postdecbin="";
        int g=bin.indexOf(".");
        befdecbin=bin.substring(0,g);
        postdecbin=bin.substring(g+1);
        if((befdecbin.length()%4)!=0)
        {
            int a=befdecbin.length()%4;
            for(int i=0;i<a;i++)
            befdecbin="0"+befdecbin;
        }
        if((postdecbin.length()%4)!=0)
        {
            int a=postdecbin.length()%4;
            for(int i=0;i<a;i++)
            postdecbin=postdecbin+"0";
        }
        String befdechex="";
        String postdechex="";
        String a="";
        for(int i=0;i<befdecbin.length();i++)
        {
            if(((i+1)%4)==0)
            {
                a=a+befdecbin.charAt(i);
                befdechex=befdechex+tohex(a);
                a="";
            }
            else
            {
                a=a+befdecbin.charAt(i);
            }
        }
        a="";
        for(int i=0;i<postdecbin.length();i++)
        {
            if(((i+1)%4)==0)
            {
                a=a+postdecbin.charAt(i);
                postdechex=postdechex+tohex(a);
                a="";
            }
            else
            {
                a=a+postdecbin.charAt(i);
            }
        }
        System.out.print(befdechex);
        System.out.print(".");
        System.out.print(postdechex);
    }
    String tohex(String a)
    {
        String arr[]={"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
        for(int i=0;i<16;i++)
        {
            if(a.equals(arr[i]))
            {
                if(i<10)
                {
                    String s=""+i;
                    return s;
                }
                else
                {
                    char c=(char)(87+i);
                    String s=""+c;
                    return s;
                }
            }
        }
        return "";
    }
}
                    
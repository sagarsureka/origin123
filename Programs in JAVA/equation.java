import java.util.*;
class equation
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the eqution");
        String eq=sc.nextLine();
        int arr[]=new int[4];
        int qar[]=new int[3];
        int p=0;
        for(int i=0;i<eq.length();i++)
        {
            if(eq.charAt(i)=='?')
            qar[p++]=i;
        }
        arr[0]=Integer.parseInt(eq.substring(0,qar[0]));
        arr[1]=Integer.parseInt(eq.substring(qar[0]+1,qar[1]));
        arr[2]=Integer.parseInt(eq.substring(qar[1]+1,qar[2]));
        arr[3]=Integer.parseInt(eq.substring(qar[2]+1));
        if((arr[0]+arr[1]+arr[2])==arr[3])
        {
            System.out.println(arr[0]+"+"+arr[1]+"+"+arr[2]+"="+arr[3]);
        }
        else
        if((arr[0]+arr[1]-arr[2])==arr[3])
        {
            System.out.println(arr[0]+"+"+arr[1]+"-"+arr[2]+"="+arr[3]);
        }
        else
        if((arr[0]-arr[1]+arr[2])==arr[3])
        {
            System.out.println(arr[0]+"-"+arr[1]+"+"+arr[2]+"="+arr[3]);
        }
        else
        if((arr[0]-arr[1]-arr[2])==arr[3])
        {
            System.out.println(arr[0]+"-"+arr[1]+"-"+arr[2]+"="+arr[3]);
        }
        else
        System.out.println("Not applicable for the given input");
    }
}
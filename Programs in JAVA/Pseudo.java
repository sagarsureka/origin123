import java.util.*;
class Pseudo
{
    int n,A[],ans,flag,sum,r; // member variables
    Pseudo() // constructor
    {
        n=ans=flag=sum=r=0;
    }
    // To accept numbers
    void accept()
    {
        int i;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of terms in sequence");
        int nn=sc.nextInt();//accepts the number of terms
        n=nn;
        A=new int[n];
        System.out.println("Enter the number");
        for(i=0;i<n;i++)
            A[i]=sc.nextInt();
    }
    // To check for PseudoArithmetic sequence
    boolean check()
    {
        int i,j;
        r=A[0]+A[n-1];
        if(n%2==0)
            ans=1;
        for(i=0,j=n-1;i<n/2;i++,j--)
        {
            sum=A[i]+A[j];
            if(sum!=r)
            {
                flag=1;
                break;
            }
        }
        if(ans==0)
        {//checks for middle term
            sum=2*A[n/2];
            if(sum!=r)
                flag=1;
        }
        if(flag==0)
            return true;
        else
            return false;
    }
    public void main()
    {
        Pseudo ob=new Pseudo();
        ob.accept();
        boolean x=ob.check();
        if(x==true)
            System.out.println("PseudoArithmetic Sequence");
        else
            System.out.println("Not a PseudoArithmetic Sequence");
    }
}
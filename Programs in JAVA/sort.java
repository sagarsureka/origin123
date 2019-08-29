import java.io.*;
class sort

{
    public void main() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of elements in the string");
        int n=Integer.parseInt(br.readLine());
        String nam[]=new String[n];
        for(int i=0;i<n;i++)
        {
            nam[i]=br.readLine();
        }
        for(int i=0;i<n-1;i++)
        {
            String min=nam[i]; int pos=i;
            for (int j=i+1;j<n;j++)
            {
                if(nam[j].compareTo(min)<0)
                {
                    min=nam[j];
                    pos=j;
                }
            }
            String t=nam[i];
            nam[i]=nam[pos];
            nam[pos]=t;
        }
        for (int i=0;i<n;i++)
        System.out.println(nam[i]);
    }
}
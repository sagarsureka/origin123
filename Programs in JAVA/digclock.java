class digclock
{
    public void main()
    {
        for(int i=0;i<24;i++)
        {
            String t="";
            if(i<12)
            t=" am";
            else t=" pm";
            for (int j=0;j<60;j++)
            {
               for(int k=1; k<60;k++)
               {
                   System.out.print(i+":"+j+":"+k+t);double a=65000000.0;
                   while(a!=0)
                   {a=a-0.250;}
                   System.out.print("\f");
                }
                
            }
        }
        main();
    }
}
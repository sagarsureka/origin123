class lucky
{
    public void main()
    {
        int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
        int c=0;int nz=0;int sp=2; //initialising the variables
        while(sp < (50-nz))
        {
            nz=0; //initialising nz to 0
            for(int i=0;i<50;i++)
            {
                if(a[i]!=0)
               {
                   if(c%sp==(sp-1)) //checking for condition
                   a[i]=0;//replace values to be replaced with 0
                   c++;
               }
            }
            for(int i=0; i<50 ;i++) //loop begins
            {
                if(a[i]==0)
                nz++;
            }
            sp++;
            c=0;
        }
        for(int i=0;i<50;i++)
        {
            if(a[i]!=0)
            System.out.println(a[i]); //printing the lucky numbers 
        }
    }
}
            
// Sort arrays conatining 0,1,2
public class srt {
    public static void main(String args[])
    {
        int myarr[]={0,0,1,0,2,1,0,2,2,1,2,1,2,0};
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<myarr.length;i++)
        {
            if(myarr[i]==0)
            {
                count0++;
            }
            else if(myarr[i]==1)
            {
                count1++;
            }
            else
            count2++;

        }

        for(int i=0; i<count0;i++)
        {
            myarr[i]=0;
        }
        for(int i=count0; i<count0+count1;i++)
        {
            myarr[i]=1;
        }
        for(int i=count0+count1;i<count0+count1+count2;i++)
        {
            myarr[i]=2;
        }
        for(int i=0;i<myarr.length;i++)
        {
            System.out.print(myarr[i]);
        }
    }
    
}

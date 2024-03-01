public class oneoccurance {
    public static void main(String args[])
    {
        int arr[]={5,5,1,4,4,9,3,7,7,9,3};
        int num=0;
        for(int i=0;i<arr.length;i++)
        {
            int c=0;
             num=arr[i];
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]==num)
                {
                    c++;
                }

            }
            if(c==1)
            {
                break;
            }

        }
        System.out.println(num);
    }
    
}

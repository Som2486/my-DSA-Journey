public class maxSubArr {
    public static void main(String args[])
    {
        int arr[]={1,-2,-3,4,-1,-1,2,3,-2,-1};
        int l=arr.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
       
        for(int i=0;i<l;i++)
        {
            sum+=arr[i];

            if(sum>max)
            {
                max=sum;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        System.out.println(max);

    }

    
}

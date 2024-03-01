public class findmissing {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,6,7,8};
        int sum=0;
        int l=arr.length;

        int tsum=(l*(l+1))/2;
        for(int i=0;i<l;i++)
        {
            sum=sum+arr[i];

        }
        System.out.println(tsum-sum);
    }
    
}

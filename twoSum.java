import java.util.Arrays;
public class twoSum {

    public static void main(String args[])
    {
        int arr[]={4,7,1,2,9,5,8};
        int target=10;
        int left=0;
        
        int right=arr.length-1;
        Arrays.sort(arr);
        while(left<right)
        {
            int sum=arr[left]+arr[right];
            if(sum==target)
            {
                System.out.println("YES");
            }
            else if(sum<target)
            {
                left++;
            }
            else{
                right--;
            }
        }
        
    }
    
}

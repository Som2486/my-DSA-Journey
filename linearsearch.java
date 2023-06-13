import java.util.*;
public class linearsearch{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int [] nums= new int[n];
        System.out.println("Enter array elements");
        for(int i=0; i<n;i++)
        {
            nums[i]=sc.nextInt();
             
        }
        System.out.println("Enter target element");
        int target=sc.nextInt();
        int a= linear( nums, target);
        System.out.println("Element found at index "+a);
    }

    static int linear( int[]nums, int target)
    {
        if(nums.length==0)
        {
            return -1;
        }
        for(int i=0; i< nums.length;i++)
        {
            if(nums[i]== target)
            {
                return i;
            }
        }
        return -1;

    }
}
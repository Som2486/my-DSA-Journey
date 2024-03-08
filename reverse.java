import java.util.*;
public class reverse {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in); 
       int d=sc.nextInt();
       int a[]={5,2,4,7,1,9,3,8};
       

    }

    void reverse(int arr[], int start, int end)
    {
        while(start<=end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    
}

import java.util.*;
public class leaders {
    public static void main(String args[])
    {
        
        int arr[]={16,17,4,3,5,2};
        int l=arr.length;
        ArrayList<Integer> ans=new ArrayList<>();

        int max=arr[l-1];
        ans.add(arr[l-1]);

        for(int i=l-2;i>=0;i--)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                ans.add(arr[i]);
            }
        }
        System.out.print(ans);
        
        


    }
}

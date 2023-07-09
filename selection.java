import java.util.*;
public class selection {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        int start;
        int end;
        
        int arr[]={2,5,1,4,3};
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        select(arr);
        System.out.println(Arrays.toString(arr));
    }
        static void select(int[] arr)
        {
            for(int i=0;i<arr.length; i++)
            {
                int last=arr.length-i-1;
                int max=getMax(arr, 0, last);
                swap(arr, max, last);

            }
        }
        static void swap(int[] arr, int first, int second)
        {
            int temp=arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
        }
        static int getMax(int [] arr, int start, int end)
        {
            int max=start;
            for(int i=start;i<end;i++)
            {
                if(arr[max]< arr[end])
                {
                    max=i;

                }
            }
            return max;
        }
    }
    


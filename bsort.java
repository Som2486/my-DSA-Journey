import java.util.*;
public class bsort {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        bubblesort(arr);
    
        System.out.println(Arrays.toString(arr));
    }    static void bubblesort(int[] arr){
            for(int i=0;i< n;i++)
            {
                for(int j=1;j<arr.length-1;j++){
                    if(arr[j]<arr[j-1])
                    {
                        int temp=arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                    }
                }
            }
        }
    }
    
}

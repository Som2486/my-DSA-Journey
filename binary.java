import java.util.*;
public class binary {
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter size of array");
         int n=sc.nextInt();
         int [] arr=new int[n];
         System.out.println("Enter array elements");
         for(int i=0; i< n;i++)
         {
          arr[i]=sc.nextInt();
         }
         System.out.println("Enter target element");
         
         int target=sc.nextInt();
         int result= binarysearch(arr, target);
         System.out.println(result);
    }
    static int binarysearch(int[] arr, int target)
{
  int start=0;
  int end= arr.length-1;
  while(start<= end){
int mid= start +(end -start)/2;
if(target < arr[mid]){
end=mid-1;
}
else if(target > arr[mid])
{
  start=mid+1;
}
else {
return mid;
}
  }
  return -1;

}    
}

//5,-1,2,-3,7,-2

public class rearrange {
    public static void main(String args[])
    {
        int arr[]={5,-1,2,7,-3,-2};
        int l=arr.length;
        int arr1[]=new int[l];
        int pos=0;
        int neg=1;
        for(int i=0;i<l;i++)
        {
            if(arr[i]>0)
            {
                arr1[pos]=arr[i];
                pos+=2;
            }
            else{
                arr1[neg]=arr[i];
                neg+=2;
            }
        }
        for(int i=0;i<l;i++)
        {
          System.out.print(arr1[i]);  
        }
    }
}

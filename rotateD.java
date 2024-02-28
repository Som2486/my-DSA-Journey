// Brute force Solution

import java.util.Scanner;

public class rotateD {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int arr[]={5,7,1,9,3,4,6};
		int l=arr.length;
		k=k%l;
		int temp[]=new int[k];
		for(int i=0;i<k;i++)
		{
		    temp[i]=arr[i];
		    
		}
		for(int i=k;i<l;i++)
		{
		    arr[i-k]=arr[i];
		}
		for(int i=l-k;i<l;i++)
		{
		    arr[i]=temp[i-(l-k)];
		}
		for(int i=0;i<l;i++)
		{
		    System.out.print(arr[i]);
		}
    
}
}

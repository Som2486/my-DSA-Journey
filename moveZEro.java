public class moveZEro {

    public static void main(String[] args) {
		int arr[]={5,7,9,0,9,1,0,3,0,2,0,4,7};
		int l=arr.length;
		int temp;
        int j=-1;
		for(int i=0;i<l;i++)
		{
		    if(arr[i]==0)
		    {
		        j=i;
		        break;
		    }
		}
		for(int i=j+1;i<l;i++)
		{
		    if(arr[i]!=0)
		    {
		        temp=arr[i];
		        arr[i]=arr[j];
		        arr[j]=temp;
		        j++;
		    }
		}
		for(int i=0;i<l;i++)
		{
		    System.out.print(arr[i]);
		}
    
}
}
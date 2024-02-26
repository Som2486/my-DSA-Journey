public class rmovedp {
    public static void main(String[] args) {
		int arr[]={1,1,2,2,3,3};
		int i=0;
		for(int j=1;i<arr.length;j++)
		{
		    if(arr[i]!=arr[j]){
		    arr[i+1]=arr[j];
		    i++;
		    }
		}
		System.out.println(i+1);
    
}
}
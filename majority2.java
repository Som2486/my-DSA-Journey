public class majority2 {
    public static void main(String args[])
    {
        int arr[]={5,4,1,2,5,5,5,7,6,5,5,4,9,8,5,5,5,3,5};
        int l=arr.length;
        int cnt=0;
        int el=0;
        for(int i=0;i<l;i++)
        {
            if(cnt==0)
            {
                cnt=1;
                el=arr[i];
            }
            else if(arr[i]==el)
            {
                cnt++;
            }
            else{
                cnt--;
            }

        }

        int cnt1=0;
        for(int j=0;j<l;j++)
        {
            if(arr[j]==el)
            {
                cnt1++;
            }
        }
        if(cnt1> l/2);
        {
        System.out.println(el);
        }
        
        

    
}
}

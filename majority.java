import java.util.*;
public class majority {
    public static void main(String args[])
    {
        int arr[]={1,5,5,7,4,1,2,3,1,2,2,2,2,3,2};
        int n=arr.length;
        HashMap<Integer, Integer>mp=new HashMap<>();
        for(int el:arr)
        {
           if(mp.containsKey(el))
           {
            mp.put(el, mp.get(el)+1);
           }
           else{
            mp.put(el, 1);
           }
        }

        for(int key: mp.keySet())
        {
            if(mp.get(key)>n/3)
            {
                System.out.println(key);

            }
        }

    }
    
}

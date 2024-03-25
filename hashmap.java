
import java.util.*; 
public class hashmap {
    public static void main(String args[])

    {
      int arr[]= {5,2,4,1,7,3,4,1,1,1,4};
      HashMap<Integer, Integer> mp=new HashMap<>();
      for(int el: arr)
      {
        if(!mp.containsKey(el)){
        mp.put(el,1);
        }
        else{
            mp.put(el, mp.get(el)+1);
        }
      }
      int maxfreq=0; int anskey=0;
      System.out.println(mp.entrySet());
      for(var e: mp.entrySet())
      {
        if(e.getValue()> maxfreq)
        {
            maxfreq=e.getValue();
            anskey=e.getKey();
        }
      }
      System.out.println(maxfreq+" "+ anskey);
    }
}

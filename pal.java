import java.util.StringTokenizer;

public class pal {
    public static void main(String args[])
    {
        String s="My name is naman";
        
        int c=0;
        String s1;
        StringTokenizer st=new StringTokenizer(s);
        int c1=st.countTokens();
      for(int i=0;i<=c1;i++)
        {
             s1=st.nextToken();
             if(isPallindrome(s1))
             {
                 System.out.println(s1);
                 c++;
             }
        }
        if(c>0){
          System.out.println(c);
    }
    else{
        System.out.println(0);
    }
    }
        public static boolean isPallindrome(String w)
        {
            String temp="";
            int l=w.length();
            
        
            while(l>0)
            {
                temp=temp+w.charAt(l-1);
                l=l-1;

            }
            return (temp.equals(w));


        
        }
    
    }
    


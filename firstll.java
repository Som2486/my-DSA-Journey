public class firstll
{
    private static node convert2ll(int [] arr){
        node head =new node(arr[0]);
        node mover=head;
        for(int i=1;i<arr.length;i++)
        {
            node temp=new node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }

    private static int lengOfll(node head)
    {
        int c=0;
        node temp=head;
        while(temp!=null)
        {
           // System.out.print(temp.data +" ");
            temp=temp.next;
            c++;
        }
        return c;
    }

    private static int searchInLL(node head, int search)
    {
        node temp=head;
        while(temp!=null)
        {
            if(temp.data==search)
            {
                return 1;
            }
            

        }
        return 0;
    }
    public static void main(String args[])
    {

        int arr[]={5,2,7,9,4};
        node head=convert2ll(arr);
       // System.out.println(head.data);
        //System.out.println(lengOfll(head));
        System.out.println(searchInLL(head,9));

       

        
    }


}

class node{
    int data;
    node next;

    node(int data,node next){
        this.data=data;
        this. next=next;
    }

        node(int data1)
        {
            this.data=data1;
            this.next=null;
        }
    }

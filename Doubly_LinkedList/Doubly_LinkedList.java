class Doubly<T>
{
    class Node
    {
        T data;
        Node pre=null;
        Node next=null;
    }

    Node start=null;
    Node end=null;
    int size;

    public boolean isEmpty()//O(1)
    {
        return start==null;
    }

    public void insertAtStart(T value)//O(1)
    {
        Node n=new Node();
        n.data=value;
        if(isEmpty())
        {
            start=end=n;
        }

        else
        {
         n.next=start;
         start.pre=n;
         start=n;
         }
        size++;
    }

    public T deleteAtStart() //O(1)
    {
        if(isEmpty())
        {
            return null;
        }
        else if(start.next==null)
        {   T temp=start.data;
            start=end=null;
            size--;
            return temp;
        }
        else
        {
            T temp=start.data;
            start=start.next;
            start.pre=null;
            size--;
            return temp;
        }
    }

    public void insertAtEnd(T value)//O(1)
    {
        Node n=new Node();
        n.data=value;
        if(isEmpty())
        {
            start=end=n;
        }
        else
        {
            end.next=n;
            n.pre=end;
            end=n;
        }
        size++;
    }
    public T deleteAtEnd() //O(1)
    {
        if(isEmpty())
        {
            return null;
        }
        else if(start.next==null)
        {
            T temp=end.data;
            end=start=null;
            size--;
            return temp;
        }
        else
        {
            T temp=end.data;
            end=end.pre;
            end.next=null;
            size--;
            return temp;
        }
    }
    public void traverse()//O(n)
    {
        Node t1=start;
        while(t1!=null)
        {
            System.out.print(" "+t1.data+"");
            t1=t1.next;
        }
    }

    public boolean search(T key)//O(n)
    {
        Node t1=start;
        while(t1!=null)
        {
            if(t1.data.equals(key))
            {
                return true;
            }
            t1=t1.next;
        }
        return false;
    }

}
public class Doubly_LinkedList
{
    public static void main(String[] args)
    {

        Doubly<Integer> list=new Doubly<>();
        System.out.println("The List is empty : "+list.isEmpty());
        list.insertAtStart(3);
        list.insertAtStart(2);
        list.insertAtStart(1);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.insertAtEnd(7);
        list.insertAtEnd(8);

        System.out.println("The size of the list is : "+list.size);
        System.out.println("The List is : ");
        list.traverse();
        System.out.println();
        System.out.println("After deleting 1 element("+list.deleteAtStart()+") The list is : ");
        list.traverse();
        System.out.println();
        System.out.println("After deleting last element("+list.deleteAtEnd()+") The list is : ");
        list.traverse();
        System.out.println();
        System.out.println("The 5 is present in list : "+list.search(5));
        System.out.println("The 15 is present in list : "+list.search(15));
        System.out.println("The list is : ");
        list.traverse();

    }
}

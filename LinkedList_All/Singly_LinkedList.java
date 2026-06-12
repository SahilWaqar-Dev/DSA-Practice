class Singly<T>
{
    class Node
    {
        T data;
        Node next;
    }

    int size;
    Node start=null;

    public boolean isEmpty()
    {
        return start==null;
    }

    public void insertAtStart(T value) //O(1)
    {
        Node n=new Node();
        n.data=value;
        n.next=start;
        start=n;
        size++;
    }

    public T deleteAtStart() //O(1)
    {
        if(isEmpty())
        {
            return null;
        }
        else
        {
            T temp=start.data;
            start=start.next;
            size--;
            return temp;
        }
    }

    public void insertAtEnd(T value) //O(n)
    {
        Node n=new Node();
        n.data=value;
        n.next=null;

        if(isEmpty())
        {
            start=n;
        }
        else
        {

            Node t1 = start;
            while (t1.next != null)
            {
                t1 = t1.next;
            }
            t1.next = n;

        }
        size++;
    }

    public T deleteAtEnd() //O(n)
    {
        if(isEmpty())
        {
            return null;
        }
        else if(start.next==null)
        {
            T temp=start.data;
            start=null;
            size--;
            return temp;
        }
        else
        {
            Node t1=start;
            Node t2=null;

            while(t1.next!=null)
            {   t2=t1;
                t1=t1.next;
            }
            T temp=t1.data;
            t2.next=null;
            size--;
            return temp;
        }
    }

    public boolean search(T key) //O(n)
    {
        Node t1=start;
        while(t1!=null)
        {
            if(t1.data==key)
                return true;
            t1=t1.next;
        }
        return false;
    }
    public void traverse() //O(n)
    {
        Node t1=start;
        while(t1!=null)
        {
            System.out.print(""+t1.data+" ");
            t1=t1.next;
        }
    }

}
public class Singly_LinkedList
{
    public static void main(String[] args)
    {
      Singly<Integer> list=new Singly<>();
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
        System.out.println("The 5 is present in list : "+list.search((5)));
        System.out.println("The 15 is present in list : "+list.search((15)));
        System.out.println("The list is : ");
        list.traverse();
    }
}
package CircularLinkedList;

class Circular<T>
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

    public boolean isEmpty()
    {
        return start==null;
    }
    public void insertAtStart(T value)
    {
        Node n=new Node();
          n.data=value;
          if(isEmpty())
          {
              start=end=n;
              n.next=start;
              n.pre=end;

          }
          else
          {
              n.next=start;
              start.pre=n;
              start=n;
              start.pre=end;
              end.next=start;
          }
          size++;
    }

    public T deleteAtStart()
    {
        if(isEmpty())
        {
            return null;
        }
        else if(start.next==start)
        {
            T temp=start.data;
            start=end=null;
            size--;
            return temp;
        }
        else
        {
            T temp=start.data;
            start=start.next;
            start.pre=end;
            end.next=start;
            size--;
            return temp;
        }
    }

    public void insertAtEnd(T value)
    {
        Node n=new Node();
        n.data=value;
        if(isEmpty())
        {
            start=end=n;
            n.next=start;
            n.pre=end;

        }
        else
        {
          n.pre=end;
          n.next=start;
          start.pre=n;
          end.next=n;
          end=n;
        }
        size++;
    }

    public T deleteAtEnd()
    {
        if(isEmpty())
        {
            return null;
        }
        else if(start.next==start)
        {   T temp=start.data;
            start=end=null;
            size--;
            return temp;
        }
        else
        {
            T temp=end.data;
            end=end.pre;
            end.next=start;
            start.pre=end;
            size--;
            return temp;
        }
    }

    public void traverse()
    {
        if(isEmpty())
        {
            System.out.println("The list is Empty");
        }
        else
        {
            Node t1 = start;
            do
            {
                System.out.println(""+t1.data);
                t1=t1.next;
            }
            while (t1 != start);
        }
    }

    public boolean search(T key)
    {
        if(isEmpty())
        {
            return false;
        }
        Node t1 = start;
        do
        {
            if(t1.data.equals(key))
            {
                return true;
            }
            t1=t1.next;
        }
        while (t1 != start);
        return false;
    }

}
public class Circular_LinkedList
{
    public static void main(String[] args)
    {
        Circular<Integer> list = new Circular<>();

        System.out.println("Is List Empty : " + list.isEmpty());

        System.out.println("\nInserting elements at Start");
        list.insertAtStart(30);
        list.insertAtStart(20);
        list.insertAtStart(10);

        System.out.println("Current List : ");
        list.traverse();

        System.out.println("\nInserting elements at End");
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertAtEnd(60);

        System.out.println("Current List : ");
        list.traverse();

        System.out.println("\nDeleting first element : " + list.deleteAtStart());

        System.out.println("List after deleting from start : ");
        list.traverse();

        System.out.println("\nDeleting last element : " + list.deleteAtEnd());

        System.out.println("List after deleting from end : ");
        list.traverse();

        System.out.println("\nSearching elements...");

        System.out.println("Is 40 present : " + list.search(40));
        System.out.println("Is 100 present : " + list.search(100));

        System.out.println("\nFinal List : ");
        list.traverse();

        System.out.println("\nIs List Empty : " + list.isEmpty());
        System.out.println("the size of the list is : "+list.size);
    }
}


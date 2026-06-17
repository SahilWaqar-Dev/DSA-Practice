class Stack<T>
{
    class Node
    {
        T data;
        Node next;
    }

    Node Top=null;
    int size=0;

  public boolean isEmpty()
  {
    return Top==null;
  }

  public void push(T value)
  {
    Node n=new Node();
    n.data=value;
    n.next=Top;
    Top=n;
    size++;
  }
 
  public T pop()
  {
    if(isEmpty())
    {
        System.out.println("The stack is empty ");
        return null;
    }
    else
    {
       T temp=Top.data;
       Top=Top.next;
       size--;
       return temp;
    }
  }

   public T peek()
  {
    if(isEmpty())
    {
        System.out.println("The stack is empty ");
        return null;
    }
    else
    {    
       return Top.data;
    }
  }

  public int size()
  {
    return size;
  }

}
public class StackLL
{
public static void main(String[] args)
{
    Stack<Integer> st = new Stack<>();
        
        System.out.println("is stack empty  " + st.isEmpty());
        
        st.push(10);
        st.push(20);
        st.push(30);
        
        System.out.println("Stack size is : " + st.size());
        System.out.println("Top element : " + st.peek());
        
        System.out.println("Popped element: " + st.pop());
        System.out.println("top element is: " + st.peek());
        System.out.println("Stack size is : " + st.size());
}
}
package Stack_using_Array;

class Stack<T>
{
    int top=-1;
    T[] arr=(T[])new Object[100];
    public boolean isEmpty()
    {
        return top<=-1;
    }
    public boolean isFull()
    {
        return top==arr.length-1;
    }
    public void push(T data)
    {  if(isFull())
    {
        System.out.println("Stack is full");
    }
    else {
        arr[++top] = data;

    }

    }
    public T pop(){
        if(isEmpty())
        {
            return null;
        }
        else {
            return arr[top--];
        }
    }
    public T peek()
    {
        if(isEmpty())
        {
            return null;
        }
        else{
            return arr[top];
        }
    }
    public int size()
    {
        return top+1;
    }
}
public class Stack_Using_Array {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        System.out.println("Is stack empty : " + st.isEmpty());


        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Stack size is: " + st.size());
        System.out.println("Top element (peek): " + st.peek());


        System.out.println("Popped element: " + st.pop());
        System.out.println("After pop top element is : " + st.peek());
        System.out.println("Stack size is now: " + st.size());

        }

}

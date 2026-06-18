
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

public class Expression_Converision 
{
    public static void main(String[] args) 
    {
        String expr="(a+((b*(c^d))/e))";

        System.out.println("The original expression is : "+expr);
        System.out.println("The post expression is : "+inToPost(expr));
        System.out.println("The pre expression is : "+inToPre(expr));

         //hamesha exp pre processed honi chahiya is coding k lehaz sa agar infix to pre or post fix ma convert
        //karna ho (means exp ma brackets waghera lagi ho )


    }

    public static String inToPost(String exp)
    {   Stack<Character> st=new Stack<>();
        String sExp="";
        for(int i=0;i<exp.length();i++)
        {
            char c=exp.charAt(i);

            if(c=='(')
            {
                st.push(c);
            }
            else if(c==')')
            {
                char ch=st.pop();
                while(ch!='(')
                {
                    sExp=sExp+ch;
                    ch=st.pop();
                }
            }
            else if(Character.isLetterOrDigit(c))
            {
                sExp+=c;
            }
            else {
                while(prec(st.peek())>=prec(c))
                {
                    sExp=sExp+st.pop();
                }
                st.push(c);

            }
        }
        return sExp;
    }
    public static int prec(char c)
    {
        switch(c)
        {
            case '^':
                return 4;
            case '*':
            case'/':
            case'%':
                return 3;
            case '+':
            case'-':
                return 2;
            case'(':
                return 1;
            default:
                return 0;
        }
    }

    public static String inToPre(String exp)
    {
      return reverse(inToPost(reverse(exp)));
    }

    public static String reverse(String exp)
    {   String solExp="";
        char c;
        for(int i=exp.length()-1;i>=0;i--)
        {
            c=exp.charAt(i);

            if(c=='(')
            {
              solExp=solExp+')';
            }
            else if(c==')')
            {
              solExp=solExp+'(';
            }

            else
            {
                solExp=solExp+c;
            }
        }

        return solExp;
    }
}
    
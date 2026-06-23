
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

public class Expression_Evaluation 
{
    public static void main(String[] args) 
    {
        String expr="(1+((3*(2^1))/3))";

        System.out.println("The original expression is : "+expr);

         //hamesha exp pre processed honi chahiya is coding k lehaz sa agar infix to pre or post fix ma convert
        //karna ho (means exp ma brackets waghera lagi ho )

        System.out.println("The post Evaluation of the expression is : "+postEva(inToPost(expr)));


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

   
    public static double postEva(String exp)
    {
        Stack<Double> st=new Stack<Double>();
        for(int i=0;i<exp.length();i++)
        {
            char c=exp.charAt(i);

            if(Character.isDigit(c))
            {
                st.push(Double.parseDouble(c+""));
            }
            else
            {
                double op2=st.pop();
                double op1=st.pop();

                st.push(cal(op1,c,op2));
            }
        }
        return st.pop();
    }

    public static double cal(double op1,char c,double op2)
    {
        switch(c)
        {
            case '+':
               return op1+op2;
            case '-':
                return op1-op2;
            case '*':
                return op1*op2;
            case '/':
                return op1/op2;
            case '%':
                return op1%op2;
            case '^':
               return Math.pow(op1,op2);
            default :
                return 0;
        }
    }
}
    
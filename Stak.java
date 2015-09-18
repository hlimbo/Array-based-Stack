package stak;

import java.util.EmptyStackException;

public class Stak{    
    
    private int p;
    private int top;
    private int[] arr;
    
    public final int MAX = 10;
    
    public Stak()
    {
        top = -1;
        p = top;
        arr = new int[MAX];
    }
    
    public Stak(int cap)
    {
        top = -1;
        p = top;
        arr = new int[cap];
    }
    
    void Push(int i)
    {
        try
        { 
            p++;
            top = p;
            arr[p] = i;
            System.out.println("Push Value is: " + arr[p]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stack is full");
            p--;
            
        }
    }
    
    int Pop()
    {
       if(this.isEmpty())
       {
           System.out.println("The Stack is empty.");
           throw new EmptyStackException();
       }
       else
       {
            p--;
            System.out.println("Pop Value is: " + arr[p+1]);
            top = p;
            return arr[p+1];
        }
    }
    int Peek()
    {      
        if(this.isEmpty())
            throw new EmptyStackException();
        else
        {
            System.out.println("Peek Value is: " + arr[top]);
            return arr[top];
        }
    }
    //returns current number of ints in stack
    int Size()
    {
        return top;
    }
   
    int getIndex()
    {
        return p;
    }
    
    //returns a value in the array.
    int getValue(int index)
    {
        return arr[index];
    }
    
    boolean isEmpty()
    {
       if(top == -1)
           return true;
       
        return false;
    }
    
 
}

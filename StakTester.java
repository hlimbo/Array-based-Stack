package stak;

/**
 *
 * @author Harvey
 */
public class StakTester {
    
    public static void main(String[] args)
    {
        Stak s1 = new Stak();
        
        for(int i = 0; i < 10;i++)
            s1.Push(5);
        
        s1.Push(3);
        System.out.println(s1.Pop());
        s1.Push(4);
          

            
        
    }
}

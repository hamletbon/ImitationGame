
/**
 * Write a description of class LoopFun here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoopFun
{

    public LoopFun()
    {
        // initialise instance variables
    }


    public void countDown(int n)
    {
        int counter = n;
        while (counter >= 0)
        {
            System.out.println(counter);
        }
    }
    
    public String countDownBy3(int n)
    {

        int lastNum = n - 3;
        String outputStr = "";
        for (int counter = n; counter >= lastNum; counter--)
        {
            outputStr = outputStr + counter +", ";
        }
        return outputStr;
    }
    
    public void printTree(int n)
    {
        int counter = 1;
        while (n > 0)
        {            
            for (int i = 0; i < 2*counter-1; i++)
            {
                System.out.print("*");
            }
            n--;
            counter++; 
            System.out.println();
        }
    }
}











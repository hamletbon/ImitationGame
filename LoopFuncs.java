
/**
 * Write a description of class LoopFuncs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoopFuncs
{
    
    public LoopFuncs()
    {
    }
    
    public void countWhileLoop(int startNum, int endNum)
    {
        int counter = startNum; //initialization 
        while (counter < endNum) //condition
        {
            System.out.println(counter); 
            counter++; //change
        }
    }
    
    public void countForLoop(int startNum, int endNum)
    {
        for (int counter = startNum; counter<endNum+1; counter++) //(//initialization;condition; change(s)
        {
            System.out.println(counter);
        }
    }
    
    public void printOddsWhileLoop(int startNum, int endNum)
    {
        if (startNum <= endNum)
        {
            int counter = startNum;
            while (counter < endNum)
            {
                if (counter%2 == 1)
                {
                    System.out.println(counter);
                    counter+=2;
                }else{
                    counter++;
                }
            }            
        }
    }
    
    public void printOddsForLoop(int startNum, int endNum)
    {
        /*
        if (startNum%2 == 0){ //check if the startNum is an even num
            startNum ++; //add one so it is an odd number
        }
        if (endNum%2 == 0){ //check if the endNum is an even num
            endNum --; //minus one so it is an odd number
        }  
        */
        for (int counter = startNum; counter <= endNum; counter++)
        {
            if (counter % 2 == 1)
            {
                System.out.println(counter);
            }
        }
    }
    
    public void printEvensWhileLoop(int startNum, int endNum)
    {
        if (startNum <= endNum)
        {
            int counter = startNum;
            while (counter < endNum)
            {
                if (counter%2 == 0)
                {
                    System.out.println(counter);
                    counter+=2;
                }else{
                    counter++;
                }
            }            
        }
    }
    
    public void printEvensForLoop(int startNum, int endNum)
    {
        for (int counter = startNum; counter <= endNum; counter++)
        {
            if (counter % 2 == 0)
            {
                System.out.println(counter);
            }
        }
    }
    
    public int factorial(int muffin)
    {
        //n! = 1*2*3...*n
        int product = 1;
        for (int counter = 1; counter <= muffin; counter++)
        {
            product *=counter;
        }
        return product;
    }
    
    boolean isPrime(int num)
    {
        int counter = 2;
        while (counter < num)
        {
            if (num % counter == 0)
            {
                return false;
            }
            
        }
        return true;
    }
    
    public void printPrimes(int startNum, int endNum)
    {
        int counter = startNum; //initialization 
        while (counter < endNum) //condition
        {
            if (isPrime(counter)){
                System.out.println(counter); 
            }
            counter++; //change
        }
    }    
}











/**
 * Write a description of class ConditionalTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ConditionalTest
{
   public static void main()
   {
       int a = 10;
       int sausage = 20;
       int egg = 120;
       int muffin =200;
       
       int money = 420;
       
       if (money >= muffin)
       {
           money -= muffin;
       }
       if (money >= egg){
           money -= egg;
        }
       System.out.println(money);
    }
}

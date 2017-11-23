
/**
 * Write a description of class NameCounter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NameCounter
{
    //field(s)
    private String name="";
    
    //constructor
    public NameCounter(String aName)
    {
        name = aName;
    }
    
    public int getNameLength()
    {
       return name.length(); 
    }
    
    public void spellOutTheName()
    {
        for (int i = 0; i<name.length(); i++)
        {
            System.out.println(name.charAt(i));
        }
    }
    
    public void spellOutTheNameReverse()
    {
        int counter = name.length() - 1;
        while(counter >= 0)
        {
            System.out.println(name.charAt(counter));
            counter--;
        }
    }
}












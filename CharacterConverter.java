
/**
 * Write a description of class CharacterConverter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CharacterConverter
{
    private String eggMuffin = "";
    public CharacterConverter(String sausage)
    {
        this.eggMuffin = sausage;
    }
    
    private int getLength()
    {
        //get the length of the eggMuffin
        return eggMuffin.length();
    }
    
    public char returnACharacter(int whichChar)
    {
        if ((whichChar >= 0 )&&(whichChar < eggMuffin.length())
            return eggMuffin.charAt(whichChar);
        else
            return ' ';
    }
    
    public int returnASCIIcode (char aChar)
    {
        return (int)aChar;
    }
    
    public void printCharsAsNum()
    {
        //"Mehek" ->82 101 104 101 107
        int x = getLength();
        int counter = 0;
        while (counter < x)
        {
            System.out.println( returnASCIIcode(returnACharacter(counter)));
            counter++;
        }
        
    }
}






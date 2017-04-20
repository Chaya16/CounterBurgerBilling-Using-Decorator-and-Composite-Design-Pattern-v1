import java.lang.String.*;

/**
 * Write a description of class Burger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Burger extends BurgerDecorator
{
    // instance variables - replace the example below with your own
    private String meatType = "";
    private String qty = "";
    private String bunOrBowl = "";
        
    /**
     * Constructor for objects of class Burger
     */
    public Burger(String meatType, String qty, String bunOrBowl)
    {
        // initialise instance variables
        this.meatType = meatType;
        this.qty = qty;
        this.bunOrBowl = bunOrBowl;
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double calculatePrice()
    {
        // put your code here
        double price = 0;
        
        if( qty.equals("1/3lb.") )
            price = price + 9.50;
        else if ( qty.equals("2/3lb.") )
            price = price + 11.50;
        else if ( qty.equals("1lb.") )
            price = price + 15.50;
        
        if ( bunOrBowl.equals("In A Bowl") )
            price = price + 1;
            
        return price;
    }
    
    public void printDescription()
    {
        System.out.println( this.meatType + " + " + this.qty + " + " + this.bunOrBowl );
    }
}


/**
 * Write a description of class Cheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cheese extends BurgerDecorator
{
    // instance variables - replace the example below with your own
    private String[] cheese = new String[11];
    private double price = 0;
    BurgerDecorator bd;

    /**
     * Constructor for objects of class Cheese
     */
    public Cheese(BurgerDecorator bd, String[] cheese)
    {
        // initialise instance variables
        this.bd = bd;
        this.cheese = cheese;
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
        int  i = 0;
        int len = cheese.length;
        //System.out.println("Cheese length" + l);
        if(len > 1)
            price = bd.calculatePrice() + ( (len-1) * 1 );
        else
            price = bd.calculatePrice();
            
        return price;
    }
    
    public void printDescription()
    {
        String description = "";
        int i = 0;
        int l = cheese.length;
        bd.printDescription();
        while (i < l)
        {
            if(i == 0)
                description = description + cheese[i];
            else
                description = description + " + " + cheese[i];
            i++;
        }
        System.out.println(description);
    }
}

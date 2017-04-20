
/**
 * Write a description of class Toppings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Toppings extends BurgerDecorator
{
    // instance variables - replace the example below with your own
    private String[] toppings = new String[20];
    private double price = 0;
    BurgerDecorator bd;
    /**
     * Constructor for objects of class Toppings
     */
    public Toppings(BurgerDecorator bd, String[] toppings)
    {
        // initialise instance variables
        this.bd = bd;
        this.toppings = toppings;
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
        int len = toppings.length;
        //System.out.println("Toppings length" + l);
        if(len > 4)
            price = bd.calculatePrice() + ( (len-4) * 0.75 );
        else
            price = bd.calculatePrice();
            
        return price;
    }
    
    public void printDescription()
    {
        String description = "";
        int i = 0;
        int len = toppings.length;
        bd.printDescription();
        while (i < len)
        {
            if(i == 0)
                description = description + toppings[i];
            else
                description = description + " + " + toppings[i];
            i++;
        }
        System.out.println(description);
        
    }
}

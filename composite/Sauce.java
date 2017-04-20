
/**
 * Write a description of class Sauce here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sauce extends BurgerDecorator
{
    // instance variables - replace the example below with your own
    private String[] sauces = new String[20];
    private double price = 0;
    BurgerDecorator bd;

    /**
     * Constructor for objects of class Sauce
     */
    public Sauce(BurgerDecorator bd, String[] sauces)
    {
        // initialise instance variables
        this.bd = bd;
        this.sauces = sauces;
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
        int l = sauces.length;
        //System.out.println("Sauce length" + l);
        if(l > 1)
            price = bd.calculatePrice() + ( (l-1) * 0.75 );
        else
            price = bd.calculatePrice();
            
        return price;
    }
    
    public void printDescription()
    {
        String description = "";
        int i = 0;
        int l = sauces.length;
        bd.printDescription();
        while (i < l)
        {
            if(i == 0)
                description = description + sauces[i];
            else
                description = description + " + " + sauces[i];
            i++;
        }
        System.out.println(description);
        
    }
}

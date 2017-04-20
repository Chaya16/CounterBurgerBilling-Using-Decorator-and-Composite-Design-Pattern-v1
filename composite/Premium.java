
/**
 * Write a description of class Premium here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Premium extends BurgerDecorator
{
    // instance variables - replace the example below with your own
    private String[] premium = new String[20];
    private double price = 0;   
    BurgerDecorator bd;

    /**
     * Constructor for objects of class Premium
     */
    public Premium(BurgerDecorator bd, String[] premium)
    {
        // initialise instance variables
        this.bd = bd;
        this.premium = premium;
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
        int l = premium.length;
        //System.out.println("Premium length" + l);
        if(l > 0)
            price = bd.calculatePrice() + ( l * 1.50 );
        else
            price = bd.calculatePrice();
            
        return price;
    }
    
    public void printDescription()
    {
        String description = "";
        int i = 0;
        int l = premium.length;
        bd.printDescription();
        while (i < l)
        {
            if(i == 0)
                description = description + premium[i];
            else
                description = description + " + " + premium[i];
            i++;
        }
        System.out.println(description);
        
    }
}

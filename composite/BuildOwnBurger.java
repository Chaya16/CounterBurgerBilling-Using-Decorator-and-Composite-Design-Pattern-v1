import java.text.DecimalFormat;
/**
 * Write a description of class BuildOwnBurger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BuildOwnBurger extends Composite implements BurgerPriceInterface
{
    // instance variables - replace the example below with your own
    private String description;
    BurgerDecorator bd;
    
    /**
     * Constructor for objects of class BuildOwnBurger
     */
    public BuildOwnBurger(BurgerDecorator bd)
    {
        // initialise instance variables 
        //super("Build your own burger");
        
        
        this.bd = bd;
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double calculatePrice()
    {
       return bd.calculatePrice(); 
    }
    
    public void printDescription()
    {
        // put your code here
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println("Build your own burger " + fmt.format(calculatePrice()));

        bd.printDescription();
    }
}

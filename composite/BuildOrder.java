 

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
        order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        order.addChild(new Leaf("The Purist", 8.00 ));
       
        BurgerDecorator bd = new Burger ("Beef", "1/3lb.", "On a Bun");
        
        bd = new Cheese (bd, new String[]{"Danish Blue Cheese", "Horseradish Cheddar"});
        
        bd = new Toppings (bd, new String[]{"Bermuda Red Onion", "Black Olives", "Carrot Strings", "Coleslaw"});
        bd = new Premium (bd, new String[]{"Applewood Smoked Bacon"});
        bd = new Sauce (bd, new String[]{"Apricot Sauce"}); 
        
        BuildOwnBurger bob = new BuildOwnBurger(bd);
        order.addChild(bob);
        
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/
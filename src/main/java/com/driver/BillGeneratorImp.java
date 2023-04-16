package com.driver;

public class BillGeneratorImp implements BillGenerator {
    @Override
    public String getBill(Pizza pizza) {
        String var = "" ;
        var += "Base Price Of The Pizza: "+pizza.getPrice()+"\n";
        if(pizza.isCheeseAdded){
            var += "Extra Cheese Added: "+pizza.cheesePrice+"\n";
        }
        if(pizza.isToppingAdded){
            var += "Extra Toppings Added: "+pizza.getToppingPrice()+"\n";
        }
        if(pizza.isTakeAway){
            var += "Paperbag Added: "+pizza.bagPrice+"\n";
        }
        var += "Total Price: "+pizza.getTotalPrice()+"\n";

        return var;
    }
    
}

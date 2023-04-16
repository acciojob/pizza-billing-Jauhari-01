package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isCheeseAdded = false;
    private int cheesePrice = 80;
    private boolean isToppingAdded = false;
    private int vegToppingPrice = 70;
    private int nonVegToppingPrice = 120;
    private int vegBasePrice = 300;
    private int nonVegBasePrice = 400;
    private boolean isTakeAway = false;
    private int bagPrice = 20;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.price = getBasePrice() ;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded){
            isCheeseAdded = true;
            this.price += cheesePrice;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingAdded){
            isToppingAdded = true;
            this.price += this.isVeg ? vegToppingPrice : nonVegToppingPrice;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            isTakeAway = true;
            this.price += bagPrice;
        }
    }

    public String getBill(){
        // your code goes here
        /*
         * Base Price Of The Pizza: 300\
            Extra Cheese Added: 80\
            Extra Toppings Added: 70\
            Paperbag Added: 20\
            Total Price: 470
        */
        String var = "" ;
        var += "Base Price of The Pizza: "+getBasePrice()+"\n";
        if(isCheeseAdded){
            var += "Extra Cheese Added: "+cheesePrice+"\n";
        }
        if(isToppingAdded){
            var += "Extra Toppings Added: "+(isVeg?vegToppingPrice:nonVegToppingPrice)+"\n";
        }
        if(isTakeAway){
            var += "Paperbag Added: "+bagPrice+"\n";
        }
        var += "Total Price: "+price+"\n";

        this.bill = var;
        return this.bill;
    }

    private int getBasePrice(){
        return  this.isVeg ? vegBasePrice : nonVegBasePrice;
    }
}

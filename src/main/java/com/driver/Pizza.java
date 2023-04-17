package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int vegBasePrice = 300, nonvageBasePrice = 400;
    private int extraCheesePrice = 80;
    private int toppingVegPizza = 70, toppingNonVegPizza = 120;
    private int paperBag = 20;

    private int basePrice;
    private int toppingPrice;

    private boolean isCheeseAdded;
    private boolean isExtraTopping;
    private boolean isTakeAway;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        basePrice = getBasePrice();
        price = basePrice;
    }

    public int getBasePrice(){
        return isVeg ? vegBasePrice : nonvageBasePrice;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (isCheeseAdded == false) {
            isCheeseAdded = true;
            price += extraCheesePrice;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (isExtraTopping == false) {
            isExtraTopping = true;
            if (isVeg) {
                toppingPrice = toppingVegPizza;
                price += toppingPrice;
            } else {
                toppingPrice = toppingNonVegPizza;
                price += toppingPrice;
            }
        }

    }

    public void addTakeaway(){
        // your code goes here
        if (isTakeAway == false) {
            isTakeAway = true;
            price += paperBag;
        }
    }

    public String getBill(){
        // your code goes here
        String str = "";
        str += "Base Price Of The Pizza: " + basePrice + "\n";
        if (isCheeseAdded) {
            str += "Extra Cheese Added: " + extraCheesePrice + "\n";
        }
        if (isExtraTopping) {
            str += "Extra Toppings Added: " + toppingPrice + "\n";
        }
        if (isTakeAway) {
            str += "Paperbag Added: " + paperBag + "\n";
        }
        str += "Total Price: " + price + "\n";
        this.bill = str;
        
        return this.bill;
    }
}
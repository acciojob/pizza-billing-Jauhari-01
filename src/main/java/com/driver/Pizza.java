package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    boolean isCheeseAdded = false;
    int cheesePrice = 80;
    boolean isToppingAdded = false;
    private int vegToppingPrice = 70;
    private int nonVegToppingPrice = 120;
    private int vegBasePrice = 300;
    private int nonVegBasePrice = 400;
    boolean isTakeAway = false;
    int bagPrice = 20;
    private BillGeneratorImp billGenerator;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.price = getPrice() ;
        this.billGenerator = new BillGeneratorImp();
    }

    public int getPrice(){
        return this.isVeg ? vegBasePrice : nonVegBasePrice;
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
        this.bill = billGenerator.getBill(this);
        return this.bill;
    }

    public int getTotalPrice(){
        return  this.price;
    }

    public int getToppingPrice(){
        return isVeg?vegToppingPrice:nonVegToppingPrice;
    }
}

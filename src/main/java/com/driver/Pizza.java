package com.driver;

public class Pizza {

    private int price;
    Boolean isVeg;
    private String bill;
    private int toppingsPrice;
    private int cheesePrice;
    private int takeawayPrice;

    boolean ischeeseAdded;
    boolean istoppingsAdded;
    boolean istakeawayAdded;
    boolean isbillgenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
       this.cheesePrice = 80;
       this.takeawayPrice = 20;

       if(isVeg) {
           this.price = 300;
           this.toppingsPrice = 70;
       }
       else {
           this.price = 400;
           this.toppingsPrice = 120;
       }
       this.ischeeseAdded=false;
       this.istoppingsAdded=false;
       this.istakeawayAdded=false;

       this.bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(ischeeseAdded==false){
            this.price+=cheesePrice;
            ischeeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(istoppingsAdded==false){
            this.price+=toppingsPrice;
            istoppingsAdded=true;
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(istakeawayAdded==false){
            this.price+=takeawayPrice;
            istakeawayAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isbillgenerated == false){
            if(ischeeseAdded==true)
                this.bill += "Extra Cheese Added: "+this.cheesePrice+"\n";

            if(istoppingsAdded==false)
                this.bill+= "Extra Toppings  Added: "+this.toppingsPrice+"\n";

            if(istakeawayAdded==false)
                this.bill+= "Paperbag Added: "+this.takeawayPrice+"\n";

            this.bill+= "Total Price: "+this.price+"\n";

            isbillgenerated = true;
        }

        return this.bill;
    }
}

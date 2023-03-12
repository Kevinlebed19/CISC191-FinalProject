package edu.sdccd.cisc191.template;
// Receives Method of Menu and implements the method of Receipt
public class Pizza extends Menu implements Receipt {
    // Method simply displays that you purchased this item
    @Override
    public boolean purchaseItem() {
        price = 7.99;
        calories = 500;
        System.out.println("Thank you for purchasing our Pizza!");
       return true;
    }

    // Method simply displays a receipt that includes the price and calories
    @Override
    public boolean receipt() {
        purchaseItem();
        System.out.println(" The total is "+ "$" + price + " and includes " + calories +" calories");
        return true;
    }
}

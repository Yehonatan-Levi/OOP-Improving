package shop;

import discount.DiscountHandler;
import interfaces.ICustomer;
import interfaces.IMenuItem;

import java.util.ArrayList;

public class Order {

    private final ICustomer customer;
    private final ArrayList<IMenuItem> orderedItems;
    private final DiscountHandler discountHandler;

    public Order(ICustomer customer){
        this.customer = customer;
        this.orderedItems = new ArrayList<>();
        this.discountHandler = new DiscountHandler(customer.getDiscounts(), ShopConstants.ACTIVE_STORE_DISCOUNTS);
    }

    public void addDrink(IMenuItem menuItem){
        this.orderedItems.add(menuItem);
    }

    private double getSubtotal(){
        double subtotal = 0;
        for (IMenuItem menuItem : this.orderedItems){
            subtotal += menuItem.getPrice();
        }
        return subtotal;
    }

    private double getDiscount(){
        return discountHandler.getDiscount(this.orderedItems);
    }

    public double getTotal(){
        return getSubtotal() - getDiscount();
    }

    public void pay(double amount){
        System.out.println("Paid " + amount + " " + this.customer.getPaymentMethod().getUsage_message());
    }

    public String summary(){
        StringBuilder summary = new StringBuilder("Customer: " + this.customer.getName() + "\n");
        for (IMenuItem menuItem : orderedItems){
            summary.append(menuItem.toString()).append("\n");
        }
        summary.append("---------------\n");
        summary.append("Subtotal: " + getSubtotal() + "\n");
        summary.append("Discount: " + getDiscount() + "\n");
        summary.append("Total: " + getTotal());
        return summary.toString();
    }

    public String toString(){
        return customer + "\n" +
                "Ordered: " + orderedItems;
    }

}

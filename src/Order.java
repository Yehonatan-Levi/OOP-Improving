import interfaces.ICustomer;
import interfaces.IMenuItem;

import java.util.ArrayList;

public class Order {

    private final ICustomer customer;
    private final ArrayList<IMenuItem> menuItems;

    public Order(ICustomer customer){
        this.customer = customer;
        this.menuItems = new ArrayList<>();
    }

    public void addDrink(IMenuItem menuItem){
        this.menuItems.add(menuItem);
    }

    private double getSubtotal(){
        double subtotal = 0;
        for (IMenuItem menuItem : this.menuItems){
            subtotal += menuItem.getPrice();
        }
        return subtotal;
    }

    private double getDiscount(){
        return customer.getDiscount(menuItems);
    }

    public double getTotal(){
        return getSubtotal() - getDiscount();
    }

    public void pay(double amount){
        System.out.println("Paid " + amount + " " + this.customer.getPaymentMethod().getUsage_message());
    }

    public String summary(){
        StringBuilder summary = new StringBuilder("Customer: " + this.customer.getName() + "\n");
        for (IMenuItem menuItem : menuItems){
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
                "Ordered: " + menuItems;
    }

}

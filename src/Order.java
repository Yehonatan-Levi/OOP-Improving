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
        System.out.println("Paid " + amount + this.customer.getPaymentMethod().getUsage_message());
    }

    public String summary(){
        String summary = "Customer: " + this.customer.getName() + "\n";

    }

    public String toString(){
        return customer + "\n" +
                "Ordered: " + menuItems;
    }

}

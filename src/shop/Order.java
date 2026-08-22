package shop;

import discount.Discount;
import discount.DiscountConstants;
import discount.DiscountHandler;
import interfaces.ICustomer;
import interfaces.IMenuItem;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Order {

    private final double MIN_ORDER_TOTAL = 0;
    private final Discount[] ACTIVE_SHOP_DISCOUNTS = {DiscountConstants.BUY_TWO_GET_ONE_FREE_COFFEE, DiscountConstants.WEEKEND_TEA_DISCOUNT};

    private final ICustomer customer;
    private final ArrayList<IMenuItem> orderedItems;
    private final DiscountHandler discountHandler;

    public Order(ICustomer customer){
        this.customer = customer;
        this.orderedItems = new ArrayList<>();
        this.discountHandler = new DiscountHandler(customer.getDiscounts(), new ArrayList<>(Arrays.asList(ACTIVE_SHOP_DISCOUNTS)));
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
        return Math.max(getSubtotal() - getDiscount(), MIN_ORDER_TOTAL);
    }

    public void pay(){
        System.out.println("Paid " + this.getTotal() + " " + this.customer.getPaymentMethod().getUsage_message());
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

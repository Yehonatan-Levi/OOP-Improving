import interfaces.ICustomer;

import java.util.ArrayList;

public class Order {

    private final ICustomer customer;
    private final ArrayList<Drinks> drinks;

    public Order(ICustomer customer){
        this.customer = customer;
        this.drinks = new ArrayList<>();
    }

    public void addDrink(Drinks drink){
        drinks.add(drink);
    }

    public double getTotal(){
        double total = 0;
        for (Drinks drink : drinks){
            total += drink.getPrice();
        }
        return total;
    }

    public String toString(){
        return customer + "\n" +
                "Ordered: " + drinks;
    }

}

package client;

import discount.Discounts;

import java.util.ArrayList;

public class Client implements IClient{

    private final ArrayList<Discounts> discounts;

    public Client(){
        discounts = new ArrayList<>();
    }

    public void addDiscount(Discounts discount){
        discounts.add(discount);
    }


    @Override
    public ArrayList<Discounts> getDiscounts() {
        return discounts;
    }
}

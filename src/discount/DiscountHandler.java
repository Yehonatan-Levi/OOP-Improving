package discount;

import ride.Ride;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class DiscountHandler {
    public static double calculateDiscount(Ride ride, ArrayList<Discounts> discounts, ArrayList<Discounts> discountPolicy){
        double discountsSum = 0;
        ArrayList<Discounts> viableDiscounts = discounts.stream().filter(discountPolicy::contains).collect(Collectors.toCollection(ArrayList::new));
        for (Discounts discount : viableDiscounts){
            discountsSum += discount.apply(ride);
        }
        return discountsSum;
    }
}

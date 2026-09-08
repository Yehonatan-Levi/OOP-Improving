package discount;

import ride.Ride;

import java.util.function.Function;

public enum Discounts {

    MEMBER_DISCOUNT((ride) -> {
        double MEMBER_DISCOUNT_PERCENTAGE = 10;
        return ride.getPrice() / MEMBER_DISCOUNT_PERCENTAGE;
    });

    private final Function<Ride, Double> discount;

    Discounts(Function<Ride, Double> discount) {
        this.discount = discount;
    }

    public double apply(Ride ride){
        return this.discount.apply(ride);
    }
}

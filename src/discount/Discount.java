package discount;

import interfaces.IMenuItem;

import java.util.ArrayList;
import java.util.function.Function;

public class Discount {

    private DiscountTypes discountType;
    private Function<ArrayList<IMenuItem>, Double> discountFunction;

    public Discount(DiscountTypes discountType, Function<ArrayList<IMenuItem>, Double> discountFunction){
        this.discountType = discountType;
        this.discountFunction = discountFunction;
    }

    public DiscountTypes getDiscountType() {
        return discountType;
    }

    public void setDiscountFunction(Function<ArrayList<IMenuItem>, Double> discountFunction) {
        this.discountFunction = discountFunction;
    }

    public Function<ArrayList<IMenuItem>, Double> getDiscountFunction() {
        return discountFunction;
    }

    public void setDiscountType(DiscountTypes discountType) {
        this.discountType = discountType;
    }
}

package interfaces;

import java.util.function.Function;

public interface ICustomer {

    public String getName();

    public Function<IMenuItem, Double> getDiscount();

}

package customers;

import interfaces.IMenuItem;

public class RegularCustomer extends GenericCustomer{
    public RegularCustomer(String name) {
        super(name);
        setDiscount(menuItem ->
                menuItem.getPrice() * CustomersConstants.REGULAR_DISCOUNT_PERCENTAGE);
    }
}

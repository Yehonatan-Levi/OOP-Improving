package customers;

import interfaces.IMenuItem;

public class VipCustomer extends GenericCustomer{
    public VipCustomer (String name, PaymentMethod paymentMethod){
        super(name, paymentMethod);
        setDiscount(menuItems ->{
        double discount = 0;
        for (IMenuItem menuItem : menuItems){
            discount += menuItem.getPrice() * CustomersConstants.VIP_DISCOUNT_PERCENTAGE;
        }
        return discount;
        });
    }
}

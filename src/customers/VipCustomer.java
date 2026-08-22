package customers;

public class VipCustomer extends GenericCustomer{
    public VipCustomer (String name){
        super(name);
        setDiscount(menuItem ->
                menuItem.getPrice() * CustomersConstants.VIP_DISCOUNT_PERCENTAGE);
    }
}

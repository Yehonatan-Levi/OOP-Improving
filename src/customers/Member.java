package customers;

public class Member extends GenericCustomer{
    public Member(String name){
        super(name);
        setDiscount(menuItem ->
                menuItem.getPrice() * CustomersConstants.MEMBER_DISCOUNT_PERCENTAGE);
    }
}

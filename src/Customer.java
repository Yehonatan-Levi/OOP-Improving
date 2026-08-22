import interfaces.ICustomer;

public class Customer implements ICustomer {

    private String name;

    public Customer(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

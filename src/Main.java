//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import customers.GenericCustomer;
import customers.RegularCustomer;

void main() {
    GenericCustomer customer = new RegularCustomer("Jonathan");
    Order order = new Order(customer);

    order.addDrink(Drinks.COFFEE);
    order.addDrink(Drinks.TEA);
    order.addDrink(Drinks.TEA);

    System.out.println(order.getTotal());
    System.out.println(order);

}

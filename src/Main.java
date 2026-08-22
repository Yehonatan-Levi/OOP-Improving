//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import customers.*;
import shop.Drinks;
import shop.Order;

void main() {
    GenericCustomer customer = new RegularCustomer("Jonathan", PaymentMethod.GIFT_CARD);
    Order order = new Order(customer);

    order.addDrink(Drinks.COFFEE);
    order.addDrink(Drinks.TEA);
    order.addDrink(Drinks.TEA);

    System.out.println(order.summary());
    order.pay(order.getTotal());

}

import interfaces.IMenuItem;

public enum Drinks implements IMenuItem {
    TEA("Tea", 3),
    COFFEE("Coffee", 8),
    HOT_CHOCOLATE("Hot Chocolate", 10);

    private final String name;
    private final double price;

    Drinks(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    @Override
    public String toString() {
        return this.name + ", price: " + this.price;
    }
}

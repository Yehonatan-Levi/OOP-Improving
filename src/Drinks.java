public enum Drinks {
    TEA("Tea", 5),
    COFFEE("Coffee", 5),
    HOT_CHOCOLATE("Hot Chocolate", 5);

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
}

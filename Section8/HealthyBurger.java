package Section8;
public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String addon, double price) {
        this.healthyExtra1Name = addon;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String addon, double price) {
        this.healthyExtra2Name = addon;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger();
        if (this.healthyExtra1Name != null) {
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
            totalPrice += healthyExtra1Price;
        }
        if (this.healthyExtra2Name != null) {
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
            totalPrice += healthyExtra2Price;
        }
        return totalPrice;
    }
}

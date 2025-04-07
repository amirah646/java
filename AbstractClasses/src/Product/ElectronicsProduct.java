package Product;

public class ElectronicsProduct extends Product{
	private String brand;
    private int warrantyInMonths;

    public ElectronicsProduct(String name, double price, String brand, int warrantyInMonths) {
        super(name, price);
        this.brand = brand;
        this.warrantyInMonths = warrantyInMonths;
    }

    @Override
    public String getDescription() {
        return name + " (Electronics) - Brand: " + brand + ", Warranty: " + warrantyInMonths + " months";
    }
}


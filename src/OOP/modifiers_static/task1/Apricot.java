package OOP.modifiers_static.task1;

public class Apricot extends Fruit {
    private static float priceAllApricot;
    private float priceFruit;
    public Apricot(float weight, String manufacturerСountry, float pricePerKilo) {
        super(weight, manufacturerСountry, pricePerKilo);
        priceFruit = getWeight() * getPricePerKilo();
        priceAllApricot +=priceFruit;
    }


    @Override
    public void printManufacturerInfo() {
        System.out.printf("Made in %s\n", getManufacturerСountry());
    }

    @Override
    public float priceFruit() {
        return priceFruit;

    }
    public static float getPriceAllApricot() {
        return priceAllApricot;
    }
}

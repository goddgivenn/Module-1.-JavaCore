package OOP.modifiers_static.task1;

public class Pear extends Fruit {
    private static float priceAllPear;
    private float priceFruit;
    public Pear(float weight, String manufacturerСountry, float pricePerKilo) {
        super(weight, manufacturerСountry, pricePerKilo);
        priceFruit = getWeight() * getPricePerKilo();
        priceAllPear +=priceFruit;
    }


    @Override
    public void printManufacturerInfo() {
        System.out.printf("Made in %s\n", getManufacturerСountry());
    }

    @Override
    public float priceFruit() {
        return priceFruit;
    }
    public static float getPriceAllPear() {
        return priceAllPear;
    }
}

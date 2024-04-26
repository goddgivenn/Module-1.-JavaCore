package OOP.modifiers_static.task1;

public class Apple extends Fruit {
    private static float priceAllApple;
    private float priceFruit;
    public Apple(float weight, String manufacturerСountry, float pricePerKilo) {
        super(weight, manufacturerСountry, pricePerKilo);
        priceFruit = getWeight() * getPricePerKilo();
        priceAllApple+=priceFruit;
    }


    @Override
    public void printManufacturerInfo() {
        System.out.printf("Made in %s\n", getManufacturerСountry());
    }

    @Override
    public float priceFruit() {
        return priceFruit;

    }
    public static float getPriceAllApple() {
        return priceAllApple;
    }
}

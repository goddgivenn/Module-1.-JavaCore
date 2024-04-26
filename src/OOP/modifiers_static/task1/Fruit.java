package OOP.modifiers_static.task1;

/*
    Создать абстрактный класс Фрукт и классы Яблоко, Груша, Абрикос расширяющие его.
    Класс Фрукт содержит:
    а) переменную вес,
    б) завершенный метод printManufacturerInfo(){System.out.print("Made in Russian");}
    в) абстрактный метод, возвращающий стоимость фрукта, который должен быть переопределен в каждом классе наследнике. Метод должен учитывать вес фрукта.
    Создать несколько объектов разных классов.
    Подсчитать общую стоимость проданных фруктов.
    А также общую стоимость отдельно проданных яблок, груш и абрикос.
*/
public abstract class Fruit {
    private float weight, pricePerKilo;
    private String manufacturerСountry;

    public Fruit(float weight, String manufacturerСountry, float pricePerKilo) {
        this.weight = weight;
        this.manufacturerСountry = manufacturerСountry;
        this.pricePerKilo = pricePerKilo;
    }

    public abstract void printManufacturerInfo();
    public abstract float priceFruit();

    public float getWeight() {
        return weight;
    }

    public String getManufacturerСountry() {
        return manufacturerСountry;
    }

    public float getPricePerKilo() {
        return pricePerKilo;
    }

    public void getPriceAllFruits(){
        float priceAllFruits = Apple.getPriceAllApple() + Pear.getPriceAllPear() + Apricot.getPriceAllApricot();
        System.out.println(priceAllFruits);
    }

}


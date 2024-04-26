package OOP.modifiers_static.task1;

public class Runner {
    public static void main(String[] args) {
        Fruit apples2023 = new Apple(956, "Russia", 100);
        Fruit apples2024 = new Apple(1245, "Russia", 102);
        Fruit pears2023 = new Pear(4851, "Georgia", 150);
        Fruit pears2024 = new Pear(3642, "Georgia", 160);
        Fruit apricots2023 = new Apricot(2476, "Belarus", 245);
        Fruit apricots2024 = new Apricot(2548, "Belarus", 230);

        apples2024.printManufacturerInfo();
        pears2024.printManufacturerInfo();
        apricots2024.printManufacturerInfo();
        System.out.println();

        System.out.println(apples2023.priceFruit());
        System.out.println(apples2024.priceFruit());
        System.out.println(pears2023.priceFruit());
        System.out.println(pears2024.priceFruit());
        System.out.println(apricots2023.priceFruit());
        System.out.println(apricots2024.priceFruit());

        System.out.println("-----");

        System.out.println("Сумма продажи всех яблок: " + Apple.getPriceAllApple());
        System.out.println("Сумма продажи всех груш: " + Pear.getPriceAllPear());
        System.out.println("Сумма продажи всех абрикос: " + Apricot.getPriceAllApricot() + "\n");

        getPriceAllFruits();
    }

    public static void getPriceAllFruits(){
        float priceAllFruits = Apple.getPriceAllApple() + Pear.getPriceAllPear() + Apricot.getPriceAllApricot();
        System.out.println("Сумма продажи всех фруктов: " + priceAllFruits);
    }
}

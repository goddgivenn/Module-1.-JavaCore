package OOP.modifiers_static;

public class Runner {
    public static void main(String[] args) {
        Person person1 = new Person("Bogdan", 21,180,63); //у всех объектов своя ссылка
        Person person2 = new Person("Denis", 13,155,35);
        Person person3 = new Person("Roma", 3,100,20);

//        System.out.println(person1.name); //private
        System.out.println(person1.age);    //по умолчанию
        System.out.println(person1.height); //public
        System.out.println(person1.weight); //protected

        System.out.println("\nCount:");
        person1.countMethod();
        person2.countMethod();
        person3.countMethod();

        changeHeight(person1, 179);
        System.out.println("Новый рост: " + person1.height);
    }

    public static void changeHeight(Person p, int newHeight){ //в параметр можно передавать объекты
        p.height = newHeight;
    }

}

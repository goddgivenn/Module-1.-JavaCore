package OOP.modifiers_static;
/*
static - обозначает, что переменная, метод и тд относится к классу, а не к экз-ру класса (общие для всех - и классов, и объектов)

Пример static:
Если надо подчитывать кол-во людей, то static
Если кол-во зубов у конкретного человека (экз-ра класса), то без static
*/
public class Person {
    private String name;
    int age;
    public int height;
    protected int weight;
    private int id1;
    private int id2;
    public static int count1 = 1; //static - поле относится к классу (переменная общая для всех экз-ров класса)
    public int count2 = 1;        //без static - поле относится к объекту класса

    {
        System.out.println("Initializer");          //обычный инициализатор вызывается каждый раз (в первую очередь) при создании нового экз-ра класса
    }
    static {
        System.out.println("Static initializer");   //статический инициализатор вызывается при первом обращении к классу
    }
    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        id1 = count1++;         //при каждом новом обращении к КЛАССУ, count1 будет увеличиваться
        id2 = count2++;         //у каждого экз-ра класса свой count2
    }

    void countMethod(){
        System.out.println("Static: " + id1 + "; Not static: " + id2);
    }

}

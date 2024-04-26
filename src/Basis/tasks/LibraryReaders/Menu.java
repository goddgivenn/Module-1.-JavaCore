package Basis.tasks.LibraryReaders;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<String> listOfItems= new ArrayList<>();    //массив, который хранит все пункты

    public Menu(String ...items) {  //пункты добавляются при создании объекта класса
        for(String item : items){
            listOfItems.add(item);
        }
    }
    public void showMenu(){     //вывод меню
        String stringListOfItems = String.join("\n", listOfItems);
        System.out.println(stringListOfItems);
    }

    public List<String> getListOfItems() {

        return listOfItems;
    }

}

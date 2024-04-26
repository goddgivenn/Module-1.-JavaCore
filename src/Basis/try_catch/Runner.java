package Basis.try_catch;

public class Runner {
    public static void main(String[] args) {
        try {                                   //в блоке try код, который надо выполнить
            int res = 2 / 0;
        }catch (Exception e){                   //если в try ошибка (деление на ноль) - выполняется блок catch
            String resError = e.getMessage();   //Exception e - вид ошибки, который мы ожидаем (если ошибка будет другого типа, то исключение не сработает)
//            e.printStackTrace();
            System.out.println("Error: " + resError); //e.getMessage(); - то, что мы делаем при ошибке (записываем в переменную текст ошибки)
        }finally {
            System.out.println("Блок finally выполняется в любом случае!"); //finally удобен, например, для нормального завершения программы
        }

//        В Java имеется множество различных типов исключений, и мы можем разграничить их обработку, включив дополнительные блоки catch:
        System.out.println();

        int[] numbers = new int[3];
        try{
            numbers[6]=45;
            numbers[6]=Integer.parseInt("ss");
        }
        catch(ArrayIndexOutOfBoundsException ex){           //если выполняется один блок catch, другие срабатывать не будут
            System.out.println("Выход за пределы массива");
        }
        catch(NumberFormatException ex){
            System.out.println("Ошибка преобразования из строки в число");
        }

        System.out.println();

        /*
        * Чтобы сообщить о выполнении исключительных ситуаций в программе, можно использовать оператор throw.
        * То есть с помощью этого оператора мы сами можем создать исключение и вызвать его в процессе выполнения.
        */

        try{
            int num = 5;
            if(num > 4){
                throw new Exception ("Число больше 4"); //создаем свою ошибку
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

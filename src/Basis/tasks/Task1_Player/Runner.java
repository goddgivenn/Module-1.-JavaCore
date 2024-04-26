package Basis.tasks.Task1_Player;

/*
Создать класс игрока, у которого есть данные с его положением в x,y и своим символом.
Создать класс отрисовщик, с методом, который получает игрока и отрисовывает его.
*/

public class Runner {
    public static void main(String[] args) throws Exception {
        Player player = new Player(-4, 1, 'p');
        Renderer renderer = new Renderer();

//        System.out.println(player);
        renderer.playerRendering(player);
    }
}

package Basis.tasks.Task1_Player;

public class Player {
    private int positionX;
    private int positionY;
    private char playerSymbol;

    public Player(int positionX, int positionY, char playerSymbol)  {
        this.positionX = getPositiveNumber(positionX);
        this.positionY = getPositiveNumber(positionY);
        this.playerSymbol = playerSymbol;
    }

    public char getPlayerSymbol() {
        return playerSymbol;
    }

    @Override
    public String toString() {
        return "Player{" +
                "positionX=" + positionX +
                ", positionY=" + positionY +
                ", playerSymbol=" + playerSymbol +
                '}';
    }

    public int getPositiveNumber(int number) {
        return number >= 0 ? number : 0;
    }
}



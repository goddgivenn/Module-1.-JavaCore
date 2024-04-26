package OOP.start_package;

public class User {
    private String login;
    private int password;

    {
        System.out.println("Блок инициализации"); //срабатывает в любом случае - при создании экз-ра
    }

    public User(String login, int passw) {

            this.login = login;                     //this. - указывает на то, что мы присваиваем значение параметра экз-ра (которое мы вводим в main) переменной (полю) самого класса
            password = passw;                       //если имена разные, то можно без this

    }

    void infoAboutUser(){
        System.out.printf("Login: %s;\nPassword: %d", login, password);
    }

    public String getLogin() {
        return login;
    }

    public int getPassword() {
        return password;
    }
}

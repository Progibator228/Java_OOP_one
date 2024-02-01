package org.example;

public class User {

    String login ;

    Integer password ;


    public User(String login, Integer password) {
        this.login = login;
        this.password = password;


    }





    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {this.login = login;}

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("Имя пользователя = %s Пароль пользователя = %d",login,password);
    }
}

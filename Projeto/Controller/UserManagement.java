package Projeto.Controller;

public abstract class UserManagement {
    protected String usuario;
    protected String senha;

    protected UserManagement(String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;
    }

    protected UserManagement(){

    }
}
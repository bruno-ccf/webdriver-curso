package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFormPage extends Basepage {


    public LoginFormPage(WebDriver navegador) {
        super(navegador);
    }

    //----------------------------------------estrutural--------------------------------------------------------------------------------------------
    //recebe o login -parametro- e entra da pagina
    public LoginFormPage digitarLogin(String login) {
        navegador.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys(login);

        //retorna a propria pagina
        return this;
    }

    public LoginFormPage digitarPassword(String senha) {
        navegador.findElement(By.id("signinbox")).findElement(By.name("password")).sendKeys(senha);

        return this;
    }


    public SecretPage clicarSignIn() {
        navegador.findElement(By.linkText("SIGN IN")).click();
        return new SecretPage(navegador);
    }

    //----------------------------------------funcional--------------------------------------------------------------------------------------------
    public SecretPage fazerlogin(String login, String senha) {
        digitarLogin(login);
        digitarPassword(senha);
        clicarSignIn();

        return new SecretPage(navegador);
    }


}


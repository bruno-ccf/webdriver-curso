package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//classe para realizar login
public class LoginPage extends Basepage {


    public LoginPage(WebDriver navegador) {
        super(navegador);
    }

    //procura o elementi link text -Sign in- e clica
    public LoginFormPage clickSignIn() {
        navegador.findElement(By.linkText("Sign in")).click();

        //retorna pagina de login
        return new LoginFormPage(navegador);
    }

}

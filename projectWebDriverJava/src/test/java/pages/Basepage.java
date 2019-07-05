package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Basepage {
    protected WebDriver navegador;

    public Basepage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public String caputuraTextoToast() {
        WebElement mensagem = navegador.findElement(By.id("toast-container"));
        return mensagem.getText();
    }

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//estrutural--------------------------------------------------------------------------------------------------------
//ADD contato no formulario aberto
public class AddContact extends Basepage {
    public AddContact(WebDriver navegador) {
        super(navegador);
    }

    //seelciona o tipo de dato
    public AddContact escolherTipoContato(String tipo) {
        WebElement campotipo = navegador.findElement(By.id("addmoredata")).findElement(By.name("type"));
        new Select(campotipo).selectByVisibleText(tipo);
        return this;
    }

    //Digita o tipo de elemento escolhido
    public AddContact digitarTipoContato(String contato) {
        navegador.findElement(By.id("addmoredata")).findElement(By.name("contact")).sendKeys(contato);
        return this;
    }

    //salva dados inseridos
    public MePage clicarSalvar() {
        navegador.findElement(By.id("addmoredata")).findElement(By.linkText("SAVE")).click();
        return new MePage(navegador);
    }

    //funcional --------------------------------------------------------------------------
    public MePage adicionarContato(String tipo, String contato) {
        escolherTipoContato(tipo);
        digitarTipoContato(contato);
        clicarSalvar();
        return new MePage(navegador);
    }
}

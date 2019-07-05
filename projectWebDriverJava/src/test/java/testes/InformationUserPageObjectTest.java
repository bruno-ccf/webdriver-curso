package testes;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import suporte.Web;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "test.csv")

public class InformationUserPageObjectTest {

    private WebDriver navegador;

    //tudo que ocorre antes do teste
    @Before
    public void setUp() {
        navegador = Web.creatBrowserStack();
    }

    @Test

    public void AdicionarInformacaodoUsuariotest(
            @Param(name = "login") String login,
            @Param(name = "senha") String senha,
            @Param(name = "tipo") String tipo,
            @Param(name = "contato") String contato,
            @Param(name = "mensagem") String mensagem) {
        //chama a pagina
        String textToast = new LoginPage(navegador)

                //clica no link text
                .clickSignIn()

                //fazer login
                .fazerlogin(login, senha)
                .clicarMe()
                .clicarAbaMoreDataAboutYou()
                .clicarBottonAddMoreDataAboutYou()
                .adicionarContato(tipo, contato)
                .caputuraTextoToast();

        Assert.assertEquals(mensagem, textToast);

    }


    // depois do teste acontecer
    @After
    public void tearDown() {
        // navegador.quit();
    }


}


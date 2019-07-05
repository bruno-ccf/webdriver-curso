package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Web {
    public static final String USERNAME = "bruno414";
    public static final String AUTOMATE_KEY = "4fyJfPGbNP3mDikuP9AU";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";


    //cria instancia do chhrome
    public static WebDriver createrChrome() {

        //abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "/home/bruno/drivers/chromedriver");

        //cria variavel q recebe navegado
        WebDriver navegador = new ChromeDriver();

        //faz com que cada ação demore 5 segundos até a proxima
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        //navegando para pagina de taskit //abre o site
        navegador.get("http://www.juliodelima.com.br/taskit");

        return navegador;
    }


    public static WebDriver creatBrowserStack() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "60.0");
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("resolution", "1280x800");
        caps.setCapability("browserstack.debug", "true");

        WebDriver navegador = null;
        try {
            navegador = new RemoteWebDriver(new URL(URL), caps);

            navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            navegador.get("http://www.juliodelima.com.br/taskit");

        } catch (MalformedURLException e) {
            System.out.println("Houve erro" + e.getMessage());
        }


        return navegador;
    }


}

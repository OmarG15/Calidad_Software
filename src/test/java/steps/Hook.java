package steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest(Scenario scenario) {

        System.out.println("Abriendo Navegador : Google Chrome");

        //Chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\Web\\chromedriver.exe");

    }

    @After
    public void TerminarTest(Scenario scenario){

        if(scenario.isFailed()){

            //toma un screenshot

            System.out.println(scenario.getName());
        }
        System.out.println(" Cerrando el navegador");
    }
}

package steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserStep extends BaseUtil{

    private BaseUtil base;

    public BrowserStep(BaseUtil base) {
        this.base = base;
    }
    @Given("^abrimos el navegador$")
    public void abrimosElNavegador() {

        base.Driver = new ChromeDriver();
        System.out.println("Abriendo Navegador");
    }

    @And("^introducimos la direccion correcta$")
    public void introducimosLaDireccionCorrecta() {
        base.Driver.navigate().to("http://www.executeautomation.com/demosite/Login.html");
        System.out.println("Direccion correcta introducida");
    }

    @Then("^pasamos a la pagina de Login$")
    public void pasamosALaPaginaDeLogin() {
        Assert.assertEquals("no se muestra",base.Driver.findElement(By.name("UserName")).isDisplayed(),true);
        System.out.println("Bienvenido al Login");
    }

    @Then("^Nos envia un mensaje de error (\\d+)$")
    public void nosEnviaUnMensajeDeError(int arg0) {
        System.out.println("ERROR"+ arg0 +" NOT FOUND");
    }

    @And("^introducimos la direccion erronea de \"([^\"]*)\"$")
    public void introducimosLaDireccionErroneaDe(String arg0) throws Throwable {
        base.Driver.navigate().to(arg0);

    }

}

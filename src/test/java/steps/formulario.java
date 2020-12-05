package steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class formulario extends BaseUtil {

    public formulario(BaseUtil base) {
        this.base = base;
    }

    private BaseUtil base;

    @Given("^navegamos a la pagina del form$")
    public void navegamosALaPaginaDelForm() {

        base.Driver = new ChromeDriver();
        System.out.println("Abriendo Navegador");
        base.Driver.navigate().to("https://demosite.executeautomation.com/index.html?UserName=&Password=&Login=Login");

    }

    @When("^seleccionamos la opcion de \"([^\"]*)\"$")
    public void seleccionamosLaOpcionDe(String arg0) throws Throwable {
        base.Driver.findElement(By.name(arg0)).click();
    }

    @Then("^se abre un Popup alert$")
    public void seAbreUnPopupAlert() {
        //base.Driver.switchTo().alert().accept();
    }


    @And("^se presiona el boton ok del alert$")
    public void sePresionaElBotonOkDelAlert() {
        //base.Driver.switchTo().alert().accept();

    }
}

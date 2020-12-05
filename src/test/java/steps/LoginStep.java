package steps;

import Base.BaseUtil;
import Transformation.EmailTransform;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.util.ArrayList;
import java.util.List;

public class LoginStep extends BaseUtil {

    private BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }


    @And("^introducimos ([^\"]*) y ([^\"]*) para hacer login$")
    public void introducimosUsernameYPasswordParaHacerLogin(String userName, String password) {

        System.out.println("Username es: " + userName);
        System.out.println("Password es: " + password);

    }

    @And("^introducimos la direccion del email del usuario como Email:([^\"]*)$")
    public void introducimosLaDireccionDelEmailDelUsuarioComoEmailAdmin(@Transform(EmailTransform.class) String email) {

        System.out.println("el correo es : " + email);
    }


    @And("^hacemos click en el boton de login$")
    public void hacemosClickEnElBotonDeLogin() {
        LoginPage page = new LoginPage(base.Driver);
        page.ClickLogin();
    }

    @And("^introducimos lo siguiente para hacer login$")
    public void introducimosLoSiguienteParaHacerLogin(DataTable table) throws Throwable {


//      List<List<String>> data = table.raw();
//      System.out.println(data.get(0).get(0));
//      System.out.println(data.get(0).get(1));

        List<User> users = new ArrayList<User>();
        users = table.asList(User.class);


        LoginPage page = new LoginPage(base.Driver);
        for (User user:users) {

            page.Login(user.username, user.password);
            
        }

    }

    @Then("^pasamos a la siguiente pagina$")
    public void pasamosALaSiguientePagina() {

        Assert.assertEquals("No se muestra",base.Driver.findElement(By.id("Initial")).isDisplayed(),true);
    }

    @Given("^navegamos a la pagina de login$")
    public void navegamosALaPaginaDeLogin() {

        System.out.println("pagina de Login");
        base.Driver = new ChromeDriver();
        base.Driver.navigate().to("http://www.executeautomation.com/demosite/Login.html");
    }

    public class User {
        public String username;
        public String password;

        public User(String userName, String passWord) {
            username = userName;
            password = passWord;
        }
    }
}

package uitesting.upb.org.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import uitesting.upb.org.managefile.PropertyAccesor;
import uitesting.upb.org.managepage.wallet.accountmainpage.AccountmainPage;
import uitesting.upb.org.managepage.wallet.accountoptionspage.AccountOptionsPage;
import uitesting.upb.org.managepage.wallet.incomepage.IncomePage;
import uitesting.upb.org.webdrivermanager.DriverManager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class WalletStepDefs {
    @Given("^pagina_creador_decuentas$")
    public void pagina_creador_decuentas() {
        loadMaimPage().createAccountAndEnter("testaccount");
    }


    @Then("^crear-income$")
    public void crearIncome() {
        DriverManager.getInstance().getWebDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        new AccountOptionsPage().enterIncomes();
    }
    public static AccountmainPage loadMaimPage(){
        DriverManager.getInstance().getWebDriver().manage().window().maximize();
        DriverManager.getInstance().getWebDriver().navigate().to(PropertyAccesor.getInstance().getBaseURL());
        return new AccountmainPage();
    }

    @Then("^entrar-crear-income-en-cuenta$")
    public void entrarCrearIncomeEnCuenta() {
        Date date = null;
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2019");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        new IncomePage().fillAndAddIncome("income1","Salary",1000,date);
    }
}

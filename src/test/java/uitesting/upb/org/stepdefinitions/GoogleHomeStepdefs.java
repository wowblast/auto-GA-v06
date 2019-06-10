package uitesting.upb.org.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GoogleHomeStepdefs {
   @Given("^Gooble page is loaded$")
    public void gooblePageIsLoaded() throws Throwable {
       System.out.println(" hello BBD");
    }

    @Then("^se ejecuta$")
    public void seEjecuta() {
        System.out.println("\nluego va esto");
    }

    @Then("^luego esto$")
    public void luegoEsto() {
        System.out.println("\nluego despyes despues");
    }

    @Given("^PAGINA (\\d+) CARGADA$")
    public void paginaCARGADA(int arg0) {

    }

    @Given("^(\\d+),\"([^\"]*)\" on dw$")
    public void onDw(int arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}

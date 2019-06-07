package uitesting.upb.org.managepage.wallet.accountmainpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;
import uitesting.upb.org.managepage.wallet.accountoptionspage.AccountOptionsPage;
import uitesting.upb.org.webdrivermanager.DriverManager;

import java.util.concurrent.TimeUnit;

public class AccountmainPage  extends BasePage {
    @FindBy(id = "accountNameInput")
    private WebElement nameField;

    @FindBy(id = "addAccountButton")
    private WebElement addbutton;

    private WebElement enterAccount;

    public AccountmainPage fillAccount(String text){

        Events.fillField(nameField, text);
        return this;
    }

    public  void EnterAccount(String name){
        DriverManager.getInstance().getWebDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        enterAccount = DriverManager.getInstance().getWebDriver().findElement(By.id(name));
        Events.click((enterAccount));
    }

    public void addAccount(){
        Events.click(addbutton);
    }

    public void createAccountAndEnter(String text){
        fillAccount(text).addAccount();
        EnterAccount(text);

    }



}

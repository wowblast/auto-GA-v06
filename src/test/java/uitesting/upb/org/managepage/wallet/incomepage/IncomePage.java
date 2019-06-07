package uitesting.upb.org.managepage.wallet.incomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;
import uitesting.upb.org.managepage.wallet.accountmainpage.AccountmainPage;
import uitesting.upb.org.webdrivermanager.DriverManager;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class IncomePage extends BasePage {
    @FindBy(id = "name")
    private WebElement nameField;

    @FindBy(id = "category")
    private WebElement categoryField;

    @FindBy(id = "amount")
    private WebElement amountField;

    @FindBy(id = "dateSpace")
    private WebElement dateSpaceField;

    @FindBy(id = "buttonTransaction")
    private WebElement buttonTransaction;

    public IncomePage fillIncome(String name, String category, int amount, Date date){

        Events.fillField(nameField, name);
        Events.fillField(categoryField, category);
        Events.fillField(amountField,amount+"");
        Events.fillField(dateSpaceField, date+"");
        return this;
    }

    public  void addIncome(){
        DriverManager.getInstance().getWebDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Events.click((buttonTransaction));
    }
    public void fillAndAddIncome(String name, String category, int amount, Date date){
        fillIncome(name,category,amount,date).addIncome();
    }



}

package uitesting.upb.org.managepage.wallet.accountoptionspage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;
import uitesting.upb.org.managepage.wallet.accountmainpage.AccountmainPage;
import uitesting.upb.org.webdrivermanager.DriverManager;

import java.util.concurrent.TimeUnit;

public class AccountOptionsPage extends BasePage {
    @FindBy(id = "account-main-menu")
    private WebElement backButton;

    @FindBy(id = "Income")
    private WebElement enterIncomeButton;




    public void enterIncomes() {
        DriverManager.getInstance().getWebDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Events.click(enterIncomeButton);
    }

}

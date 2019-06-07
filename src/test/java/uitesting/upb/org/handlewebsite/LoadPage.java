package uitesting.upb.org.handlewebsite;

import uitesting.upb.org.managefile.PropertyAccesor;
import uitesting.upb.org.managepage.google.home.Home;
import uitesting.upb.org.managepage.wallet.accountmainpage.AccountmainPage;
import uitesting.upb.org.managepage.wallet.accountoptionspage.AccountOptionsPage;

import uitesting.upb.org.managepage.wallet.incomepage.IncomePage;
import uitesting.upb.org.webdrivermanager.DriverManager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @autor Marcelo Garay
 */
public class LoadPage {
    public static AccountmainPage loadMaimPage(){
        DriverManager.getInstance().getWebDriver().navigate().to(PropertyAccesor.getInstance().getBaseURL());
        return new AccountmainPage();
    }

    public static void main(String[] args) {
        loadMaimPage().createAccountAndEnter("testaccount");
        DriverManager.getInstance().getWebDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        new AccountOptionsPage().enterIncomes();
        Date date = null;
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2019");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        new IncomePage().fillAndAddIncome("income1","Salary",1000,date);

    }
}

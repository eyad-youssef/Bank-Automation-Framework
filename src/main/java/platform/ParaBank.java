package platform;

import pages.LoginPage;
import pages.subpages.AccountOverviewPage;
import pages.subpages.NewAccountPage;

public class ParaBank  {
public LoginPage login ;
public NewAccountPage newAccountPage;
public AccountOverviewPage accountOverviewPage;

    public ParaBank() {
        login= new LoginPage();
    }
}

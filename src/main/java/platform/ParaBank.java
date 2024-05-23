package platform;

import pages.LoginPage;
import pages.subpages.AccountOverviewPage;
import pages.subpages.NewAccountPage;
import pages.subpages.RequestLoanPage;
import pages.subpages.TransferFundsPage;

public class ParaBank  {
public LoginPage login ;
public NewAccountPage newAccountPage;
public AccountOverviewPage accountOverviewPage;
public TransferFundsPage transferFundsPage;
public RequestLoanPage requestLoanPage;

    public ParaBank() {
        login= new LoginPage();
    }
}

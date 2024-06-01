package platform;

import pages.LoginPage;
import pages.subpages.*;

public class ParaBank  {
public LoginPage login ;
public NewAccountPage newAccountPage;
public AccountOverviewPage accountOverviewPage;
public TransferFundsPage transferFundsPage;
public RequestLoanPage requestLoanPage;
public BillPayPage billPayPage;

    public ParaBank() {
        login= new LoginPage();
    }
}

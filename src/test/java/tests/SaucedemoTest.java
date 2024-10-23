package tests;

import base.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.DashboardPage;
import pages.LoginPage;
import pages.LogoutPage;

import java.io.IOException;

public class SaucedemoTest extends BaseTest {

    @BeforeClass
    public void setUp() throws IOException {
        driver = initializeDriver();
        driver.get(getUrl());//url and driver is coming from data.properties file
    }

    @Test
    public void testSaucedemoFlow()  throws InterruptedException{//Login using the credentials

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

 
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.addItemToCart();
        dashboardPage.goToCart();

      
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.proceedToCheckout("Abhinav", "Dwivedi", "462042");

       
        LogoutPage logoutPage = new LogoutPage(driver);
        logoutPage.logout();// it will open the menuBar and click on Exit
    }
}

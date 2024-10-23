package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
    WebDriver driver;

    By menuButton = By.xpath("//div[@class='bm-burger-button']");
    		// alternate path //button[text()='Open Menu']
   By logoutButton = By.xpath("//a[@id='logout_sidebar_link']");

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void logout() throws InterruptedException {
        driver.findElement(menuButton).click();
        Thread.sleep(2000);
        driver.findElement(logoutButton).click();
    }
}
//have to click on menu and logout
//logout
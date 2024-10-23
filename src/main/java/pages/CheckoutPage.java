package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    WebDriver driver;

    By checkoutButton = By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/a[2]");
    By firstNameField = By.id("first-name");
    By lastNameField = By.id("last-name");
    By zipCodeField = By.id("postal-code");
    //with id its nnot working
    By continueButton = By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input");
    By finishButton = By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void proceedToCheckout(String firstName, String lastName, String zipCode) {
        driver.findElement(checkoutButton).click();
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(zipCodeField).sendKeys(zipCode);
        driver.findElement(continueButton).click();
        driver.findElement(finishButton).click();
    }
}
//click on checkout button
//first name 
//last name 
//postal code

//continue //finish it 
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
 WebDriver driver;

    By firstItem = By.cssSelector(".inventory_item:first-child .btn_inventory"); // div:child.button ()
     By cartButton = By.className("shopping_cart_link"); // cart classs

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addItemToCart() {
        driver.findElement(firstItem).click();   /// it willl find the first element
    }

    public void goToCart() {
        driver.findElement(cartButton).click();//click on the right most cart icon
    }
}

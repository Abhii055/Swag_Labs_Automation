package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    // Set WebDriver as protected for (SaucedemoTest)
    protected WebDriver driver;
    protected Properties prop;

    public WebDriver initializeDriver() throws IOException {
  
        prop = new Properties();
        FileInputStream fis = new FileInputStream(
                "C:\\Users\\abhin\\eclipse-workspace\\SwagLabs_Automation\\src\\main\\java\\resources\\data.properties");
        prop.load(fis);

        String browser = prop.getProperty("browser");
        if (browser.equals("chrome")) {
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        return driver;
    }

    public String getUrl() throws IOException {
        return prop.getProperty("url");
    }
}

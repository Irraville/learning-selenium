import lv.acodemy.page_object.LoginPage;
import lv.acodemy.page_object.ProductsPage;
import lv.acodemy.utils.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceDemoTest {

    private static final Logger Log = LoggerFactory.getLogger(SauceDemoTest.class);
Config config = Config.readConfig();
WebDriver driver;
LoginPage loginPage;
ProductsPage productPage;


    @BeforeMethod
    public void beforeTest() {
        // Initialize driver;
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        productPage = new ProductsPage(driver);
    }

    @Test
    public void testSauceDemoSuccessLogin() {

        log.info("Authorize Products page title");
        loginPage.authorize("standard_user", "secret_sauce");

        Assert.assertEquals(productPage.getProductPageTitle().getText(), "Products");
    }

    @AfterMethod
    public void afterTest() {
        // Close driver
        driver.close();
        driver.quit();
    }
}
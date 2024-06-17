package lv.acodemy.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage {
    WebDriver driver;

    @FindBy(xpath = "//span[@data-test='title']")
    private WebElement productPageTitle;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getProductPageTitle() {
        return productPageTitle;
    }
}


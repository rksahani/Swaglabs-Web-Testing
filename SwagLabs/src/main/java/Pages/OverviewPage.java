package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage {
    WebDriver driver;
    public OverviewPage(WebDriver driver){
        this.driver =driver;
    }
    private By cartProductName=By.xpath("//div[@class=\"inventory_item_name\"]");
    private By cartProductPrice=By.xpath("//div[@class=\"inventory_item_price\"]");

    public String validateName()
    {
        return driver.findElement(cartProductName).getText();

    }
    public String validatePrice()
    {
        return driver.findElement(cartProductPrice).getText();
    }
    private By finishButton = By.xpath("(//button)[4]");
    public OrderPage finish(){
        driver.findElement(finishButton).click();
        return new OrderPage(driver);
    }
}

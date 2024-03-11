package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public  static By show(){
        return By.xpath("//div[@class=\"app_logo\"]");
    }
    private By fleecejacket = By.xpath("//a[@id=\"item_5_title_link\"]");
    public ItemPage item()
    {
        driver.findElement(fleecejacket).click();
        return new ItemPage(driver);
    }
    private By homeProductName=By.xpath("//div[@class=\"inventory_item_name\"]");
    private By homeProductPrice=By.xpath("//div[@class=\"inventory_item_price\"]");


    public String validateName()
    {
        return   driver.findElement(homeProductName).getText();

    }
    public String validatePrice()
    {
        return driver.findElement(homeProductPrice).getText();
    }

}


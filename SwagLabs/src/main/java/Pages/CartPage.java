package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CartPage {
WebDriver driver;
public CartPage(WebDriver driver){ this.driver = driver; }

    public static By summary(){
    return By.xpath("//div[@class=\"inventory_item_desc\"]");
    }
    private By CheckoutButton = By.xpath("(//button)[5]");

    public CheckoutPage checkout()
    {
        driver.findElement(CheckoutButton).click();
        return new CheckoutPage(driver);
    }

    public static By emptycart()
    {
        return By.xpath("//div[@class=\"shopping_cart_container\"]");
    }

   private By removeButton = By.xpath("(//button)[3]");
    public CartPage remove()
    {
        driver.findElement(removeButton).click();
        return new CartPage(driver);
    }
private By Home = By.xpath("(//button)[3]");
    public HomePage shopagain()
    {
        driver.findElement(Home).click();
        return new HomePage(driver);
    }
}

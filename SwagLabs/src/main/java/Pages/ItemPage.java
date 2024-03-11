package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemPage {
    WebDriver driver;
    public  ItemPage(WebDriver driver){
        this.driver=driver;
    }
    public static By details(){
        return By.xpath("//div[@class=\"inventory_details_price\"]");
    }
   private By add= By.xpath("(//button)[4]");
    public ItemPage addtocart()
    {
        driver.findElement(add).click();
        return new ItemPage(driver);
    }
    public static By added(){
        return By.xpath("//span[@class=\"shopping_cart_badge\"]");
    }

  private  By cartbox = By.xpath("(//a)[5]");
   public ItemPage clickcart()
    {
        driver.findElement(cartbox).click();
        return new ItemPage(driver);
    }

}

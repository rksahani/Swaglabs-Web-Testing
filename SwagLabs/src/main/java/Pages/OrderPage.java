package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    WebDriver driver;
    public OrderPage(WebDriver driver){
        this.driver=driver;
    }
public static By Complete(){
        return By.xpath("//h2[text()=\"Thank you for your order!\"]");
}
//Thank you for your order!
//Your order has been dispatched, and will arrive just as fast as the pony can get there!
private By backHomeButton = By.xpath("(//button)[3]");
    public HomePage back(){
        driver.findElement(backHomeButton).click();
        return new HomePage(driver);
    }
}

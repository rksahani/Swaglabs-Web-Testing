package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class CheckoutPage {
    WebDriver driver;
    public CheckoutPage(WebDriver driver){
        this.driver=driver;
    }
    public static By info(){
        return By.xpath("(//span[@class])[2]");
    }
    private By firstname = By.xpath("(//input)[1]");
    private By lastname = By.xpath("(//input)[2]");
    private By zipcode = By.xpath("(//input)[3]");
    private By continueButtton = By.xpath("(//input)[4]");
    public OverviewPage filladdress(String FirstName,String LastName,String ZipCode)
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(firstname).sendKeys(FirstName);
        driver.findElement(lastname).sendKeys(LastName);
        driver.findElement(zipcode).sendKeys(ZipCode);
        driver.findElement(continueButtton).click();
        return new OverviewPage(driver);
    }

}

import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class filterTest extends baseTest{

        @Test

        public void filter() {

            new LoginPage(driver).performLogin("standard_user","secret_sauce");

            driver.findElement(By.xpath("//select")).click();

            String option = "Price (high to low)";

            WebElement dropdown = driver.findElement(By.xpath("//select/option[contains(text(), '" + option + "')]"));

            dropdown.click();

            System.out.println("clicked");

        }

}


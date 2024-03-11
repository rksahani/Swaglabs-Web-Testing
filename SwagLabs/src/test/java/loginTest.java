import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTest extends baseTest {
    @Test
    public  void validlogin() {
        new LoginPage(driver).performLogin("standard_user","secret_sauce");
        Assert.assertTrue(driver.findElement(HomePage.show()).isDisplayed());
    }
    @Test
    public void invalidLogin() {
        new LoginPage(driver).performLogin("standard_user", "error_user");
        Assert.assertTrue((driver.findElement(LoginPage.error())).isDisplayed());
    }

}

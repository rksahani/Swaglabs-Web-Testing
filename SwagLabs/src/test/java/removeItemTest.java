import Pages.CartPage;
import Pages.HomePage;
import Pages.ItemPage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class removeItemTest extends baseTest {
    @Test
    public void removeitem() {
        new LoginPage(driver).performLogin("standard_user", "secret_sauce");
        new HomePage(driver).item();
        Assert.assertTrue(driver.findElement(ItemPage.details()).isDisplayed());
        new ItemPage(driver).addtocart();
        Assert.assertTrue(driver.findElement(ItemPage.added()).isDisplayed());
        new ItemPage(driver).clickcart();
        Assert.assertTrue(driver.findElement(CartPage.summary()).isDisplayed());
        new CartPage(driver).remove().shopagain();
        Assert.assertTrue(driver.findElement(CartPage.emptycart()).isDisplayed());
    }
}

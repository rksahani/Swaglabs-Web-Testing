import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class orderTest extends baseTest{
    @Test
    public void orderItem(){
        new LoginPage(driver).performLogin("standard_user","secret_sauce");
        new HomePage(driver).item();
        Assert.assertTrue(driver.findElement(ItemPage.details()).isDisplayed());
        new ItemPage(driver).addtocart();
        Assert.assertTrue(driver.findElement(ItemPage.added()).isDisplayed());
        new ItemPage(driver).clickcart();
        Assert.assertTrue(driver.findElement(CartPage.summary()).isDisplayed());
        new CartPage(driver).checkout().filladdress("Raj","Kumar","394501");
        String homepageProductName = new HomePage(driver).validateName();
        String homepageProductPrice=new HomePage(driver).validatePrice();
        String cartpageProductName=new OverviewPage(driver).validateName();
        String cartpageProductPrice =new OverviewPage(driver).validatePrice();

        Assert.assertEquals(homepageProductName,cartpageProductName,"Sauce Labs Fleece Jacket");
        Assert.assertEquals(homepageProductPrice,cartpageProductPrice,"$49.99");
        new OverviewPage(driver).finish();
        Assert.assertTrue(driver.findElement(OrderPage.Complete()).isDisplayed());
        new OrderPage(driver).back();
    }

}

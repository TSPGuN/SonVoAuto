package anhtester.com.testcase.Bai11;

import anhtester.com.testcase.common.SetupBrowser;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert extends SetupBrowser {

    @Test(priority = 1)
    public void checkTitle() {

        driver.get("https://anhtester.com");

        String expectedTitle = "Anh Tester Automation Testing";
        String originalTitle = driver.getTitle();

        System.out.println("*** Checking For The Title ***");

        Assert.assertEquals(originalTitle, expectedTitle);

        Assert.assertEquals(driver.findElement(By.id("btn-login")).getText().trim(), "LOG IN","Text ko dung");

        Assert.assertTrue(driver.findElement(By.id("btn-login")).isEnabled(),"Button is enabled");

        driver.findElement(By.id("btn-login")).click();
    }
}

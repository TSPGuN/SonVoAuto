package anhtester.com.testcase.Bai15;

import anhtester.com.testcase.common.SetupBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class LearnImplicitWaitAndExpliciWait extends SetupBrowser {
    @Test(priority = 1)
    public void ImplicitWaitDemo() throws InterruptedException {
        //Set timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://app.hrsale.com/");

        driver.findElement(By.id("iusername")).sendKeys("frances.burns");
        driver.findElement(By.id("ipassword")).sendKeys("frances.burns");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //Click menu dự án
        driver.findElement(By.xpath("//span[contains(text(),'Projects')]")).click();

        Thread.sleep(2000);
        driver.quit();
    }
    @Test(priority = 1)
    public void ExplicitWaitDemo() throws InterruptedException {
        //Set timeout
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://app.hrsale.com/");

        driver.findElement(By.id("iusername")).sendKeys("frances.burns");
        driver.findElement(By.id("ipassword")).sendKeys("frances.burns");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //Click menu dự án
        driver.findElement(By.xpath("//span[contains(text(),'Projects')]")).click();

        Thread.sleep(2000);
        driver.quit();
    }
}

package anhtester.com.testcase.Bai9;

import anhtester.com.testcase.common.SetupBrowser;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RunTest extends SetupBrowser {
    @Test
    public void loginCRM() throws InterruptedException {
        createDriver();
        driver.navigate().to("https://app.wisere.com/");
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("nguyentrantuan1000@outlook.com");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("Quocmykaka252!");
        Thread.sleep(1000);

        closeDrive();
    }
    @Test
    public void openProject() throws InterruptedException {
        createDriver();
        driver.navigate().to("https://app.wisere.com/");
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("nguyentrantuan1000@outlook.com");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("Quocmykaka252!");
        Thread.sleep(1000);

        closeDrive();
    }


}

package anhtester.com.testcase.Bai9;

import anhtester.com.testcase.common.SetupBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class clientTest extends SetupBrowser {

    @Test(priority = 1 ,description = "Dang Nhap vao luong")
    public void loginHRM() throws InterruptedException {
        driver.get("https://app.hrsale.com/erp/login");
        Thread.sleep(1000);
        WebElement inputEmail = driver.findElement(By.id("iusername"));
        WebElement inputPass = driver.findElement(By.id("ipassword"));
        WebElement buttonSignIn = driver.findElement(By.xpath("//button[@type='submit']"));

        inputEmail.sendKeys("frances.burns");
        inputPass.sendKeys("frances.burns");
        buttonSignIn.click();
        Thread.sleep(2000);

    }
    @Test(priority = 2,description = "clickProject")
    public void openProject(){
        driver.findElement(By.xpath("//span[normalize-space()='Projects']")).click();
    }

}

package anhtester.com.testcase.Wisere;

import anhtester.com.testcase.common.SetupBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginPage extends SetupBrowser {
    @Test(priority = 1,description = "dang nhap")
    public void LoginPage() throws InterruptedException {
        driver.get("https://app.wisere.com/users/signin");
        WebElement inputMail = driver.findElement(By.id("email"));
        WebElement inputPass = driver.findElement(By.id("password"));
        WebElement buttonLogin = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));

        inputMail.sendKeys("nguyentrantuan1000@outlook.com");
        inputPass.sendKeys("Quocmykaka252!");
        buttonLogin.click();
        Thread.sleep(2000);

    }
    @Test(priority = 2,description = "setting")
    public void ClickSetting() throws InterruptedException {
        driver.findElement(By.xpath("//span[@aria-label='menu-unfold']//*[name()='svg']")).click();
        Thread.sleep(4000);
    }


}

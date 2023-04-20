package anhtester.com.testcase.DentalLabWisere;

import anhtester.com.testcase.common.SetupBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login extends SetupBrowser {
    @Test(priority = 1, description = "dang nhap")
    public void LoginPage() throws InterruptedException {
        driver.get("https://dental-lab.wisere.com/users/signin");
        WebElement inputMail = driver.findElement(By.id("email"));
        WebElement inputPass = driver.findElement(By.id("password"));
        WebElement buttonLogin = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));

        inputMail.sendKeys("sondl@outlook.com");
        inputPass.sendKeys("Quocmykaka252!");
        buttonLogin.click();
        Thread.sleep(3000);
    }

    @Test(priority = 2, description = "DentalPractice")
    public void ClickSetting() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='/office']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='floating-button__item__circle primary ']")).click();
        Thread.sleep(2000);
    }

}

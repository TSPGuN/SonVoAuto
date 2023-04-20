package anhtester.com.testcase.Bai16ThucHanh;

import anhtester.com.testcase.common.SetupBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Projects extends SetupBrowser {

    @Test
    public void createProject() throws InterruptedException {
        driver.get("https://app.hrsale.com/erp/login");

        WebElement inputEmail = driver.findElement(By.id("iusername"));
        WebElement inputPass = driver.findElement(By.id("password"));
        WebElement buttonSignIn = driver.findElement(By.xpath("//button[@type='submit']"));
        Thread.sleep(1000);
        inputEmail.sendKeys("frances.burns");
        inputPass.sendKeys("frances.burns");
        buttonSignIn.click();
        driver.findElement(By.xpath("//span[normalize-space()='Projects']" )).click();
        Thread.sleep(2000);

        String pageDuAnURL = driver.getCurrentUrl();
        System.out.println(pageDuAnURL);
        Assert.assertTrue(pageDuAnURL.contains("/projects-list"),"Không đúng URL của page");

        String tenDuAn = "Dự Án 1906A1";
        driver.findElement(By.xpath("")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("")).sendKeys(tenDuAn);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@id='select2-client_id-container']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("")).click(); ////input[@role

        driver.findElement(By.xpath("")).sendKeys("");

        driver.findElement(By.xpath(""));

        driver.findElement(By.xpath(""));

        driver.findElement(By.xpath(""));

        driver.findElement(By.xpath(""));

        driver.findElement(By.xpath(""));




    }

}

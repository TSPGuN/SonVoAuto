package anhtester.com.testcase.Bai13;

import anhtester.com.testcase.common.SetupBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LearnAlert extends SetupBrowser {

    @Test
    public void testAlert1() throws InterruptedException {

        driver.get("");
        Thread.sleep(1000);
        driver.findElement(By.xpath("")).click();
        Thread.sleep(1000);
        System.out.println(driver.switchTo().alert().getText());
//        Thread.sleep(1000);
//        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        driver.switchTo().alert().dismiss();


    }

    @Test
    public void testAlert2() throws InterruptedException {

        driver.get("");
        Thread.sleep(1000);
        driver.findElement(By.xpath("1 cai xpath co Yes và cancel")).click();
        Thread.sleep(1000);
        System.out.println(driver.switchTo().alert().getText());
        Assert.assertEquals(driver.switchTo().alert().getText(), "Press a Button", "Tex on Alert not match");
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
//        driver.switchTo().alert().dismiss();

        WebElement textConfirm = driver.findElement(By.xpath("nhan vao nut confirm ne"));
        Assert.assertEquals(textConfirm.getText(), "You Press OK!", "Text k chinh xác");

        // nhan nut cancel

        Thread.sleep(1000);
        driver.findElement(By.xpath("1 cai xpath co Yes và cancel")).click();
        Thread.sleep(1000);
        System.out.println(driver.switchTo().alert().getText());
        Assert.assertEquals(driver.switchTo().alert().getText(), "Press a button", "Text on Alert not match");
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(1000);
        WebElement textCancel = driver.findElement(By.xpath("Xpath cua nut Cancel"));
        Assert.assertEquals(textCancel.getText(), "You Pressed Cancel", "Text k chinh xác");
        Thread.sleep(1000);

    }

    @Test
    public void testAlert3() throws InterruptedException {

        driver.get("");
        Thread.sleep(1000);
        driver.findElement(By.xpath("1 cai xpath co Yes và cancel va 1 cai sendkeys")).click();
        Thread.sleep(1000);
        System.out.println(driver.switchTo().alert().getText());
        Assert.assertEquals(driver.switchTo().alert().getText(), "Press enter your name", "data input Alert not match");
        Thread.sleep(1000);
        driver.switchTo().alert().sendKeys("SonVo");
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        WebElement textConfirm = driver.findElement(By.xpath("nhan vao nut confirm ne"));
        Assert.assertEquals(textConfirm.getText(), "You have entered SonVO", "Text k chinh xác");

    }
}

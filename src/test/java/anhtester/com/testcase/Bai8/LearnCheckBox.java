package anhtester.com.testcase.Bai8;

import anhtester.com.testcase.common.SetupBrowser;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LearnCheckBox extends SetupBrowser {
    public static void main(String[] args) throws InterruptedException {
        createDriver();
        driver.navigate().to("https://formstone.it/components/checkbox/");
        Thread.sleep(1000);
//        driver.findElement(By.xpath("(//div[@class='fs-checkbox-flag'])[2]")).click();
//        Thread.sleep(2000);
//        System.out.println(driver.findElement(By.id("checkbox-1")).isSelected());
//        Thread.sleep(2000);
//        driver.findElement(By.id("email")).sendKeys("nguyentrantuan1000@outlook.com");
//        Thread.sleep(1000);
//        driver.findElement(By.id("password")).sendKeys("Quocmykaka252!");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
//        Thread.sleep(2000);

        List<WebElement> listCheckBox = driver.findElements(By.xpath("(//div[@class='fs-cell fs-sm-half fs-md-half fs-lg-third'])[1]//div//div//div"));


        System.out.println(listCheckBox.size());

        for (int i = 0;i < listCheckBox.size() ; i++){
            listCheckBox.get(i).click();
        }
        Thread.sleep(1000);

        for (int i =0;i < listCheckBox.size(); i++){
            System.out.println(listCheckBox.get(i).isSelected());
            Thread.sleep(1000);
        }
        Thread.sleep(1000);

        for (int i = 0;i <listCheckBox.size();i++){
            Assert.isTrue(listCheckBox.get(i).isSelected(), "Vi Tri "+i+"bi sai");
            Thread.sleep(1000);
        }
        closeDrive();



    }
}

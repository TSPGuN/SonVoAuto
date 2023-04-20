package anhtester.com.testcase.Bai13;

import anhtester.com.testcase.common.SetupBrowser;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LearnIFrame extends SetupBrowser {
    @Test
    public void iFrame01() throws InterruptedException {

        driver.navigate().to("https://anhtester.com/contact");
        Thread.sleep(9000);
        System.out.println("iframe total: " + driver.findElements(By.tagName("iframe")).size());
        Thread.sleep(1000);
        //----Switch to content of Messenger--------
        driver.switchTo().frame(0);
        System.out.println(driver.findElement(By.tagName("strong")).getText());
        Thread.sleep(1000);
        //----Switch to icon of Messenger---------

        //1. Switch to lớp đầu không phải iframe
        driver.switchTo().parentFrame();
        Thread.sleep(1000);
        //2. Switch to iframe icon of Messenger
        driver.switchTo().frame(1); // chuyển hướng đến iframe hứ 2
        driver.findElement(By.tagName("svg")).click(); //Nhấn icon để ẩn messenger chat đi

        Thread.sleep(2000);
    }
}

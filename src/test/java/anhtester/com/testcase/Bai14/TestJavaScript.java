package anhtester.com.testcase.Bai14;

import anhtester.com.testcase.common.SetupBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestJavaScript extends SetupBrowser {


    JavascriptExecutor js; //khai báo
    @Test
    public void jsExecutorDemo01() throws InterruptedException {
        // Creating the JavascriptExecutor interface object


        driver.get("https://anhtester.com/");
        Thread.sleep(1000);

        js =(JavascriptExecutor) driver; // khởi tạo giá trị
        // Click on "Website Testing" module using JavascriptExecutor
        WebElement button = driver.findElement(By.xpath("//h3[normalize-space()='Website Testing']"));
        js.executeScript("arguments[0].click();", button);
        Thread.sleep(1000);

        // Get page title and Domain using JavascriptExecutor
        String titleText = js.executeScript("return document.title;").toString();
        System.out.println("Page Title is: " + titleText);

        String domainName = js.executeScript("return document.domain;").toString();
        System.out.println("Domain is: " + domainName);

        // Add Alert window using JavascriptExecutor
        js.executeScript("alert('Successfully Logged In');");

        Thread.sleep(2000);
    }
    @Test
    public void jsExecutorDemo02() throws InterruptedException {
        // Creating the JavascriptExecutor interface object


        driver.get("https://anhtester.com/");
        Thread.sleep(1000);

        js = (JavascriptExecutor) driver;

        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Tất Cả Khóa Học')]"));
        js.executeScript("arguments[0].scrollIntoView(true);", element); //Hàm cuộn tới phần tử, đổi true và false để cuộn dưới hay trên

        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        Thread.sleep(1000);
    }
}

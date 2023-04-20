package anhtester.com.testcase.Bai13;

import anhtester.com.testcase.common.SetupBrowser;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class LearnPopup extends SetupBrowser {
    @Test
    public void TestPopup01() throws InterruptedException {
        driver.get("https://demo.guru99.com/popup.php");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("emailid")).sendKeys("abc@gmail.com");
        driver.findElement(By.name("btnLogin")).click();

        Thread.sleep(2000);
    }

    @Test
    public void TestPopup02() throws InterruptedException {
        driver.get("https://demo.guru99.com/popup.php");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
        Thread.sleep(1000);
        //Switch to new tab
        //1. Luu lai mã định danh đầu tiên
        String mainWindow = driver.getWindowHandle();
        //2. Lay ra tat ca các tab hiện hành đang mở
        //Set cấu trúc collection là lưu ra giá trị k trùng lặp
        //Set là một Collection để lưu các phần tử giá trị KHÔNG trùng lặp.
        //Cách duyệt từng phần tử không trùng lặp trong Collection (Set) - Java Basic
        Set<String> windows = driver.getWindowHandles();
        //3.Duyệt SET trên với For để kiểm tra từng Tab
        for (String window : windows){
            System.out.println(window);
            if (!mainWindow.equals(window)){
                //So sánh nếu thằng nào khác thằng Chính (đầu tiên) thì chuyển hướng qua nó mới thao tác được
                //Switch to Child/new tab window
                driver.switchTo().window(window);
                Thread.sleep(1000);
                System.out.println(driver.switchTo().window(window).getTitle());
                if (driver.switchTo().window(window).getTitle().equals("SonVo")){
                    driver.findElement(By.name("emailid")).sendKeys("abc@gmail.com");
                    driver.findElement(By.name("btnLogin")).click();
                }
                System.out.println("Đã chuyển đến lớp Window con"+window);
            }
            driver.switchTo().window(mainWindow);
        }
        //Dung array lay theo list vi tri cua tab
//        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
//        System.out.println(tabs.get(0));
//        System.out.println(tabs.get(1)); //Lấy tab thứ 2 vì ArrayList bắt đầu là 0
//        driver.switchTo().window(tabs.get(1));
//        Thread.sleep(1000);
//        driver.findElement(By.name("emailid")).sendKeys("abc@gmail.com");
//        driver.findElement(By.name("btnLogin")).click();
//        driver.switchTo().window(mainWindow);

        Thread.sleep(2000);
    }
}

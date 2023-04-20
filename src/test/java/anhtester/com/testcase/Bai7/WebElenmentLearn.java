package anhtester.com.testcase.Bai7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.Set;

public class WebElenmentLearn {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chorme.driver","\"C:\\Users\\ad\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

        WebDriver driver = new WebDriver() {
            @Override
            public void get(String url) {

            }

            @Override
            public String getCurrentUrl() {
                return null;
            }

            @Override
            public String getTitle() {
                return null;
            }

            @Override
            public List<WebElement> findElements(By by) {
                return null;
            }

            @Override
            public WebElement findElement(By by) {
                return null;
            }

            @Override
            public String getPageSource() {
                return null;
            }

            @Override
            public void close() {

            }

            @Override
            public void quit() {

            }

            @Override
            public Set<String> getWindowHandles() {
                return null;
            }

            @Override
            public String getWindowHandle() {
                return null;
            }

            @Override
            public TargetLocator switchTo() {
                return null;
            }

            @Override
            public Navigation navigate() {
                return null;
            }

            @Override
            public Options manage() {
                return null;
            }
        };

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("https://app.hrsale.com/erp/login");
        Thread.sleep(1000);

        WebElement inputEmail = driver.findElement(By.id("iusername"));
        WebElement inputPass = driver.findElement(By.id("password"));
        WebElement buttonSignIn = driver.findElement(By.xpath("//button[@type='submit']"));

        Thread.sleep(1000);
        inputEmail.sendKeys("frances.burns");
        inputPass.sendKeys("frances.burns");
        buttonSignIn.click();
        buttonSignIn.isEnabled();

        System.out.println(buttonSignIn.isEnabled());

        buttonSignIn.isDisplayed();
        System.out.println(buttonSignIn.isDisplayed());
        Thread.sleep(2000);
        driver.close();
    }
}

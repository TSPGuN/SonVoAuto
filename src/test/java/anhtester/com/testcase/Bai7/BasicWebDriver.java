package anhtester.com.testcase.Bai7;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class BasicWebDriver {
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

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.get("https://anhtester.com");
        Thread.sleep(1000);
        driver.findElement(By.id("btn-login")).click();
        Thread.sleep(1000);
//        driver.navigate().back();
//        Thread.sleep(1000);
//        driver.navigate().forward();
//        Thread.sleep(1000);
//        driver.navigate().refresh();
//        Thread.sleep(1000);
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());
//
//
//        String html = driver.getPageSource();
//        System.out.println(driver.getPageSource());
//
//        System.out.println(html.contains("placeholder=\"Email\""));
//        Thread.sleep(1000);

        Cookie newCookie = new Cookie("number","123456");
        driver.manage().addCookie(newCookie);
        System.out.println(newCookie.getValue());
        System.out.println(driver.manage().getCookieNamed("number"));
        Thread.sleep(2000);
        driver.quit();
    }
}

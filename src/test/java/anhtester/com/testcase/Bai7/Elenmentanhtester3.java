package anhtester.com.testcase.Bai7;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.Set;

public class Elenmentanhtester3 {
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

        System.out.println(driver.manage().window().getSize());

        driver.get("https://anhtester.com");
        Thread.sleep(1000);

        String websiteModule = driver.findElement(By.xpath("(//h3[normalize-space()='Website Testing'])[1]")).getText();
        System.out.println(websiteModule);

        String websiteCssValue = driver.findElement(By.id("btn-signup")).getCssValue("font-size");
        System.out.println(websiteCssValue);
        Thread.sleep(1000);

        WebElement dimesionn = driver.findElement(By.id("btn-signup"));
        Dimension dimensions = dimesionn.getSize();
        System.out.println(dimensions);
        Thread.sleep(1000);

        WebElement pointt = driver.findElement(By.id("btn-signup"));
        Point point = pointt.getLocation();
        System.out.println(point);
        Thread.sleep(1000);

        driver.close();

    }
}

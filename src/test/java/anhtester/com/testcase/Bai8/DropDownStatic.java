package anhtester.com.testcase.Bai8;

import anhtester.com.testcase.common.SetupBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class DropDownStatic extends SetupBrowser {
    public static void main(String[] args) throws InterruptedException {
        createDriver();
        driver.get("");

        Select select = new Select(driver.findElement(By.id("")));
        select.selectByVisibleText("ghi 1 cai text ra");
        Thread.sleep(1000);
        Boolean check =  select.isMultiple();
        System.out.println(check);




        select.selectByValue("Friday");
        select.selectByVisibleText("Monday");

        System.out.println(select.getOptions().size()); // so luong option co trong the select

        System.out.println(select.getFirstSelectedOption().getText());
        Thread.sleep(1000);
    }

}

package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
        Thread.sleep(2000);

        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("majkskas");

        WebElement pass= driver.findElement(By.name("pass"));
        pass.sendKeys("123344");

       WebElement login= driver.findElement(By.name("login"));
       login.click();

       // WebElement createAccount= driver.findElement(By.linkText("Create new account"));
        //createAccount.click();
        //WebElement cA= driver.findElement(By.partialLinkText("new account"));
        //cA.click();

        //driver.quit();
    }
}

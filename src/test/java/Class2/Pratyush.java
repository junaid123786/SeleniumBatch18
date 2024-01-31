package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Pratyush {
    public static void main(String[] args) throws InterruptedException {


        //ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        //prefs.put("profile.managed_default_content_settings.javascript", 2);
        //options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //go to website
        driver.get("https://www.facebook.com/");
        //for cookies
        WebElement cookieBtn = driver.findElement(By.xpath("//button[text()='Allow all cookies' and @type='submit']"));
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", cookieBtn);

        WebElement create = driver.findElement(By.xpath("//a[@role='button' and text()='Create new account']"));
        create.click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Baily");
        driver.findElement(By.name("lastname")).sendKeys("Clifton");
        driver.findElement(By.name("reg_email__")).sendKeys("goodboy@gmail.com");
        driver.findElement(By.name("reg_email_confirmation")).sendKeys("goodboy@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("ADJeyu23!!");
        driver.findElement(By.id("day")).sendKeys("25");
        driver.findElement(By.id("month")).sendKeys("Dec");
        driver.findElement(By.id("year")).sendKeys("1975");
        driver.findElement(By.xpath("//[text()='Male']")).click();
        Thread.sleep(2000);
        //driver.quit();


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

    }
}


package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.co.uk/");

        String title= driver.getTitle();
        System.out.println(title);

        String url= driver.getCurrentUrl();
        System.out.println(url);




        Thread.sleep(3000);
        driver.quit();
    }
}

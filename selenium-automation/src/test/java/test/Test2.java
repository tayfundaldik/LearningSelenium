package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;


public class Test2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

//        WebElement tabButton = driver.findElement(By.xpath("//div/button[@id='tabButton']"));
//        tabButton.click();
//
//        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
//
//        System.out.println(tabs.size());
//
//        driver.switchTo().window(tabs.get(1));
//        System.out.println(driver.getCurrentUrl());
//        try{
//            Thread.sleep(2000);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//        driver.close();

//        WebElement windowsButton = driver.findElement(By.xpath("//div/button[@id='windowButton']"));
//        windowsButton.click();
//
//        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
//
//        System.out.println(tabs.size());
//
//        driver.switchTo().window(tabs.get(1));
//        System.out.println(driver.getCurrentUrl());
//        try{
//            Thread.sleep(2000);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//        driver.close();

        WebElement alert = driver.findElement(By.xpath("//div/button[@id='promtButton']"));
        alert.click();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.alertIsPresent());

        System.out.println(driver.switchTo().alert().getText());

        Alert alert1 = driver.switchTo().alert();

        alert1.sendKeys("hello");
        alert1.accept();

    }
}

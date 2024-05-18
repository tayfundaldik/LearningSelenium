package test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class SliderTest {

//    @Test
//    public void test4(){
//        WebDriver driver;
//        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
//        driver = new ChromeDriver();
//
//        driver.get("https://demoqa.com/slider");
//
//        WebElement slider = driver.findElement(By.cssSelector("input[type='range']"));
//
//        Actions actions = new Actions(driver);
//        actions.dragAndDropBy(slider,35, 0).perform();
//
//        WebElement sliderVal = driver.findElement(By.cssSelector(".range-slider__tooltip__label"));
//        String val = sliderVal.getText();
//        System.out.println(val);
//
//        WebElement sliderActualVal = driver.findElement(By.id("sliderValue"));
//        String val1 = sliderActualVal.getAttribute("value");
//        System.out.println(val1);
//
//        Assertions.assertEquals(val,val1, "!!!!!Values are not equal!!!!!");
//
//    }
    @Test
    public void test5(){
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://demoqa.com/progress-bar");

        WebElement startStop = driver.findElement(By.id("startStopButton"));
        startStop.click();
        WebElement progress = driver.findElement(By.cssSelector("div[role='progressbar']"));
        WebDriverWait wait  = new WebDriverWait(driver, 20);
        wait.pollingEvery(Duration.ofMillis(100));
        wait.until(ExpectedConditions.attributeToBe(By.id("resetButton"),"id", "resetButton"));
        //        wait.until(ExpectedConditions.attributeToBe(progress, "aria-valuenow","71"));
//        startStop.click();
    }
}

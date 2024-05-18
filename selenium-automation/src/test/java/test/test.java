package test;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class test {

    public static void main(String[] args) {
//        WebDriver driver;
//        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
//        driver = new ChromeDriver();
//
//        driver.get("https://demoqa.com/modal-dialogs");

//        driver.switchTo().frame("frame1");
//
//        WebElement heading = driver.findElement(By.id("sampleHeading"));
//        String text = heading.getText();
//        System.out.println(text);
//
//        driver.switchTo().parentFrame();
//
//        WebElement paragraph = driver.findElement(By.xpath("//div[@id='framesWrapper']/div"));
//        String text2 = paragraph.getText();
//        System.out.println(text2);
//    WebElement adFrame = driver.findElement(By.xpath("//div/iframe[@title='3rd party ad content']"));
//    driver.switchTo().frame(adFrame);
//    WebElement closeButton = driver.findElement(By.id("cbb"));
//    closeButton.click();

//        driver.switchTo().frame("frame1");
//        WebElement parent = driver.findElement(By.tagName("body"));
//        String text = parent.getText();
//        System.out.println(text);
//
//        driver.switchTo().frame(0);
//
//        WebElement child = driver.findElement(By.tagName("p"));
//        String text1 = child.getText();
//        System.out.println(text1);
//
//        driver.switchTo().parentFrame();
//        driver.switchTo().parentFrame();

//     WebElement modalS = driver.findElement(By.id("showSmallModal"));
//     modalS.click();
//
//
//     WebElement smallText = driver.findElement(By.xpath("//div[@class='modal-body']"));
//     String text = smallText.getText();
//     System.out.println(text);
//
//     WebElement closeButton = driver.findElement(By.xpath("//div/button[@class='close']"));
//     closeButton.click();

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://demoqa.com/date-picker");

//        WebElement firstCard = driver.findElement(By.xpath("//div[@class='card'][1]/div[2]"));
//        WebElement cardName1 = driver.findElement(By.id("section1Heading"));
//        String className = firstCard.getAttribute("class");
//        System.out.println(className);
//
//        cardName1.click();

//        WebElement input = driver.findElement(By.id("autoCompleteSingleInput"));
//        input.sendKeys("R");
//        List<WebElement> Suggestions = driver.findElements(By.cssSelector("div.auto-complete__option"));
//        for ( WebElement element: Suggestions) {
//
//            String suggestion =element.getText();
//            System.out.println(suggestion);
//
//            if (suggestion.equalsIgnoreCase("red")) {
//                element.click();
//                break;
//            }
//        }

        WebElement datePick = driver.findElement(By.id("datePickerMonthYearInput"));
        datePick.click();

        WebElement monthPick = driver.findElement(By.className("react-datepicker__month-select"));
        Select pick = new Select(monthPick);
        pick.selectByVisibleText("October");
        WebElement yearPick = driver.findElement(By.className("react-datepicker__year-select"));
        Select pick1 = new Select(yearPick);
        pick1.selectByVisibleText("2000");

        List<WebElement> Days = driver.findElements(By.cssSelector("div.react-datepicker__day"));

        for (WebElement element:Days) {
            String text = element.getText();

            System.out.println(text);

            if (text.equals("26")) {
                element.click();
                break;
            }
        }
    }

}

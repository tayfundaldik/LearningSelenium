package test;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;

public class Test1 {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://demoqa.com/radio-button");
//        driver.manage().window().maximize();

//        WebElement userName = driver.findElement(By.id("userName"));
//        userName.click();
//        userName.sendKeys("Flacko");
//
//        WebElement email = driver.findElement(new By.ByCssSelector(".mr-sm-2[id='userEmail']"));
//        email.click();
//        email.sendKeys("flackojordan@gmail.com");
//
//        WebElement address = driver.findElement(new By.ByCssSelector("textarea.form-control[placeholder='Current Address']"));
//        address.click();
//        address.sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
//
//
//        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
//        permanentAddress.click();
//        permanentAddress.sendKeys("Houston,Texas,US");
//
//        WebElement submitButton = driver.findElement(new By.ByCssSelector("button.btn"));
//        submitButton.click();
//
//        WebElement name1 = driver.findElement(By.xpath("//div/p[@id='name']"));
//        String nameGet = name1.getText();
//        System.out.println(nameGet);

//        String checkBox = "label[for='tree-node-home'] span.rct-checkbox svg";
//
//        WebElement CHECKBOX = driver.findElement(new By.ByCssSelector(checkBox));
//        CHECKBOX.click();
//
//        CHECKBOX = driver.findElement(new By.ByCssSelector(checkBox));
//        String CHECKBOXCLASSNAME = CHECKBOX.getAttribute("class");
//
//
//        if (CHECKBOXCLASSNAME.equals("rct-icon rct-icon-check")) {
//            System.out.println("Checkbox is checked!");
//        }
//        else{
//            System.out.println("Checkbox is not checked!");
//        }
//        WebElement hobbies = driver.findElement(By.id("hobbies-checkbox-1"));
//        WebElement hobbiesLabel = driver.findElement(new By.ByCssSelector("label[for='hobbies-checkbox-1']"));
//        boolean isHobbies = hobbies.isEnabled();
//        if(isHobbies) {
//            try {
//                hobbies.click();
//            } catch (ElementClickInterceptedException e) {
//                hobbiesLabel.click();
//                System.out.println("You are in catch block!!!");
//            }
//
//            boolean isSport = hobbies.isSelected();
//            System.out.println(isSport);
//        }
//        WebElement yesRDbutton = driver.findElement(new By.ByCssSelector("label[for='yesRadio']"));
//        boolean isYes = yesRDbutton.isEnabled();
//        if (isYes) {
//            yesRDbutton.click();
//            System.out.println("Clicked radio button!");
//        }
//        WebElement YesRDCircleButton = driver.findElement(By.id("yesRadio"));
//        boolean isYesSelected = YesRDCircleButton.isSelected();
//        if (isYesSelected) {
//            System.out.println("Yes button is selected.");
//        }
//
//        WebElement output = driver.findElement(new By.ByCssSelector("p.mt-3"));
//        System.out.println(output.getText());
//
//        WebElement noButton = driver.findElement(By.id("noRadio"));
//        System.out.println(noButton.isEnabled());

//        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://demoqa.com/dynamic-properties");
//        driver.manage().window().maximize();

//        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
//        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
//
//        Actions action = new Actions(driver);
//
//        action.doubleClick(doubleClickButton).perform();
//        action.contextClick(rightClickButton).perform();
//
//
//        WebElement output1 = driver.findElement(By.id("doubleClickMessage"));
//        WebElement output2 = driver.findElement(By.id("rightClickMessage"));
//
//        System.out.println(output1.getText());
//        System.out.println(output2.getText());

        //div/button[starts-with(text(), 'Click Me')]
        //div[last()]/button

//        WebElement clickMeDynamic = driver.findElement(By.xpath("//div/button[starts-with(text(), 'Click Me')]"));
//        clickMeDynamic.click();
//
//        WebElement message = driver.findElement(By.id("dynamicClickMessage"));
//        System.out.println(message.getText());
//
//        WebElement dinamicP = driver.findElement(By.xpath("//div/p"));
//        String text = dinamicP.getText();
//        System.out.println(text);
//
//        WebElement firstButton = driver.findElement(By.id("enableAfter"));
//        WebDriverWait wait = new WebDriverWait(driver , 5);
//
//        wait.until(ExpectedConditions.elementToBeClickable(firstButton));
//        firstButton.click();

//        WebElement colorChangeButton = driver.findElement(By.id("colorChange"));
//        String className = colorChangeButton.getAttribute("class");
//        System.out.println("Before : " + className);
//
//        WebDriverWait wait = new WebDriverWait(driver , 5);
//        wait.until(ExpectedConditions.attributeToBe(colorChangeButton, "class", "mt-4 text-danger btn btn-primary"));
//
//        String className1= colorChangeButton.getAttribute("class");
//        System.out.println("After : " + className1);
        //visibleAfter

//        WebDriverWait wait = new WebDriverWait(driver , 5);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
//        driver.findElement(By.id("visibleAfter")).click();

//        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://demoqa.com/broken");
//        driver.manage().window().maximize();

//        WebElement brokenImage = driver.findElement(By.xpath("//div/img[2]"));
//        String brokenImgURL = brokenImage.getAttribute("src");
//        try {
//            CloseableHttpClient client = HttpClientBuilder.create().build();
//
//            HttpGet request = new HttpGet(brokenImgURL);
//            CloseableHttpResponse response = client.execute(request);
//            int statusCode = response.getStatusLine().getStatusCode();
//            System.out.println(statusCode);
//
//
//        } catch (IOException e) {
//        e.printStackTrace();
//    }
//    try{
//        String path = "C:/Users/user/Downloads";
//        String sampleFile = "sampleFile.jpeg";
//        Thread.sleep(5000);
//        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://demoqa.com/upload-download");
//        driver.manage().window().maximize();
//
//    WebElement downloadButton = driver.findElement(By.id("downloadButton"));
//    downloadButton.click();
//    boolean isDownloaded = isFileDownloaded(path, sampleFile);
//        System.out.println(isDownloaded);
//    } catch (InterruptedException e) {
//        e.printStackTrace();
//    }

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/upload-download");
        driver.manage().window().maximize();

        WebElement uploadButton = driver.findElement(By.id("uploadFile"));
        uploadButton.sendKeys("C:/Users/user/Downloads/images.png");


    }

//    public static boolean isFileDownloaded(String path, String fileName){
//        File file = new File(path);
//        File[] files = file.listFiles();
//
//        for (int i = 0; i < files.length; i++) {
//            if (files[i].getName().equals(fileName)) {
//                return true;
//            }
//        }
//            return false;
//    }
}

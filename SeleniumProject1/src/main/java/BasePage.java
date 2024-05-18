import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    String BaseURL = "https://demoqa.com/";
    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement find(By locator){
        return driver.findElement(locator);
    }
    public void clickElement(By locator){
        find(locator).click();
    }
    public void type(By locator, String text){
        find(locator).sendKeys(text);
    }
    public boolean isRDButtonChecked(By locator){
        return find(locator).isSelected();
    }
}


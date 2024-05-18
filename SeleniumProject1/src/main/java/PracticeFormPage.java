import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage extends BasePage{


    private final By nameLocator = By.id("firstName");
    private final By lastNameLocator = By.id("lastName");
    private final By emailLocator = By.cssSelector("input[id='userEmail']");

    private GenderSection genderSection;


public PracticeFormPage(WebDriver driver){
        super(driver);
        driver.get(BaseURL.concat("automation-practice-form"));
        genderSection = new GenderSection(driver);
    }

    public GenderSection genderSection(){
        return this.genderSection;
    }

    public void setNameLocator(String name){
        clickElement(nameLocator);
        type(nameLocator, name);
    }
    public void setLastNameLocator(String lastName){
        clickElement(lastNameLocator);
        type(lastNameLocator, lastName);
    }
    public void setEmailLocator(String email){
       type(emailLocator,email);
    }

    public String getName() {
        return find(nameLocator).getAttribute("value");
    }
    public String getLastName() {
        return find(lastNameLocator).getAttribute("value");
    }
    public String getEmail() {
        return find(emailLocator).getAttribute("value");
    }


}

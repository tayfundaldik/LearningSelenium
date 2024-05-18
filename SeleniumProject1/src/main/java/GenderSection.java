import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenderSection extends BasePage{

    private final By maleButtonLocator = By.cssSelector("label[for='gender-radio-1']");
    private final By femaleButtonLocator = By.cssSelector("label[for='gender-radio-2']");
    private final By otherButtonLocator = By.cssSelector("label[for='gender-radio-3']");

    private final By maleCheckLocator = By.id("gender-radio-1");
    private final By femaleCheckLocator = By.id("gender-radio-2");
    private final By otherCheckLocator = By.id("gender-radio-3");

    public enum Genders{MALE, FEMALE, OTHER}

    public GenderSection(WebDriver driver) {
        super(driver);
    }

    public void clickButton(Genders gender){
        switch(gender){
            case MALE:
                clickElement(maleButtonLocator);
                break;
            case FEMALE:
                clickElement(femaleButtonLocator);
                break;
            case OTHER:
                clickElement(otherButtonLocator);
                break;
        }
    }

    public boolean isButtonChecked(Genders gender){
        boolean isChecked = false;
        switch (gender){
            case MALE :
                isChecked = isRDButtonChecked(maleCheckLocator);
                break;
            case FEMALE:
                isChecked = isRDButtonChecked(femaleCheckLocator);
                break;
            case OTHER:
                isChecked = isRDButtonChecked(otherCheckLocator);
                break;
        }

        return isChecked;
    }

}

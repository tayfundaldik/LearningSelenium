import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Gender_Selection extends BaseTest{
    @Test
    public void check_male_button(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.genderSection().clickButton(GenderSection.Genders.MALE);
        Assertions.assertTrue(practiceFormPage.genderSection().isButtonChecked(GenderSection.Genders.MALE), "Male Radio Button is not checked.");
    }
    @Test
    public void check_female_button(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.genderSection().clickButton(GenderSection.Genders.FEMALE);
        Assertions.assertTrue(practiceFormPage.genderSection().isButtonChecked(GenderSection.Genders.FEMALE), "Female Radio Button is not checked.");
    }
    @Test
    public void check_other_button(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.genderSection().clickButton(GenderSection.Genders.OTHER);
        Assertions.assertTrue(practiceFormPage.genderSection().isButtonChecked(GenderSection.Genders.OTHER), "Other Radio Button is not checked.");
    }
}

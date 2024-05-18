import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Name_LastName_Email extends BaseTest{


    @Test
    public void test_setName(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setNameLocator("Flacko");
        Assertions.assertEquals("Flacko", practiceFormPage.getName(), "Names does not match!");
    }
    @Test
    public void test_setLastName(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setLastNameLocator("Jordan");
        Assertions.assertEquals("Jordan", practiceFormPage.getLastName(), "Last names does not match!");
    }
    @Test
    public void test_Email(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setEmailLocator("flackojordan@gmail.com");
        Assertions.assertEquals("flackojordan@gmail.com", practiceFormPage.getEmail(), "E-mails does not match!");
    }

}

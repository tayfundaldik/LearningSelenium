import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class BaseTest {

    protected WebDriver driver;
    static String  browser = System.getProperty("browser");

    @BeforeAll
    public static void Setup(){
        if (browser.equals("edge")) {
            WebDriverManager.edgedriver().setup();
        } else if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
        }
        System.out.println("Test initiated.");
 }
    @BeforeEach
    public void beforeMethod(){
        if (browser.equals("edge")) {
            driver = new EdgeDriver();
        } else if (browser.equals("chrome")) {
            driver = new ChromeDriver();
        }
    }
    @AfterEach
    public void afterMethod(){
        driver.quit();
    }
//    @AfterAll
//    public void tearDown(){
//    driver.quit();
//        System.out.println("Test Finished!");
// }
}

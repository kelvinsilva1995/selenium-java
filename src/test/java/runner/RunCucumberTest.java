package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {},
        features = "src/test/resources/features",
        tags = "@desconto",
        glue = {"steps"}
)
public class RunCucumberTest {
    public static WebDriver driver ;

    @BeforeClass
    public static void stat(){
        driver = new ChromeDriver();
        System.out.println("Iniciou os Testes");
    }

    @AfterClass
    public static void stop(){
        System.out.println("Finalizou os Testes");
        driver.quit();
    }
}
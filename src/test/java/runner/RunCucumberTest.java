package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumberReport.json", "html:target/cucumber/report.html"},
        features = "src/test/resources/features",
        tags = "@cadastro-sucesso",
        glue = {"steps"}
)
public class RunCucumberTest extends RunBase{
    public static  WebDriverWait wait ;

    @BeforeClass
    public static void start(){
//
        wait = new WebDriverWait(driver, Duration.ofSeconds(05));
//        System.out.println("Iniciou os Testes");
    }

    @AfterClass
    public static void stop(){
        System.out.println("Finalizou os Testes");
        driver.quit();
    }
}
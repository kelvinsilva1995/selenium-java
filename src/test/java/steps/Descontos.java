package steps;



import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

import java.time.Duration;

public class Descontos extends RunCucumberTest {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(02));

    @Dado("^que estou no site do qazando$")
    public void que_estou_no_site_do_qazando() {
        driver.get("https://www.qazando.com.br/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#liteboxFormat3Circle")));
        Assert.assertEquals("Não acessou a aplicação",true, driver.findElement(By.id("btn-ver-cursos")).isDisplayed());
    }

    @Quando("^eu preencho meu e-mail$")
    public void eu_preencho_meu_e_mail() throws InterruptedException {
        ///Scroll tela em javascript
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("window.scrollTo(0,10000)");
//        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input#poptinDesignInputTextFieldName")).sendKeys("kelvin.silva");
        driver.findElement(By.cssSelector("input#poptinDesignInputTextFieldEmail")).sendKeys("kelvin.silva13@hotmail.com");
    }

    @Quando("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom() {
        driver.findElement(By.cssSelector("input#poptinFormSubmitButton")).click();

    }

    @Então("^eu vejo o codigo de desconto$")
    public void eu_vejo_o_codigo_de_desconto() {

        String texto_cupom = driver.findElement(By.cssSelector("#poptinThankYouScreen > div.froala-editor-coupon.fr-box.fr-inline > p > strong > span")).getText();
//        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > spam")).getText();
        System.out.println(texto_cupom);
        Assert.assertEquals("O Cupom esta errado", "QAZANDO15OFF", texto_cupom);
    }
}
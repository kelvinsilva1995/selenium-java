package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.Utils;

public class HomePage extends Utils {
    WebDriver driver;
    WebDriverWait wait;
    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver =driver;
        this.wait=wait;
    }

    public void acessarAplicacao(){
        driver.get("https://www.qazando.com.br/");
//        esperarElementoEstarPresente(By.cssSelector("div#liteboxFormat3Circle"), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#liteboxFormat3Circle")));;
        Assert.assertEquals("Não acessou a aplicação",true, driver.findElement(By.id("btn-ver-cursos")).isDisplayed());
    }

    public void scrollDown() throws InterruptedException {
        ///Scroll tela em javascript
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0,10000)");
        Thread.sleep(2000);
    }

    ///Scroll tela em javascript
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("window.scrollTo(0,10000)");
//        Thread.sleep(2000
    public void preencherEmail(){
            driver.findElement(By.cssSelector("input#poptinDesignInputTextFieldName")).sendKeys("kelvin.silva");
            driver.findElement(By.cssSelector("input#poptinDesignInputTextFieldEmail")).sendKeys("kelvin.silva13@hotmail.com");
        }

        public void clickGanharDesconto(){
            driver.findElement(By.cssSelector("input#poptinFormSubmitButton")).click();
    }

    public void verificarCumpomDesconto(){
        String texto_cupom = driver.findElement(By.cssSelector("#poptinThankYouScreen > div.froala-editor-coupon.fr-box.fr-inline > p > strong > span")).getText();
//        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > spam")).getText();
        System.out.println(texto_cupom);
        Assert.assertEquals("O Cupom esta errado", "QAZANDO15OFF", texto_cupom);
    }
}

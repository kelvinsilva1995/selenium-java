package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import runner.RunCucumberTest;

public class HomePage extends RunCucumberTest {

    public void acessarAplicacao(){
        getDriver().get("https://www.qazando.com.br/");
//        esperarElementoEstarPresente(By.cssSelector("div#liteboxFormat3Circle"), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#liteboxFormat3Circle")));;
        Assert.assertEquals("Não acessou a aplicação",true, getDriver().findElement(By.id("btn-ver-cursos")).isDisplayed());
    }

    public void scrollDown() throws InterruptedException {
        ///Scroll tela em javascript
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollTo(0,10000)");
        Thread.sleep(2000);
    }

    ///Scroll tela em javascript
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("window.scrollTo(0,10000)");
//        Thread.sleep(2000
    public void preencherEmail(){
        getDriver().findElement(By.cssSelector("input#poptinDesignInputTextFieldName")).sendKeys("kelvin.silva");
        getDriver().findElement(By.cssSelector("input#poptinDesignInputTextFieldEmail")).sendKeys("kelvin.silva13@hotmail.com");
        }

        public void clickGanharDesconto(){
            getDriver().findElement(By.cssSelector("input#poptinFormSubmitButton")).click();
    }

    public void verificarCumpomDesconto(){
        String texto_cupom = getDriver().findElement(By.cssSelector("#poptinThankYouScreen > div.froala-editor-coupon.fr-box.fr-inline > p > strong > span")).getText();
//        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > spam")).getText();
        System.out.println(texto_cupom);
        Assert.assertEquals("O Cupom esta errado", "QAZANDO15OFF", texto_cupom);
    }
}

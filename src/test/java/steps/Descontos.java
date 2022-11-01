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
import pages.HomePage;
import runner.RunCucumberTest;

import java.time.Duration;

public class Descontos extends RunCucumberTest {

   HomePage homePage = new HomePage(driver,wait);

    @Dado("^que estou no site do qazando$")
    public void que_estou_no_site_do_qazando() {
        homePage.acessarAplicacao();
    }

    @Quando("^eu preencho meu e-mail$")
    public void eu_preencho_meu_e_mail() throws InterruptedException {
//        homePage.scrollDown();
        homePage.preencherEmail();
    }

    @Quando("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom() {
         homePage.clickGanharDesconto();

    }

    @Então("^eu vejo o codigo de desconto$")
    public void eu_vejo_o_codigo_de_desconto() {
        homePage.verificarCumpomDesconto();
    }
}
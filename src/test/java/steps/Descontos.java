package steps;



import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.HomePage;
import runner.RunCucumberTest;


public class Descontos extends RunCucumberTest {

   HomePage homePage = new HomePage();

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
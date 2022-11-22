package steps;

import io.cucumber.java.pt.Dado;
import pages.LoginPage;
import runner.RunBase;
import runner.RunCucumberTest;

public class Login extends RunCucumberTest {
    LoginPage loginPage = new LoginPage();
    @Dado("que estou na tela de login")
    public void que_estou_na_tela_de_login() {
        getDriver(RunBase.Browser.CHROME);
       loginPage.acessarTelaLogin();
    }
}

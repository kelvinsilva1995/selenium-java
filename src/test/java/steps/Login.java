package steps;

import io.cucumber.java.pt.Dado;
import pages.LoginPage;
import runner.RunCucumberTest;

public class Login extends RunCucumberTest {
    LoginPage loginPage = new LoginPage(driver);
    @Dado("que estou na tela de login")
    public void que_estou_na_tela_de_login() {
       loginPage.acessarTelaLogin();
    }
}

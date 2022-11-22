package pages;


import runner.RunCucumberTest;

public class LoginPage extends RunCucumberTest {


    public void acessarTelaLogin(){
        getDriver().get("http://automationpratice.com.br");
    }

}

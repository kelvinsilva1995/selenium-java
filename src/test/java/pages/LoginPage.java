package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.Utils;

public class LoginPage extends Utils {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarTelaLogin(){
        driver.get("http://automationpratice.com.br");
    }
}

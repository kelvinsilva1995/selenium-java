package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.Utils;

public class CadastroPage extends Utils {
    WebDriver driver;
    private By create_name_field = By.cssSelector("input#user");
    private By create_email_field = By.cssSelector("input#email");
    private By create_password_field = By.cssSelector("input#password");
//    private By button_register = By.xpath("//font[contains(text(),'Cadastro')]");
     private By home_button_register = By.cssSelector("section#top_header div.top_header_right  ul.right_list_fix a[href=\"/register\"]");

     private By button_register = By.cssSelector("button#btnRegister");

//    a[href="/register"]
    public CadastroPage(WebDriver driver) {
        this.driver = driver;
    }
    public void acessarCadastroUsuario(){
        wait.until(ExpectedConditions.elementToBeClickable(home_button_register));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(button_register));

        driver.findElement(home_button_register).click();
        wait.until(ExpectedConditions.elementToBeClickable(create_name_field));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(create_emaiil_field));
    }
   public void preenchoFormularioCaadastro(){
        driver.findElement(create_name_field).sendKeys("tetese");
        driver.findElement(create_email_field).sendKeys(getRandomEmail());
        driver.findElement(create_password_field).sendKeys("tetese");
        wait.until(ExpectedConditions.elementToBeClickable(button_register));
   }
   public  void clicarEmCadastrar(){
       driver.findElement(button_register).click();
   }

   public void validaMensagemCadastroSucesso(){
       String mensagem_cadastro_sucesso = driver.findElement(By.cssSelector("#swal2-title")).getText();
//        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > spam")).getText();
       System.out.println(mensagem_cadastro_sucesso);
       Assert.assertEquals("Erro no cadastro", "Cadastro realizado!", mensagem_cadastro_sucesso);
   }
}

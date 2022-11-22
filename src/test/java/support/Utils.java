package support;
import runner.RunCucumberTest;
import java.util.Random;


public class Utils extends RunCucumberTest {
//    public void esperarElementoEstarPresente(By element, int tempo){
//        WebDriverWait wait = new WebDriverWait(getDriver(), tempo);
//        wait.until(ExpectedConditions.elementToBeClickable(element));
//    }
      public static String getRandomEmail(){
          String email_int = "kelvin_";
          String email_final = "@gmail.com";

          Random random = new Random();

          int minimo = 1;
          int maximo = 999999999;
          int resultado = random.nextInt(maximo-minimo) + minimo;

          return  email_int + resultado + email_final;

      }
}
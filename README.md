#Selenium Java Web test 


Executar testes com relatorio

mvn test -Dtest=**/*RunCucumberTest cluecumber-report:reporting

Executar testes com relatorio e tag

mvn test -Dtest=**/*RunCucumberTest cluecumber-report:reporting -Dcucumber.options="--tags @teste-falha"


//////

uploads de arquivo


public void uploadFile(String CaminhdoArquivo){
 driver.findElement(elemento).sendKeys(CaminhdoArquivo)
}

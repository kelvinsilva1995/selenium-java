package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.CadastroPage;
import runner.RunCucumberTest;

public class Cadastro extends RunCucumberTest {

    CadastroPage cadastroPage = new CadastroPage();
    @Dado("acesso o cadastro de usuario")
    public void acesso_o_cadastro_de_usuario() {
       cadastroPage.acessarCadastroUsuario();
    }
    @Quando("eu preencho o formulario de cadastro")
    public void eu_preencho_o_formulario_de_cadastro() {
        cadastroPage.preenchoFormularioCaadastro();
    }
    @Quando("clico em registrar")
    public void clico_em_registrar() {
        cadastroPage.clicarEmCadastrar();
    }
    @Entao("vejo a mensagem de cadasto realizado com sucesso")
    public void vejo_a_mensagem_de_cadasto_realizado_com_sucesso() {
       cadastroPage.validaMensagemCadastroSucesso();
    }


}

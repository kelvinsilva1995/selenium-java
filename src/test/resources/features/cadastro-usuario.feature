# language: pt
  @cadastro
  Funcionalidade: Cadastro de usuario

    @cadastro-sucesso
    Cenario: Registrar novo usuario com sucesso
      Dado que estou na tela de login
      E acesso o cadastro de usuario
      Quando eu preencho o formulario de cadastro
      E clico em registrar
      Entao vejo a mensagem de cadasto realizado com sucesso
# language: pt
  @desconto
  Funcionalidade: Receber o cupom desconto da qazando
    Eu como usuario da qazando
    quero receber um cupom de desconto
    para comprar um curso com valor reduzido

   @gerar-cupom
  Cenario: Visualizar codigo de desconto
    Dado que estou no site do qazando
    Quando eu preencho meu e-mail
    E clico em ganhar cupom
    Então eu vejo o codigo de desconto
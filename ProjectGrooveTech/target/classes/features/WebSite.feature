Feature: Fazer um cadastro no site e validar que foi realizado com sucesso

Scenario: Realizar um casatro e validar
Given estar na pagina principal do site
And clicar em Signin
And informar o email
And clicar no botao create an account
And informar o genero
And preencher o campo First Name
And preencher o campo Last Name
And informar a senha
And informar data de nascimento
And interagir com os checkbox
And prenncher o campo Company
And preencher o campo Address
And preencher o campo second address
And preencher o campo city
And selecionar o estado
And preencher o campo Postal Code
And preencher o campo Additional Information
And preencher o campo Home phone
And preencher o campo Mobile phone
And preecher o campo Assign alias for future reference
And clicar no botao register
Then verificar se o cadastro foi efetuado com sucesso

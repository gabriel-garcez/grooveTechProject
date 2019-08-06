package tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import support.NameGenerator;
import support.Screenshot;
import support.WebDriverManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.person.Person;
import pages.AuthenticationPage;
import pages.CreateAccountPage;
import pages.HomePage;


public class stepDefinitions {
	private WebDriver driver;
	Fairy fairy = Fairy.create();
	Person person = fairy.person();

	@Given("^estar na pagina principal do site$")
	public void estar_na_pagina_principal_do_site() throws Throwable {
		driver = WebDriverManager.openBrowser();
	}
	
	@Given("^clicar em Signin$")
	public void clicar_em_Signin() throws Throwable {
		new HomePage(driver).clickSignIn();
	}

	@Given("^informar o email$")
	public void informar_o_email() throws Throwable {
		new AuthenticationPage(driver).typeEmail(person.getEmail());
	}

	@Given("^clicar no botao create an account$")
	public void clicar_no_bot_o_create_an_account() throws Throwable {
		new AuthenticationPage(driver).clickButton();
	}

	@Given("^informar o genero$")
	public void informar_o_genero() throws Throwable {
	new CreateAccountPage(driver).selectGender(); 
	}

	@Given("^preencher o campo First Name$")
	public void preencher_o_campo_First_Name() throws Throwable {
		new CreateAccountPage(driver).typeCustomerFirstName(person.getFirstName());
	}

	@Given("^preencher o campo Last Name$")
	public void preencher_o_campo_Last_Name() throws Throwable {
		new CreateAccountPage(driver).typeCustomerLastName(person.getLastName());
	}

	@Given("^informar a senha$")
	public void informar_a_senha() throws Throwable {
		new CreateAccountPage(driver).typeCustomerPassword(person.getPassword());
	}

	@Given("^informar data de nascimento$")
	public void informar_data_de_nascimento() throws Throwable {
		new CreateAccountPage(driver).selectDateBirth();
	}
	
	@Given("^interagir com os checkbox$")
	public void interagir_com_os_checkbox() throws Throwable {
		new CreateAccountPage(driver).selectCheckbox(); 
	}
	
	@Given("^prenncher o campo Company$")
	public void prenncher_o_campo_Company() throws Throwable {
		new CreateAccountPage(driver).typeCompany(person.getFirstName());
	}

	@Given("^preencher o campo Address$")
	public void preencher_o_campo_Address() throws Throwable {
		new CreateAccountPage(driver).typeAddress(person.getFullName());
	}

	@Given("^preencher o campo second address$")
	public void preencher_o_campo_second_address() throws Throwable {
		new CreateAccountPage(driver).typeAddress2(person.getFullName());
	}
	
	@Given("^preencher o campo city$")
	public void preencher_o_campo_city() throws Throwable {
		new CreateAccountPage(driver).typeCity(person.getFirstName());
	}
	
	@Given("^selecionar o estado$")
	public void selecionar_o_estado() throws Throwable {
		new CreateAccountPage(driver).SelectState();
	}

	@Given("^preencher o campo Postal Code$")
	public void preencher_o_campo_Postal_Code() throws Throwable {
		new CreateAccountPage(driver).typePostCode();
	}

	@Given("^preencher o campo Additional Information$")
	public void preencher_o_campo_Additional_Information() throws Throwable {
		new CreateAccountPage(driver).typeAdditionalInformation(person.getFullName());
	}

	@Given("^preencher o campo Home phone$")
	public void preencher_o_campo_Home_phone() throws Throwable {
		new CreateAccountPage(driver).typePhone(person.getTelephoneNumber());
	}

	@Given("^preencher o campo Mobile phone$")
	public void preencher_o_campo_Mobile_phone() throws Throwable {
		new CreateAccountPage(driver).typePhoneMobile(person.getTelephoneNumber());
	}

	@Given("^preecher o campo Assign alias for future reference$")
	public void preecher_o_campo_Assign_alias_for_future_reference() throws Throwable {
		new CreateAccountPage(driver).typeReferenceAddress(person.getFirstName());
	}

	@Given("^clicar no botao register$")
	public void clicar_no_botao_register() throws Throwable {
		new CreateAccountPage(driver).clickSubmit();
	}

	@Then("^verificar se o cadastro foi efetuado com sucesso$")
	public void verificar_se_o_cadastro_foi_efetuado_com_sucesso() throws Throwable {
		String m = new CreateAccountPage(driver).captureText();
		assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.", m);
		Screenshot.take(driver, "src\\main\\resources\\prints\\" +NameGenerator.GerarNome()+".png");
		driver.close();
		System.out.println("tudo certo");
	}
	

	
}

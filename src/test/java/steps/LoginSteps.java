package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import utils.BaseTest;

public class LoginSteps {
    private LoginPage loginPage = new LoginPage();

    @Given("que estou na página de login")
    public void acessarPaginaDeLogin() {
        BaseTest.iniciarDriver(); // Certifique-se de que o WebDriver está inicializado
        loginPage.acessarPagina();
    }

    @When("insiro usuário {string} e senha {string}")
    public void inserirCredenciais(String usuario, String senha) {
        loginPage.inserirCredenciais(usuario, senha);
    }

    @When("clico no botão de login")
    public void clicarNoBotaoDeLogin() {
        loginPage.clicarNoBotaoDeLogin();
    }

    @Then("sou redirecionado para a página de produtos")
    public void validarPaginaDeProdutos() {
        // Aqui você pode adicionar validações para garantir que a página de produtos carregou corretamente
    }

    @Given("que estou logado no sistema")
    public void queEstouLogadoNoSistema() {
        BaseTest.iniciarDriver();
        loginPage.acessarPagina();
        loginPage.inserirCredenciais("standard_user", "secret_sauce");
        loginPage.clicarNoBotaoDeLogin();
    }

    @When("clico no menu lateral")
    public void clicoNoMenuLateral() {
        loginPage.clicarNoMenuLateral();
    }

    @When("clico no botão de logout")
    public void clicoNoBotaoDeLogout() {
        loginPage.clicarNoBotaoLogout();
    }

    @Then("sou redirecionado para a página de login")
    public void souRedirecionadoParaPaginaDeLogin() {
        Assert.assertTrue("Usuário não foi deslogado corretamente!", loginPage.estaNaPaginaDeLogin());
    }

}

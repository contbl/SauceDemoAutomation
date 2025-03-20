package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.CarrinhoPage;
import pages.CheckoutPage;
import pages.ProdutoPage;
import utils.BaseTest;

public class CompraSteps extends BaseTest {
    ProdutoPage produtoPage = new ProdutoPage(driver);
    CarrinhoPage carrinhoPage = new CarrinhoPage(driver);
    CheckoutPage checkoutPage = new CheckoutPage(driver);

    @And("adiciono o produto {string} ao carrinho")
    public void adicionoProdutoAoCarrinho(String nomeProduto) {
        produtoPage.adicionarProdutoAoCarrinho(nomeProduto);
    }

    @And("acesso o carrinho de compras")
    public void acessoCarrinhoDeCompras() {
        carrinhoPage.acessarCarrinho();
    }

    @And("confirmo a compra")
    public void confirmoCompra() {
        carrinhoPage.confirmarCompra();
    }

    @And("preencho os dados de envio com nome {string}, sobrenome {string} e CEP {string}")
    public void preenchoDadosEnvio(String nome, String sobrenome, String cep) {
        checkoutPage.preencherDadosEnvio(nome, sobrenome, cep);
    }

    @And("finalizo a compra")
    public void finalizoCompra() {
        checkoutPage.finalizarCompra();
    }

    @Then("vejo a mensagem de confirmação {string}")
    public void vejoMensagemDeConfirmacao(String mensagemEsperada) {
        Assert.assertEquals(mensagemEsperada, checkoutPage.obterMensagemConfirmacao());
    }
}

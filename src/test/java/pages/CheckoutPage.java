package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherDadosEnvio(String nome, String sobrenome, String cep) {
        driver.findElement(By.id("first-name")).sendKeys(nome);
        driver.findElement(By.id("last-name")).sendKeys(sobrenome);
        driver.findElement(By.id("postal-code")).sendKeys(cep);
        driver.findElement(By.id("continue")).click();
    }

    public void finalizarCompra() {
        driver.findElement(By.id("finish")).click();
    }

    public String obterMensagemConfirmacao() {
        return driver.findElement(By.className("complete-header")).getText();
    }
}

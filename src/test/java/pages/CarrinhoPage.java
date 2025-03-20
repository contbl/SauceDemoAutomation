package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarrinhoPage {
    private WebDriver driver;

    public CarrinhoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarCarrinho() {
        driver.findElement(By.id("shopping_cart_container")).click();
    }

    public void confirmarCompra() {
        driver.findElement(By.id("checkout")).click();
    }
}

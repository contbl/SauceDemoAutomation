package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseTest;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = BaseTest.getDriver(); // Obtém o driver da BaseTest
    }

    public void acessarPagina() {
        driver.get("https://www.saucedemo.com/");
    }

    public void inserirCredenciais(String usuario, String senha) {
        driver.findElement(By.id("user-name")).sendKeys(usuario);
        driver.findElement(By.id("password")).sendKeys(senha);
    }

    public void clicarNoBotaoDeLogin() {
        driver.findElement(By.id("login-button")).click();
    }

    public void clicarNoMenuLateral() {
        driver.findElement(By.id("react-burger-menu-btn")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logout_sidebar_link"))); // Aguarda o menu abrir
    }

    public void clicarNoBotaoLogout() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // Aguarda o botão ficar visível e clicável antes de clicar
        WebElement botaoLogout = wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));
        botaoLogout.click();
    }

    public boolean estaNaPaginaDeLogin() {
        return driver.findElement(By.id("login-button")).isDisplayed();
    }

}

package runners;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utils.BaseTest;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        plugin = {"pretty", "json:target/cucumber-report.json"}
)
public class TestRunner {

    @BeforeClass
    public static void setUp() {
        BaseTest.iniciarDriver(); // Inicializa o WebDriver antes dos testes
    }

    @AfterClass
    public static void tearDown() {
        BaseTest.fecharDriver(); // Fecha o WebDriver após os testes
    }
}

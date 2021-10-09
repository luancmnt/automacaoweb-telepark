package login;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Testes Web de Login")
public class LoginTest {
    @Test
    @DisplayName("Login com sucesso")
    public void testLoginSucesso() {
    // Abrir o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

    // Vou maximizar a tela
        navegador.manage().window().maximize();

    // Navegar para a pagina do Telepark
        navegador.get("https://app.telpark.com/es/login?0");

    // Fazer login
        navegador.findElement(By.id("inputEmail")).click();
        navegador.findElement(By.id("inputEmail")).sendKeys("luancmnt@gmail.com");
        navegador.findElement(By.id("inputPassword")).click();
        navegador.findElement(By.id("inputPassword")).sendKeys("123456");

    // Validar se login foi realizado com sucesso
        navegador.findElement(By.cssSelector("input[type='submit']")).click();

    // Sair da página
        navegador.findElement(By.id("aLogout")).click();
    }
    @Test
    @DisplayName("Login com falha")
    public void testLoginFalha() {
    // Abrir o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

    // Vou maximizar a tela
        navegador.manage().window().maximize();

    // Navegar para a pagina do Telepark
        navegador.get("https://app.telpark.com/es/login?0");

    // Fazer login
        navegador.findElement(By.id("inputEmail")).click();
        navegador.findElement(By.id("inputEmail")).sendKeys("luancmnt@gmail.com");
        navegador.findElement(By.id("inputPassword")).click();
        navegador.findElement(By.id("inputPassword")).sendKeys("123456789");

    // Validar se mensagem de erro é exibida com sucesso
        navegador.findElement(By.cssSelector("input[type='submit']")).click();

    }
}

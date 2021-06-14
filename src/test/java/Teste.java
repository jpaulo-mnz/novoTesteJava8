import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teste {

    @Test
    public void testeComJunit(){

        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com.br/");

        driver.findElement(By.name("q")).sendKeys("notebook");

        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

        String resultadoEsperado = "notebook - Pesquisa Google";

        Assert.assertEquals(resultadoEsperado, driver.getTitle());
    }
}

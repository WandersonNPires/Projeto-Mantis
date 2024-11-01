import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utils {

//		Acessando a plataforma Mantis e inserindo credenciais 
	public  static void facaLogin(WebDriver driver) {
		driver.get("https://mantis-prova.base2.com.br/login_page.php");
		WebElement usuario = driver.findElement(By.id("username"));
		usuario.sendKeys("");
		WebElement entrarUsuario = driver.findElement(By.xpath("//input[@value = 'Entrar']"));
		entrarUsuario.click();
		WebElement senha	= driver.findElement(By.id("password"));
		senha.sendKeys("");
		WebElement entrarSenha = driver.findElement(By.xpath("//input[@value = 'Entrar']"));
		entrarSenha.click();
		
	}

	
}

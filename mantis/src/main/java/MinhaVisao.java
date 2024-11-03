import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MinhaVisao {

	@Test
	public void visaoLinhadoTempo() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		Utils.facaLogin(driver);
		
	
		driver.get("https://mantis-prova.base2.com.br/my_view_page.php");
		Thread.sleep(5000);
		
// Alterando a linha do tempo para "Anterior" e Proximo" 
		WebElement anterior = driver.findElement(By.xpath("//a[@href=\"my_view_page.php?days=7\"]"));
		anterior.click();
		Thread.sleep(10000);
		WebElement proximo = driver.findElement(By.xpath("//a[@href=\"my_view_page.php?days=0\"]"));
		proximo.click();
		
		//TODO Subindo e descendo tabela 
		//WebElement camuflando = driver.findElement(By.xpath("//i[@class=\"1 ace-icon fa bigger-125 fa-chevron-up\"]"));
		//camuflando.click();

	
	

		
		
}
}

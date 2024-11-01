import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CriarTarefaTeste {

	@Test
	public void criarTarefaApenasComCamposObrigatorios() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		Utils.facaLogin(driver);

		driver.get("https://mantis-prova.base2.com.br/bug_report_page.php");
		
//		 selecionando os Campos Obrigatorios  
		Select categoria = new Select(driver.findElement(By.id("category_id")));
		WebElement resumo = driver.findElement(By.id("summary"));
		WebElement descricao = driver.findElement(By.id("description"));
		WebElement botaoCriarTarefa = driver.findElement(By.xpath("//input[@value = 'Criar Nova Tarefa']"));
		
// 		Atribundo valores para os campos
		
		categoria.selectByValue("2");
		resumo.sendKeys("Criar Nova Tarefa");
		descricao.sendKeys("Criação de uma nova tarefa ");
		botaoCriarTarefa.click();
		Thread.sleep(5000);
		
// Toda vez que realiza a criação de uma tarefa o "ID" da pagina altera, após abrir a visualização da tarefa criada		
		String urlEsperada ="https://mantis-prova.base2.com.br/view.php";
		String atualUrl =	driver.getCurrentUrl();
		System.out.println(atualUrl);
		Assert.assertTrue(atualUrl.startsWith(urlEsperada));
		driver.quit();
	}

}

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CriarTarefaTeste {

	@Test
	public void criarTarefaApenasCamposObrigatorios() throws InterruptedException {
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
	
	
	
	@Test
	public void criarTarefaTodosCampos() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		Utils.facaLogin(driver);

		driver.get("https://mantis-prova.base2.com.br/bug_report_page.php");
		
		Select categoria = new Select(driver.findElement(By.id("category_id")));
		Select frequencia = new Select(driver.findElement(By.id("reproducibility")));
		Select gravidade = new Select(driver.findElement(By.id("severity")));
		Select prioridade = new Select(driver.findElement(By.id("priority")));
		WebElement plataforma = driver.findElement(By.id("platform"));
		WebElement so = driver.findElement(By.id("os"));
		WebElement versaoSo = driver.findElement(By.id("os_build"));
		WebElement resumo = driver.findElement(By.id("summary"));
		WebElement descricao = driver.findElement(By.id("description"));
		WebElement passosParaReproduir = driver.findElement(By.id("steps_to_reproduce"));
		WebElement aplicarMarcadores = driver.findElement(By.id("tag_string"));
		Select 		marcadoresAtuais = new Select(driver.findElement(By.id("tag_select")));
		WebElement botaoCriarTarefa = driver.findElement(By.xpath("//input[@value = 'Criar Nova Tarefa']"));
		//TODO Enviar Anexo
		
		
		categoria.selectByValue("2");
		frequencia.selectByValue("50");
		gravidade.selectByValue("60");
		prioridade.selectByValue("40");
		plataforma.sendKeys("PC");
		so.sendKeys("Windowns");
		versaoSo.sendKeys("Profissinal");
		resumo.sendKeys("Criar Nova Tarefa");
		descricao.sendKeys("Criação de uma nova tarefa ");
		passosParaReproduir.sendKeys("Otimizando tarefas");
		aplicarMarcadores.sendKeys(";");
		marcadoresAtuais.selectByValue("2");
		
		botaoCriarTarefa.click();
		Thread.sleep(5000);
		
		String urlEsperada ="https://mantis-prova.base2.com.br/view.php";
		String atualUrl =	driver.getCurrentUrl();
		System.out.println(atualUrl);
		Assert.assertTrue(atualUrl.startsWith(urlEsperada));
		driver.quit();
	}
	

}

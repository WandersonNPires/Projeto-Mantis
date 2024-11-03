import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class VerTarefas {

	@Test
	public void imprimirTarefasCSV() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		Utils.facaLogin(driver);
		
		

		driver.get("https://mantis-prova.base2.com.br/view_all_bug_page.php?refresh=true");
		Thread.sleep(5000);
		WebElement imprimirTarefas = driver.findElement(By.xpath("//a[@href=\"csv_export.php\"]"));
		imprimirTarefas.click();
		
	
	}
	

	@Test
	public void imprimirTarefasExcel() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		Utils.facaLogin(driver);
		driver.get("https://mantis-prova.base2.com.br/view_all_bug_page.php?refresh=true");
		WebElement imprimirTarefas = driver.findElement(By.xpath("//a[@href=\"excel_xml_export.php\"]"));
		imprimirTarefas.click();
		
		
		
	}
	
	
	@Test
	public void imprimirTarefasWorld2000() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		Utils.facaLogin(driver);
		driver.get("https://mantis-prova.base2.com.br/view_all_bug_page.php?refresh=true");
		WebElement imprimirTarefas = driver.findElement(By.xpath("//a[@href=\"print_all_bug_page.php\"]"));
		imprimirTarefas.click();
		WebElement imprimirWorld = driver.findElement(By.xpath("//a[@href=\"print_all_bug_page_word.php?search=&sort=last_updated&dir=ASC&type_page=word&export=-1&show_flag=0\"]"));
		imprimirWorld.click();
		
	
	}
	
	@Test
	public void imprimirTarefasWorlView() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		Utils.facaLogin(driver);
		driver.get("https://mantis-prova.base2.com.br/view_all_bug_page.php?refresh=true");
		WebElement imprimirTarefas = driver.findElement(By.xpath("//a[@href=\"print_all_bug_page.php\"]"));
		imprimirTarefas.click();
		WebElement imprimirWorld = driver.findElement(By.xpath("//a[@href=\"print_all_bug_page_word.php?search=&sort=last_updated&dir=ASC&type_page=html&export=-1&show_flag=0\"]"));
		imprimirWorld.click();
		
	
	}
	
	@Test
	public void visualizarTarefasMarcadas() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		Utils.facaLogin(driver);
		driver.get("https://mantis-prova.base2.com.br/view_all_bug_page.php?refresh=true");
		WebElement imprimirTarefas = driver.findElement(By.xpath("//a[@href=\"print_all_bug_page.php\"]"));
		imprimirTarefas.click();
		
		WebElement mostrarSelecionados =driver.findElement(By.xpath("//input[@value = 'Mostrar apenas os selecionados']"));
		mostrarSelecionados.click();
		
	
	}
	
	
}

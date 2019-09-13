package qualityServices;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BusquedaConParametro {

	public static void main(String args[])throws InterruptedException {
		//System.setProperty(
			//	"webdriver.chrome.driver",
				//"SeleniumTestLiverpool2\\src\\qualityServices\\chromedriver.exe");
		
		System.setProperty(
				"webdriver.chrome.driver",
					".\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		driver.get("https://www.liverpool.com.mx/tienda/home.jsp");
		driver.manage().window().maximize();
		
		//1
		//click imagen y descripción detallada parrilas
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.querySelector('div.container:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(7) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)').click();");;
		Thread.sleep(5000);
		
		// home 
		driver.findElement(By.cssSelector(".a-header__logo")).click();
		Thread.sleep(5000);
		
		//2
		//click imagen y descripción detallada xbox
		jse.executeScript("document.querySelector('div.container:nth-child(5) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(8) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > img:nth-child(1)').click();");;
		Thread.sleep(5000);
		
		// home 
		driver.findElement(By.cssSelector(".a-header__logo")).click();
		Thread.sleep(5000);
		
		
		// 3 secuencia
		// Departamentos
		driver.findElement(By.cssSelector("li.m-navDesktop__section.pt-2.pb-2")).click();				
		Thread.sleep(5000);
		//Él
		driver.findElement(By.cssSelector("li.m-megamenu__category:nth-child(2) > a:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
		Thread.sleep(5000);
		//Zapatos
		driver.findElement(By.cssSelector("#object1")).click();
		Thread.sleep(5000);					
		//mostrar todos
		driver.findElement(By.cssSelector("#target1 > div:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)")).click();
		Thread.sleep(5000);		
		//ordenar por 
		driver.findElement(By.cssSelector(".col-xl-3 > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)")).click();
		Thread.sleep(5000);		
		//menor precio 
		driver.findElement(By.cssSelector(".col-xl-3 > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > button:nth-child(2)")).click();
		Thread.sleep(5000);	
		
		// home 
		driver.findElement(By.cssSelector(".a-header__logo")).click();
		Thread.sleep(5000);

        // 4 secuencia 
		// Departamentos
		driver.findElement(By.cssSelector("li.m-navDesktop__section.pt-2.pb-2")).click();				
		Thread.sleep(5000);
		//Ella
		driver.findElement(By.cssSelector("li.m-megamenu__category:nth-child(1) > a:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
		Thread.sleep(5000);
		//Bolsas
		driver.findElement(By.cssSelector("#object1")).click();
		Thread.sleep(5000);	
		//tipo crossbody
		driver.findElement(By.cssSelector("#target1 > div > ul > li:nth-child(4) > a")).click(); 
		Thread.sleep(5000);	
		//Página siguiente
		jse.executeScript("document.querySelector('li.page-item:nth-child(4) > a:nth-child(1)').click();");				
		Thread.sleep(5000);		
		//rango de precios 
		jse.executeScript("document.getElementById('16ps94a').click();");
		Thread.sleep(5000);		
		//rating 
		jse.executeScript("document.getElementById('2mx8').click();");		
		//limpiar filtros
		jse.executeScript("document.querySelector('.plp-head-filter > a:nth-child(2)').click();");
		Thread.sleep(5000);
				
		// home 
		driver.findElement(By.cssSelector(".a-header__logo")).click();
		Thread.sleep(5000);
		
		
		// 5
		//click imagen de opciones con descuento  
		jse.executeScript("document.querySelector('div.container:nth-child(3) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)').click();");;
		Thread.sleep(5000);
		
		// home 
		driver.findElement(By.cssSelector(".a-header__logo")).click();
		Thread.sleep(5000);
		
		// 6
		//click imagen y secuencia
		jse.executeScript("document.querySelector('.m-vertical > a:nth-child(1) > picture:nth-child(1) > img:nth-child(3)').click();");;
		Thread.sleep(5000);
		//accesorios
		driver.findElement(By.id("object4")).click();
		Thread.sleep(5000);
		//ver todos 
		driver.findElement(By.cssSelector("#target4 > div:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)")).click();
		Thread.sleep(5000);
		//Página siguiente
		jse.executeScript("document.querySelector('li.page-item:nth-child(4) > a:nth-child(1)').click();");				
		Thread.sleep(5000);	
		//ordenar por 
		driver.findElement(By.cssSelector(".col-xl-3 > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)")).click();
		Thread.sleep(5000);		
		//mayor precio 
		driver.findElement(By.cssSelector(".col-xl-3 > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > button:nth-child(3)")).click();
		Thread.sleep(5000);
		//ordenar por 
		driver.findElement(By.cssSelector(".col-xl-3 > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)")).click();
		Thread.sleep(5000);		
		//menor precio 
		driver.findElement(By.cssSelector(".col-xl-3 > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > button:nth-child(2)")).click();
		Thread.sleep(5000);
		
		// home 
		driver.findElement(By.cssSelector(".a-header__logo")).click();
		Thread.sleep(5000);
		
			
		// 7 Secuencia
		// Departamentos
		driver.findElement(By.cssSelector("li.m-navDesktop__section.pt-2.pb-2")).click();				
		Thread.sleep(5000);
		//Él
		driver.findElement(By.cssSelector("li.m-megamenu__category:nth-child(2) > a:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
		Thread.sleep(5000);
		//Zapatos
		driver.findElement(By.cssSelector("#object1")).click();
		Thread.sleep(5000);
		//formales 
		driver.findElement(By.cssSelector("#target1 > div:nth-child(1) > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1)")).click();
		Thread.sleep(5000);
		// Elegir rango de precios		
		jse.executeScript("document.getElementById('27kh').click();");
		//rating 		
		jse.executeScript("document.getElementById('2mx7').click();");
		//limpiar filtros
		jse.executeScript("document.querySelector('.plp-head-filter > a:nth-child(2)').click();");
		Thread.sleep(5000);
		
		// home 
		driver.findElement(By.cssSelector(".a-header__logo")).click();
		Thread.sleep(5000);	

		
		driver.quit();
		}	

}

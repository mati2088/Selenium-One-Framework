package wrapper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseWrapper {
    private WebDriver driver;

    //construcor
    public BaseWrapper(WebDriver driver){
        this.driver=driver;
    }
    //Hago la conexion a selenium y a chrome
    public WebDriver chromeConexion(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\matia\\OneDrive\\Escritorio\\Selenium Web Driver\\Selenium Web Driver #P1\\Selenium\\OneSelenium\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver= new ChromeDriver();
        return driver;
    }

    //genero metodo para obtener un elemento
    public WebElement findElement(By locator){
        return  driver.findElement(locator);
    }

    //genero un metodo para obtener una lista de elementos

    public List<WebElement> findElements(By locator){
        return  driver.findElements(locator);
    }

    //genero un metodo para obtener textos
    public String getText(WebElement element){
        return element.getText();
    }

    public String getText(By locator){
        return driver.findElement(locator).getText();
    }

    public void type(String inputText,By locator){
        driver.findElement(locator).sendKeys(inputText);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public boolean isDisplayed(By locator){
        try {
            return driver.findElement(locator).isDisplayed();
        }catch (org.openqa.selenium.NoSuchElementException e){
                return false;
        }
    }

    public void  visitPage(String url){
        driver.get(url);
    }






}



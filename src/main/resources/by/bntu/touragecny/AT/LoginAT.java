package by.bntu.touragecny.AT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginAT  {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
        WebDriver driver = new FirefoxDriver();

        // And now use this to visit Google
        driver.get("http://localhost:8080/TourAgency/controller?command=home");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("login"));
        element.click();
        
     // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
        
        WebElement loginElement = driver.findElement(By.name("name"));
        loginElement.sendKeys("Vit");
        
        WebElement passElement = driver.findElement(By.name("surname"));
        passElement.sendKeys("Voron");
        
        WebElement submitElement = driver.findElement(By.name("submit"));
        submitElement.click();

        // Should see: "cheese! - Google Search"
        System.out.println("Page title is: " + driver.getTitle());
        
        //Close the browser
        driver.quit();
    }
}
package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {

    //import Selenium WebDriver
    private WebDriver driver;

    //import ChromeDriver
    public void setUp(){
        System.setProperty("WebDriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();

    //Input Project URL= Postman URL
        driver.get("https://identity.getpostman.com/login");

    //Waiting for globally
        driver.manage() .timeouts() .implicitlyWait(10, TimeUnit.SECONDS);

    //Maximize the window
       driver.manage() .window() .maximize();

    //Get page title
        System.out.println(driver.getTitle());

    //Locate username field
        driver.findElement(By.id("Username")).sendKeys("");

    //Locate password field
        driver.findElement(By.id("Password")).sendKeys("");

    //Click on login button
        driver.findElement(By.id("Login")).click();

    }
    //Initiate the test run command
    public static void main(String arg[]){
        LoginTests Test = new LoginTests();
    }
    //Close the browser


    public void setDriver(WebDriver driver) {
        this.driver = driver;
        driver.quit();
    }
}

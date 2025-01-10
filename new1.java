package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;
public class new1 {
    private WebDriver driver;
    private WebDriverWait wait;
    @Test
    public void setUp() throws InterruptedException{
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://github.com/login");
        Thread.sleep(500);
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login_field")));
        username.sendKeys("2200039004@kluniversity.in");
        Thread.sleep(500);
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        password.sendKeys("NBGd2aYTZJ8pDg!");
        Thread.sleep(500);
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='submit' and @value='Sign in']")));
        loginButton.click();
    }
    @AfterTest
    public void tearDown() {
        if (driver != null){
            driver.quit();
        }}

}

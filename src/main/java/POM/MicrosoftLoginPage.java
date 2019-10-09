package POM;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class MicrosoftLoginPage extends BasePage {


    private By usernameBy = By.xpath("//*[@id=\"i0116\"]");
    private By passwordBy = By.xpath("//*[@id=\"passwordInput\"]");
    private By loginButtonBy = By.xpath("//*[@id=\"idSIButton9\"]");
    private By enterButton = By.xpath("//*[@id=\"submitButton\"]");

    public MicrosoftLoginPage(WebDriver driver) {
        super(driver);
    }


    public void logIn(String username, String password) {
        this.setEmail(username);
        doClick(loginButtonBy);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        this.setPassword(password);
        doClick(enterButton);
        driver.findElement(By.xpath("//*[@id=\"idBtn_Back\"]")).click();

    }

    public By getUsernameBy() {
        return usernameBy;
    }

    public By getPasswordBy() {
        return passwordBy;
    }

    public By getLoginButtonBy() {
        return loginButtonBy;
    }

    public By getEnterButton() {
        return enterButton;
    }

    public void setEmail(String username) {
        driver.findElement(usernameBy).sendKeys(username);
    }

    public void setPassword(String password) {
        driver.findElement(passwordBy).sendKeys(password);
    }
}

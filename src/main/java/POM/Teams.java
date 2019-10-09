package POM;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Teams extends BasePage {

    private By avoidNotificationButton = By.xpath("//*[@id=\"toast-container\"]/div/div/div[2]/div/button[2]");
    private By chooseVersion = By.xpath("//*[@id=\"download-desktop-page\"]/div/a");
    private By messageBar = By.xpath("//*[@id=\"cke_1_contents\"]/div");
    private By sendButton = By.xpath("//*[@id=\"send-message-button\"]");

    public Teams(WebDriver driver) {
        super(driver);
    }


    public By getAvoidNotificationButton() {
        return avoidNotificationButton;
    }

    public By getChooseVersion() {
        return chooseVersion;
    }

    public void sendMessage(String msg) {
        driver.findElement(messageBar).sendKeys(msg);
        doClick(sendButton);
    }


    public By getMessageBar() {
        return messageBar;
    }
}

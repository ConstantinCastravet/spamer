package POM;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Office365 extends BasePage {


    private By teamsBy = By.xpath("//*[@id=\"ShellSkypeTeams_link\"]/span/ohp-icon-font/span");
    private By outlookBy = By.xpath("//*[@id=\"ShellMail_link\"]/span/ohp-icon-font/span");

    public Office365(WebDriver driver) {
        super(driver);
    }


    public void chooseTool(By element) {
        doClick(element);
    }

    public By getTeamsBy() {
        return teamsBy;
    }

    public By getOutlookBy() {
        return outlookBy;
    }
}

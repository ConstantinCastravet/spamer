package core;

import POM.MicrosoftLoginPage;
import POM.Office365;
import POM.Teams;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Start {
    static WebDriver driver;

    public static void main(String[] args) throws Exception {
        InputStream input = new FileInputStream("src\\main\\java\\config.properties");

        Properties prop = new Properties();
        prop.load(input);

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jostea\\Downloads\\driver\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get(prop.getProperty("microsoftLoginUrl"));

        MicrosoftLoginPage microsoftLoginPage = new MicrosoftLoginPage(driver);

        microsoftLoginPage.logIn(prop.getProperty("username"),
                prop.getProperty("password"));


        driver.get(prop.getProperty("DanilUrl"));

        Teams teams = new Teams(driver);
        teams.doClick(teams.getChooseVersion());
        teams.doClick(teams.getAvoidNotificationButton());

        for (int i = 0; i < 5; i++)
            teams.sendMessage("Привет данил я немного автомачу.)");
    }


}

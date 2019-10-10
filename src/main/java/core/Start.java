package core;

import POM.MicrosoftLoginPage;
import POM.Teams;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Start {
    static WebDriver driver;

    public static void main(String[] args) throws Exception {


        InputStream input = new FileInputStream("src\\main\\java\\config.properties");

        Properties prop = new Properties();
        prop.load(input);

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CCastravet\\Downloads\\chromedriver_win32\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get(prop.getProperty("microsoftLoginUrl"));

        MicrosoftLoginPage microsoftLoginPage = new MicrosoftLoginPage(driver);

        microsoftLoginPage.logIn(prop.getProperty("username"),
                prop.getProperty("password"));


        driver.get(prop.getProperty("internsihipGroupUrl"));

        Teams teams = new Teams(driver);
        teams.doClick(teams.getChooseVersion());
        teams.doClick(teams.getAvoidNotificationButton());
        teams.sendMessage("    ∧＿∧\n" +
                "（｡･ω･｡)つ━☆・*。\n" +
                "⊂　　 ノ 　　　・゜+.\n" +
                "しーＪ　　　°。+ *´¨)\n" +
                "　　.· ´¸.·*´¨) ¸.·*¨)\n" +
                "(¸.·´ (¸.·’* ⛧");

        for (int i = 0; i < 4; i++) {
            teams.sendMessage(
                    "　　.· ´¸.·*´¨) ¸.·*¨)\n" +
                            "(¸.·´ (¸.·’* ⛧    ");
        }
        driver.close();
    }
}

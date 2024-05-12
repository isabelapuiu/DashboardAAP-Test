package aap.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TestLogin {

    @FindBy(id = "login_email")
    WebElement username;

    @FindBy(id = "login_password")
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submitbutton;

    public void runTest() {
        System.out.println("running TestLogin");

        ChromeDriver chromeDriver = new ChromeDriver();

        PageFactory.initElements(chromeDriver, this);

        chromeDriver.get("https://dashboard.parentsapp.co/login");

        username.clear();
        username.sendKeys("ionel@gmail.com");

        password.clear();
        password.sendKeys("ionel_password");

        submitbutton.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        chromeDriver.quit();
    }

}

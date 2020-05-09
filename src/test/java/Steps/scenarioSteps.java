package Steps;

import Setups.Capabilities;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;

public class scenarioSteps extends Capabilities {
    @Before({"@Test"})
    public void setup() throws Exception {
        preparation();
    }

    @Given("^User launch Test$")
    public void userLaunchTest() throws Throwable {
        String app_package_name = "com.flipkart.android:id/";
        By userId = By.id(app_package_name + "user_id");
        By password = By.id(app_package_name + "user_password");
        By showPassword = By.id(app_package_name + "show_password");
        By login_Button = By.id(app_package_name + "btn_login");

        driver.findElement(userId).sendKeys("someone@testvagrant.com");
        driver.findElement(password).sendKeys("testvagrant123");
        driver.findElement(showPassword).click();
        driver.findElement(login_Button).click();
    }

    @After({"@Test"})
    public void stop(){
        stopServer();
    }
}

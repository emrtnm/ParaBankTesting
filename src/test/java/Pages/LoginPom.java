package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom extends Parent{
    public LoginPom() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(name = "username")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(css = "input[type='submit']")
    public WebElement loginBtn;

    @FindBy(xpath = "//b[text()='Welcome']")
    public WebElement resultMsg;
}

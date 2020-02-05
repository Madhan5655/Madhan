package hotelpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonMethods {
public  LoginPage(){
	PageFactory.initElements(driver, this);
}
@FindBy(id = "username")		
private WebElement UserName;

public WebElement getUserName() {
	return UserName;
}


public WebElement getPassword() {
	return Password;
}


public WebElement getBtnCick() {
	return btnCick;
}
@FindBy(id = "password")		
private WebElement Password;


@FindBy(id = "login")		
private WebElement btnCick;



	}

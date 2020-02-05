package hotelpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class List_of_hotels extends CommonMethods {

	public List_of_hotels() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getButtonclick() {
		return buttonclick;
	}

	public WebElement getClickContinue() {
		return clickContinue;
	}

	public WebElement getClickCancel() {
		return clickCancel;
	}

	@FindBy(id = "radiobutton_1")
	private WebElement buttonclick;

	@FindBy(id = "continue")
	private WebElement clickContinue;

	@FindBy(id = "Cancel")
	private WebElement clickCancel;

}

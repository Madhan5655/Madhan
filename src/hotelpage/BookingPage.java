package hotelpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage extends CommonMethods{
public BookingPage () {
PageFactory.initElements(driver, this);
}
@FindBy(id = "first_name")
	private WebElement fname;

@FindBy(id = "last_name")
private WebElement lname;

@FindBy(id="address")
private WebElement residental_address;

@FindBy(id = "cc_num")
private WebElement creditcard_number;

@FindBy(id = "cc_type")
private WebElement cardType;

@FindBy(id = "cc_exp_month")
private WebElement card_exp_month;

@FindBy(id = "cc_exp_year")
private WebElement card_exp_year;

@FindBy(id = "cc_cvv")
private WebElement ccv;

@FindBy(id = "book_now")
private WebElement book;


@FindBy(id = "cancel")
private WebElement cancel_booking;


public WebElement getFname() {
	return fname;
}


public WebElement getLname() {
	return lname;
}


public WebElement getResidental_address() {
	return residental_address;
}


public WebElement getCreditcard_number() {
	return creditcard_number;
}


public WebElement getCardType() {
	return cardType;
}


public WebElement getCard_exp_month() {
	return card_exp_month;
}


public WebElement getCard_exp_year() {
	return card_exp_year;
}


public WebElement getCcv() {
	return ccv;
}


public WebElement getBook() {
	return book;
}


public WebElement getCancel_booking() {
	return cancel_booking;
}


}

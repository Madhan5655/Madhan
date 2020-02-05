package hotelpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataFilling extends CommonMethods {

	public DataFilling() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement loc;

	@FindBy(id = "hotels")
	private WebElement hotel;

	@FindBy(id = "room_type")
	private WebElement rooms;

	@FindBy(id = "room_nos")
	private WebElement roomneeded;

	@FindBy(id = "datepick_in")
	private WebElement checkindate;

	@FindBy(id = "datepick_out")
	private WebElement checkoutdate;

	@FindBy(id = "adult_room")
	private WebElement no_of_Adults;

	@FindBy(id = "child_room")
	private WebElement no_of_childrens;

	@FindBy(id = "Submit")
	private WebElement search;

	@FindBy(id = "Reset")
	private WebElement cleardata;

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getRoomneeded() {
		return roomneeded;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getNo_of_Adults() {
		return no_of_Adults;
	}

	public WebElement getNo_of_childrens() {
		return no_of_childrens;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getCleardata() {
		return cleardata;
	}

}

package hotelpage;

public class Execution extends CommonMethods {

	public static void main(String[] args) {

		getDriver();
		loadUrl("https://adactin.com/HotelApp/index.php");

		LoginPage L = new LoginPage();
		DataFilling D = new DataFilling();
		List_of_hotels h = new List_of_hotels();
		BookingPage b = new BookingPage();
		CommonMethods c = new CommonMethods();
		c.fill(L.getUserName(), "Madhan5655");
		c.fill(L.getPassword(), "9710007461");
		c.btnclick(L.getBtnCick());
		
		
		c.dropdown(D.getLoc(),"Sydney");
		c.dropdown(D.getHotel(), "Hotel Creek");
		c.dropdown(D.getRooms(), "Standard");
		c.dropdown(D.getRoomneeded(),"1 - One");
		c.dropdown(D.getCheckindate(), "10/10/2020");
		c.dropdown(D.getCheckoutdate(), "20/10/2020");
		c.dropdown(D.getNo_of_Adults(), "3 - Three");
		c.dropdown(D.getNo_of_childrens(), "2 - Two");
		D.getSearch();
		
		h.getButtonclick();
		h.getClickContinue();
		c.fill(b.getFname(), "Madhan");
		c.fill(b.getLname(), "Kumar");
		c.fill(b.getResidental_address(), "POrur");
		c.fill(b.getCreditcard_number(), "1111111111111111");
		c.fill(b.getCardType(), "American Express");
		c.fill(b.getCard_exp_month(), "July");
		c.fill(b.getCard_exp_year(), "2022");
		c.fill(b.getCcv(), "567");
		b.getBook();
		
	}

}

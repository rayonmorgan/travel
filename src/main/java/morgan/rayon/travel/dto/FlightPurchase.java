package morgan.rayon.travel.dto;

public class FlightPurchase extends Flight {
	private String _token;
	private String inputName;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	private String cardType;
	private String creditCardMonth;
	private String creditCardYear;
	private String nameOnCard;
	private String rememberMe;
	
	public FlightPurchase()
	{
		super();
		
	}
	
	public FlightPurchase(Flight flight)
	{
		super(flight);
		
	}
	
	public FlightPurchase(String _token, String inputName, String address, String city, String state, String zipCode,
			String cardType, String creditCardMonth, String creditCardYear, String nameOnCard, String rememberMe) {
		super();
		this._token = _token;
		this.inputName = inputName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.cardType = cardType;
		this.creditCardMonth = creditCardMonth;
		this.creditCardYear = creditCardYear;
		this.nameOnCard = nameOnCard;
		this.rememberMe = rememberMe;
	}


	public String get_token() {
		return _token;
	}


	public void set_token(String _token) {
		this._token = _token;
	}


	public String getInputName() {
		return inputName;
	}


	public void setInputName(String inputName) {
		this.inputName = inputName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getZipCode() {
		return zipCode;
	}


	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}


	public String getCardType() {
		return cardType;
	}


	public void setCardType(String cardType) {
		this.cardType = cardType;
	}


	public String getCreditCardMonth() {
		return creditCardMonth;
	}


	public void setCreditCardMonth(String creditCardMonth) {
		this.creditCardMonth = creditCardMonth;
	}


	public String getCreditCardYear() {
		return creditCardYear;
	}


	public void setCreditCardYear(String creditCardYear) {
		this.creditCardYear = creditCardYear;
	}


	public String getNameOnCard() {
		return nameOnCard;
	}


	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}


	public String getRememberMe() {
		return rememberMe;
	}


	public void setRememberMe(String rememberMe) {
		this.rememberMe = rememberMe;
	}
		

}

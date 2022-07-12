package morgan.rayon.travel.dto;

public class Flight {
	private int flightNumber;
	private String airline;
	private String fromPort;
	private String toPort;
	private float price;
	
	public Flight()
	{
		
	}
	
	public Flight(Flight flight)
	{
		this.flightNumber = flight.flightNumber;
		this.airline = flight.airline;
		this.fromPort = flight.fromPort;
		this.toPort = flight.toPort;
		this.price = flight.price;
	}
	
	public Flight(int flightNumber, String airline, String fromPort, String toPort, float price) {
		super();
		this.flightNumber = flightNumber;
		this.airline = airline;
		this.fromPort = fromPort;
		this.toPort = toPort;
		this.price = price;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getFromPort() {
		return fromPort;
	}

	public void setFromPort(String fromPort) {
		this.fromPort = fromPort;
	}

	public String getToPort() {
		return toPort;
	}

	public void setToPort(String toPort) {
		this.toPort = toPort;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}		
	

}

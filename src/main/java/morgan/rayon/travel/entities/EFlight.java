package morgan.rayon.travel.entities;

import java.io.Serializable;

public class EFlight implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int flightNumber;
	private String airline;
	private String fromPort;
	private String toPort;
	private float price;


	public EFlight() {

	}

	public EFlight(int flightNumber, String airline, String fromPort, String toPort, float price) {
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

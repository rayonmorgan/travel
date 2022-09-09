package morgan.rayon.travel.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class EFlight implements Serializable {
	/**
	 * 	 
	 */

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "flightnumber")
	private int flightNumber;
	@Column(name = "airline")
	private String airline;
	@Column(name = "fromport")
	private String fromPort;
	@Column(name = "toport")
	private String toPort;
	@Column(name = "price")
	private float price;
	@Column(name = "departtime")
	private String departTime;
	@Column(name = "arrivetime")
	private String arriveTime;

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

	public String getDepartTime() {
		return departTime;
	}

	public void setDepartTime(String departTime) {
		this.departTime = departTime;
	}

	public String getArriveTime() {
		return arriveTime;
	}

	public void setArriveTime(String arriveTime) {
		this.arriveTime = arriveTime;
	}

}

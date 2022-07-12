package morgan.rayon.travel.dto;

public class SearchFlight {
	private String portFrom;
	private String portTo;
	
	public SearchFlight(String portFrom, String portTo) {
		super();
		this.portFrom = portFrom;
		this.portTo = portTo;
	}

	public String getPortFrom() {
		return portFrom;
	}

	public void setPortFrom(String portFrom) {
		this.portFrom = portFrom;
	}

	public String getPortTo() {
		return portTo;
	}

	public void setPortTo(String portTo) {
		this.portTo = portTo;
	}	
	

}

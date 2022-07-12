package morgan.rayon.travel.Util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import morgan.rayon.travel.dto.Flight;
import morgan.rayon.travel.dto.FlightPurchase;
import morgan.rayon.travel.dto.SearchFlight;

//int flightNumber, String airline, String fromPort, String toPort, float price

public class DAO {
	
	//fetch Flight and return collections to caller
	public List<Flight> getFlightList(SearchFlight searchFlight){
		
		List<Flight> flight_list = new ArrayList<Flight>();
		
		flight_list.add(
					new Flight(23,"American Airline","JFK","NMI",4.3f)
				);
		
		
		flight_list.add(
				new Flight(345,"Air Canada","Can","DSI",7.3f)
			);
		
		
		return flight_list;	
	}
	
	public Map<String,String> makePurchase(FlightPurchase flightPurchase)
	{
		Map<String,String> purchase_confirm = new HashMap<String,String>();
		purchase_confirm.put("id", "93843932");
		purchase_confirm.put("status", "PendingCapture");
		purchase_confirm.put("amount", "45.3");
		
		
		return purchase_confirm;
	}

}

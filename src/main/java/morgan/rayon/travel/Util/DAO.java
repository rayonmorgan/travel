package morgan.rayon.travel.Util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import morgan.rayon.travel.dto.Flight;
import morgan.rayon.travel.dto.FlightPurchase;
import morgan.rayon.travel.dto.SearchFlight;
import morgan.rayon.travel.entities.EFlight;
import morgan.rayon.travel.repositories.IEFlightRepo;

//int flightNumber, String airline, String fromPort, String toPort, float price
@Component
public class DAO {
	
	
	private IEFlightRepo ieFlightRepo;	
	
	public DAO(IEFlightRepo ieFlightRepo) {
		
		this.ieFlightRepo = ieFlightRepo;
	}
	
	

	//fetch Flight and return collections to caller
	public List<Flight> getFlightList(SearchFlight searchFlight){
	 
		System.out.println(searchFlight.getPortTo() + " Ports " +searchFlight.getPortFrom());
		
		List<Flight> flight = new ArrayList<Flight>();
		List<EFlight> eflight = ieFlightRepo.findByToPortAndFromPort(searchFlight.getPortTo(),searchFlight.getPortFrom());
		
		for(EFlight travEflight : eflight)
		{
			flight.add(
					new Flight(travEflight.getFlightNumber(),travEflight.getAirline(),
							travEflight.getFromPort(),travEflight.getToPort(),travEflight.getPrice(),
							travEflight.getDepartTime(),travEflight.getArriveTime())
					 
					);
			
		}
		
		return flight;	
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

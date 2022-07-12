package morgan.rayon.travel.controller;

import java.util.List;
import java.util.Map;

 
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import morgan.rayon.travel.Util.DAO;
import morgan.rayon.travel.dto.Flight;
import morgan.rayon.travel.dto.FlightPurchase;
import morgan.rayon.travel.dto.SearchFlight;

/**
 * 
 * @author vmadmin
 * API: Entry point, for all public facing api
 */
@RestController
@RequestMapping(value="/api")
public class Controller {	
	 
	
	
	@RequestMapping(value="/flight",method=RequestMethod.POST)
	public List<Flight> flightSearch(@RequestBody SearchFlight searchFlight)
	{
		DAO dao = new DAO();
		//search database for 
		
		return dao.getFlightList(searchFlight);
	}
	
	@RequestMapping(value="/purchase",method=RequestMethod.POST)
	public FlightPurchase purchaseFlight(@RequestBody Flight flight)
	{		 
		
		FlightPurchase flightPurchase = new FlightPurchase(flight);
		return flightPurchase;
	}
	
	@RequestMapping(value="/confirm",method=RequestMethod.POST)
	public Map<String,String> confirmPurchase(@RequestBody FlightPurchase flightPurchase)
	{
		DAO dao = new DAO();
		
		return dao.makePurchase(flightPurchase) ;		
	}
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String test()
	{
		return "works";
	}

}

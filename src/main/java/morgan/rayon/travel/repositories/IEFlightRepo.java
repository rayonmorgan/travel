package morgan.rayon.travel.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import morgan.rayon.travel.entities.EFlight;

@Repository
public interface IEFlightRepo extends JpaRepository<EFlight,Integer> {
	
	//return all flight matching to and from destination
	List<EFlight> findByToPortAndFromPort(String toPort,String fromPort);
	 

}

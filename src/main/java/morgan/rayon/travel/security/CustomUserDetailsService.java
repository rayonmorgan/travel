package morgan.rayon.travel.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import morgan.rayon.travel.entities.UserSecurity;
import morgan.rayon.travel.repositories.IUserSecurityRepo;

public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private IUserSecurityRepo userRepo;
	
 

	@Override
	public UserDetails loadUserByUsername(String username) {
		
		Optional<UserSecurity> user = userRepo.findUserByUsername(username);
	
		UserSecurity u = user.orElseThrow(()->new UsernameNotFoundException("User Not Found"));
	
		return new CustomUserDetails(u);
	}

}

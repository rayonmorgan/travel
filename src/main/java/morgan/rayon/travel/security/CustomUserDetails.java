package morgan.rayon.travel.security;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import morgan.rayon.travel.entities.UserSecurity;

public class CustomUserDetails implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1043593038388571835L;
	
	private UserSecurity userSecurity;
	
	
	public CustomUserDetails(UserSecurity userSecurity) 
	{
		this.userSecurity = userSecurity;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		 
		return List.of(()->"Read");
	}

	@Override
	public String getPassword() {
		 
		return userSecurity.getPassword();
	}

	@Override
	public String getUsername() {
		 
		return userSecurity.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		 
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		 
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		 
		return true;
	}

	@Override
	public boolean isEnabled() {
		 
		return true;
	}

}

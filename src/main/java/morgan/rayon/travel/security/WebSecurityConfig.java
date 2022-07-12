package morgan.rayon.travel.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

/**
 * N.B. WebSecurityConfigureAdapter: deprecated
 * @author vmadmin
 *
 */
@Configuration
public class WebSecurityConfig {

//	@Bean
//	public UserDetailsService userDetailsService() {
//		var uds = new InMemoryUserDetailsManager();
//		
//		var u1 = User.withUsername("userme")
//				.password("password")
//				.authorities("read").build();
//		
//		uds.createUser(u1);
//		
//		return uds;
//	}
	
	@Bean
	public UserDetailsService userDetailsService() {
		 return new CustomUserDetailsService();
	}
	
	@Bean
	public PasswordEncoder passEncoder()
	{
		return NoOpPasswordEncoder.getInstance();
		
	}
	
	
	  @Bean SecurityFilterChain myfilter(HttpSecurity http) throws Exception {
	  http.csrf().disable();
	  http.authorizeRequests()
	 .anyRequest().authenticated()
	 .and()
	 .httpBasic();
	  
	  return http.build();
	  
	  }
	 

}

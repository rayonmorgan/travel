package morgan.rayon.travel.security;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

/**
 * N.B. WebSecurityConfigureAdapter: deprecated
 * 
 * @author Rayon Morgan
 *
 */
@Configuration
public class WebSecurityConfig {

	@Bean
	public UserDetailsService userDetailsService() {
		return new CustomUserDetailsService();
	}

	@Bean
	public PasswordEncoder passEncoder() {
		return NoOpPasswordEncoder.getInstance();

	}

	@Bean
	SecurityFilterChain myfilter(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
		//http.authorizeRequests().anyRequest().permitAll();
		http.cors();
		
//		 http.cors(c -> {
//			 CorsConfigurationSource cs = r -> {
//				 CorsConfiguration cc = new CorsConfiguration();
//				 cc.setAllowedOrigins(List.of("*"));
//				 cc.setAllowedMethods(List.of("GET","POST"));
//				 return cc;
//			 };
//			 c.configurationSource(cs);
//		 });

		return http.build();

	}
	
	//Global CORS registry


}

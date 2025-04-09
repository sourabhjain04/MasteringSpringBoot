package com.example;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	  @Bean
	    public UserDetailsService userDetailsService(DataSource dataSource) {
	        return new JdbcUserDetailsManager(dataSource);
	    }


	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http)throws Exception{
		
		http.authorizeHttpRequests(auth->auth
				.requestMatchers("/home","contact").permitAll()
				.anyRequest().authenticated()
				)
		.formLogin(login->login
				.defaultSuccessUrl("/dashboard",true)
				.permitAll())
		.logout(logout->logout
				.logoutUrl("/logout")
				.logoutSuccessUrl("/home").permitAll());
		return http.build();
		
	}
}

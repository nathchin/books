//package com.example.config;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class Config extends WebSecurityConfigurerAdapter{
//
//	
//	
//	@Autowired
//	private DataSource dataSource;
//	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//	
//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth) 
//	  throws Exception {
//	    auth.jdbcAuthentication().dataSource(dataSource)
//	      .withDefaultSchema()
//	      .withUser("user").password(passwordEncoder().encode("password")).roles("USER")
//	      .and()
//	      .withUser("admin").password(passwordEncoder().encode("password")).roles("USER", "ADMIN");
//	}
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		
//		http.authorizeRequests()
//	      .anyRequest().authenticated()
//	      .and().formLogin()
//	      .loginPage("/login").permitAll();
//	
//	    http.cors().and()
//	            .csrf().disable()
//	            .authorizeRequests()
//	            .antMatchers("/login","/v2/api-docs",
//	                  "/swagger-resources",
//	                  "/swagger-resources/**",
//	                  "/configuration/ui",
//	                  "/configuration/security",
//	                  "/swagger-ui.html",
//	                  "/webjars/**",
//	                  // -- Swagger UI v3 (OpenAPI)
//	                  "/v3/api-docs/**",
//	                  "/swagger-ui/**",
//	                  // other public endpoints of your API may be appended to this array
//	                  "/author/**",
//	                  "/book/**").hasRole("ADMIN")
//	            .and()
//	            .httpBasic()
//	            .and()
//	            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//	    
//	    http.logout();
//	}
//}
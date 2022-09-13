//package com.example.config;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//    private static final String[] AUTH_WHITELIST = {
//            // -- Swagger UI v2
//            "/v2/api-docs",
//            "/swagger-resources",
//            "/swagger-resources/**",
//            "/configuration/ui",
//            "/configuration/security",
//            "/swagger-ui.html",
//            "/webjars/**",
//            // -- Swagger UI v3 (OpenAPI)
//            "/v3/api-docs/**",
//            "/swagger-ui/**",
//            // other public endpoints of your API may be appended to this array
//            "/author/**"
//    };
//    
//    private static final String[] ADMIN_WHITELIST = {
//            "/author/delete",
//            "/book/delete"
//    };
//
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//    	http.security.httpBasic().disable();
//    	http.formLogin().disable();
//        http.authorizeRequests().antMatchers("/**").permitAll();	
//        		
//                // ... here goes your custom security configuration
//                
////                .antMatchers(AUTH_WHITELIST).access("hasRole('USER')")  // whitelist Swagger UI resources
////                // ... here goes your custom security configuration
//////                antMatchers("/**").permitAll();  // require authentication for any endpoint that's not whitelisted
////                .antMatchers(ADMIN_WHITELIST).hasRole("ADMIN")
////        		.antMatchers("/**").authenticated()
////        		.and().formLogin()
////        	    .loginPage("/login").permitAll();
////        
////        http.csrf().disable();
////        
////        
////        http.logout().logoutUrl("/my/logout")
////        .logoutSuccessUrl("/my/index")
//////        .logoutSuccessHandler(logoutSuccessHandler)
////        .invalidateHttpSession(true)
//////        .addLogoutHandler(logoutHandler)
//////        .deleteCookies(cookieNamesToClear)
//////        .and()
////        // some other method calls
////        ;
//    }
//    
//    
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//    
//    @Autowired
//    private DataSource dataSource;
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) 
//      throws Exception {
//        auth.jdbcAuthentication().dataSource(dataSource)
//          .withDefaultSchema()
//          .withUser("user").password(passwordEncoder().encode("password")).roles("USER")
//          .and()
//          .withUser("admin").password(passwordEncoder().encode("password")).roles("USER", "ADMIN");
//    }
//
//}
//
//

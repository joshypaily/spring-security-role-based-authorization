package com.indo.student.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableConfigurationProperties
public class SecurityConfig extends WebSecurityConfigurerAdapter {
 
   @Autowired
   MongoUserDetailsService mongoUserDetailsService;
   
   @Autowired
   CustomAuthSuccessHandler customAuthSuccessHandler;
   
   @Override
   protected void configure(HttpSecurity http) throws Exception {
     
	   //disabling Cross-Site Request Forgery
	   http.csrf().disable();
	   //no authentication required
	   http.authorizeRequests().antMatchers("/", "/login", "/logout","/signUp").permitAll();
	   //authenticated users
	   http.authorizeRequests().antMatchers("/getStudents","/adminHome","/userHome").authenticated();
	   
	   //configure login form
	   http.authorizeRequests().and().formLogin().loginPage("/login")
		   .successHandler(customAuthSuccessHandler)
		   .failureUrl("/login?failed").usernameParameter("username")
		   .passwordParameter("password")
		   
		   // Config for Logout Page
	       .and().logout().logoutUrl("/logout").logoutSuccessUrl("/login?logout");
   }
   
   @Bean
   public PasswordEncoder passwordEncoder() {
	   return new BCryptPasswordEncoder();
   }
   
   @Override
   public void configure(AuthenticationManagerBuilder builder) throws Exception {
    builder.userDetailsService(mongoUserDetailsService);
   }
}









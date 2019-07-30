package com.student.security;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthSuccessHandler extends SimpleUrlAuthenticationSuccessHandler{

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws ServletException, IOException {

		//System.out.println("  onAuthenticationSuccess redirection         "  );
		
		String adminHome = "/adminHome";
		String userHome = "/userHome";

		Set<String> authorities = AuthorityUtils.authorityListToSet(authentication.getAuthorities());

		if (authorities.contains("user")) {
		
			getRedirectStrategy().sendRedirect(request, response, userHome);
		}
		else if(authorities.contains("admin")) {
			getRedirectStrategy().sendRedirect(request, response, adminHome);
			
		}
		
	}
}

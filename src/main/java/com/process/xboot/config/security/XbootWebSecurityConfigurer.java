//package com.process.boot.config.security;
//
//import com.process.boot.config.security.provider.XbootAuthenticationProvider;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * @author xkx
// * @description
// */
////@Slf4j
////@Configuration
//public class XbootWebSecurityConfigurer extends WebSecurityConfigurerAdapter {
//
//  @Override
//  protected void configure(HttpSecurity http) throws Exception {
//    super.configure(http);
//    http.authorizeRequests()
//        .antMatchers("/bill/**").hasRole("Role_Bill")
//        .antMatchers("/settle/**").hasRole("Role_Settle")
//        .and()
//        .formLogin().loginPage("login.html")
//            .successHandler(new AuthenticationSuccessHandler() {
//              @Override
//              public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
//                    response.sendRedirect("/bill/find");
//                }
//            })
//        .permitAll()
//        .and()
//        .authenticationProvider(xbootAuthenticationProvider());
//  }
//
//  @Bean
//  public AuthenticationProvider xbootAuthenticationProvider(){
//    return new XbootAuthenticationProvider();
//  }
//}
package com.wrox;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.EnumSet;

public class Configurator implements ServletContextListener {
  @Override
  public void contextInitialized(ServletContextEvent sce) {
    ServletContext context = sce.getServletContext();
    
    FilterRegistration.Dynamic registration = context.addFilter("loggingFilter", new LoggingFilter());
    
    registration.addMappingForUrlPatterns(
            EnumSet.of(DispatcherType.REQUEST, DispatcherType.INCLUDE,
                    DispatcherType.FORWARD, DispatcherType.ERROR),
            false, "/*"
    );
    
    registration = context.addFilter("authenticationFilter", new AuthenticationFilter());
    registration.addMappingForUrlPatterns(null, false, "/tickets", "/chat", "/sessions");
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) { }
}
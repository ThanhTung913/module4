package com.example.configuration_project_javaconfig;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

//public class WebInitalazer implements WebApplicationInitializer {
//        @Override
//        public void onStartup(ServletContext container) throws ServletException {
//                AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//                ctx.register(HelloWorldConfiguration.class);
//                ctx.setServletContext(container);
//                ServletRegistration.Dynamic servlet = container.addServlet("dispatcher", new DispatcherServlet(ctx));
//                servlet.setLoadOnStartup(1);
//                servlet.addMapping("/");
//        }
//}

public class WebInitalazer extends AbstractAnnotationConfigDispatcherServletInitializer {
        @Override
        protected Class<?>[] getRootConfigClasses() {
                return new Class[] {HelloWorldConfiguration.class};
        }

        @Override
        protected Class<?>[] getServletConfigClasses() {
                return null;
        }

        @Override
        protected String[] getServletMappings() {
                return new String[] {"/"};
        }
}
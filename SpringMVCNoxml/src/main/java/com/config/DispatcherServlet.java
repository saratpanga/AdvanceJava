package com.config;

import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServlet extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?> @Nullable [] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?> @Nullable [] getServletConfigClasses() {
		Class[] configClasses= {Config.class};
		return configClasses;
	}

	@Override
	protected String[] getServletMappings() {
		String[] urls= {"/fet/*"};
		return urls;
	}

}

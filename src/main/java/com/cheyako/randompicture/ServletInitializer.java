package com.cheyako.randompicture;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer
{
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
    {
        return application.sources(new Class[] { SiteApplication.class });
    }
}

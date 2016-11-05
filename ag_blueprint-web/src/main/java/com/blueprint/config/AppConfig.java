package com.blueprint.config;

import com.blueprint.web.dao.PlayerDao;
import com.blueprint.web.dao.PlayerDaoImpl;
import com.blueprint.web.services.PlayerService;
import com.blueprint.web.services.PlayerServiceImpl;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"com.blueprint.web.*"})
public class AppConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Bean
    public InternalResourceViewResolver jspViewResolver() {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setPrefix("/WEB-INF/views/");
        bean.setSuffix(".jsp");
        return bean;
    }

    @Bean
    public PlayerService playerService() {
        return new PlayerServiceImpl();
    }

    @Bean
    public PlayerDao playerDao() {
        return new PlayerDaoImpl();
    }

}

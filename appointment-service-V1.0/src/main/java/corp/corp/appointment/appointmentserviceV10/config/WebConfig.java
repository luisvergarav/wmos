package corp.corp.appointment.appointmentserviceV10.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;

@EnableWebMvc
@Configuration
public class WebConfig implements WebMvcConfigurer {

	
	
	@Autowired
	Jackson2ObjectMapperBuilder builder;
	
	@Bean

	public MappingJackson2HttpMessageConverter 
	customJackson2HttpMessageConverter() {
		
		ObjectMapper objectMapper = builder.createXmlMapper(false).build();
		JaxbAnnotationModule module = new JaxbAnnotationModule();
		// configure as necessary
		objectMapper.registerModule(module);

		// Use property
		objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);

		return new MappingJackson2HttpMessageConverter(objectMapper);
	}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {

		converters.add(0,customJackson2HttpMessageConverter());
		WebMvcConfigurer.super.configureMessageConverters(converters);
	}
}

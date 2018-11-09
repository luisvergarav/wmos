package corp.corp.appointment.appointmentserviceV10.config;

import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	
	
	

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {

		converters.add(jsonConverter());
		WebMvcConfigurer.super.configureMessageConverters(converters);
	}
	
	@Bean
	public MappingJackson2HttpMessageConverter jsonConverter() {
	    MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
	    ObjectMapper objectMapper = new ObjectMapper();
	    jsonConverter.setObjectMapper(objectMapper);
	    return jsonConverter;
	}
	
	
}

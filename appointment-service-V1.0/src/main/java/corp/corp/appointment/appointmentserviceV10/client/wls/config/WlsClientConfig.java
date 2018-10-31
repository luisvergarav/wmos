package corp.corp.appointment.appointmentserviceV10.client.wls.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import corp.corp.appointment.appointmentserviceV10.client.AppointmentClient;
import corp.corp.appointment.appointmentserviceV10.client.wls.service.WlsAppointmentClient;

@Configuration
@EnableAutoConfiguration
public class WlsClientConfig {


    @Bean
    @Primary
    public AppointmentClient appointmentClient(
           
    ) {

        return new WlsAppointmentClient( );
    }

}

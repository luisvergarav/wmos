package rtl.corp.corp.sche.whmg.appointment.appointmentV10.client.wls.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import rtl.corp.corp.sche.whmg.appointment.appointmentV10.client.AppointmentClient;
import rtl.corp.corp.sche.whmg.appointment.appointmentV10.client.wls.service.WlsAppointmentClient;

@Configuration
public class WlsClientConfig {


    @Bean
    @Primary
    public AppointmentClient appointmentClient(
           
    ) {

        return new WlsAppointmentClient( );
    }

}

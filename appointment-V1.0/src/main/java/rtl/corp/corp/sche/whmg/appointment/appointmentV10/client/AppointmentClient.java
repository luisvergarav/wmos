package rtl.corp.corp.sche.whmg.appointment.appointmentV10.client;

import rtl.corp.corp.sche.whmg.appointment.appointmentV10.domain.message.Message;

public interface AppointmentClient {

    void notify( final Message message ) throws Exception;    
}

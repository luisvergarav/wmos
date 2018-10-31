package corp.corp.appointment.appointmentserviceV10.client;

import corp.corp.appointment.appointmentserviceV10.domain.message.Message;

public interface AppointmentClient {

    void notify( final Message message ) throws Exception;    
}

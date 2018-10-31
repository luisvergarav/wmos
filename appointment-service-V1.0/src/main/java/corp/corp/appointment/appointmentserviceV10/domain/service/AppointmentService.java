package corp.corp.appointment.appointmentserviceV10.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import corp.corp.appointment.appointmentserviceV10.client.AppointmentClient;
import corp.corp.appointment.appointmentserviceV10.domain.message.Message;
import corp.corp.appointment.appointmentserviceV10.domain.model.AppointmentRequest;

@Service("appointmentService")
public class AppointmentService {
	@Autowired
	private  AppointmentClient client;

	public AppointmentService() {
	
	}

	public void notify(AppointmentRequest request) throws Exception {
		Message<AppointmentRequest> message = new Message<AppointmentRequest>();
		message.setPayload(request);
		client.notify(message);
	}

}

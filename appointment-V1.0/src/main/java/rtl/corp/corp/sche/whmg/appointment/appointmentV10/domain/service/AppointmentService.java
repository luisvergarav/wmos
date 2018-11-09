package rtl.corp.corp.sche.whmg.appointment.appointmentV10.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rtl.corp.corp.sche.whmg.appointment.appointmentV10.client.AppointmentClient;
import rtl.corp.corp.sche.whmg.appointment.appointmentV10.domain.message.Message;
import rtl.corp.corp.sche.whmg.appointment.appointmentV10.domain.model.AppointmentReq;

@Service("appointmentService")
public class AppointmentService {
	@Autowired
	private  AppointmentClient client;

	public AppointmentService() {
	
	}

	public void notify(AppointmentReq request) throws Exception {
		Message<AppointmentReq> message = new Message<AppointmentReq>();
		message.setPayload(request);
		client.notify(message);
	}

}

package corp.corp.appointment.appointmentserviceV10.domain.model;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppointmentRequestWrapper {
	
		@JsonProperty(value = "AppointmentReq")
		AppointmentReq appointmentReq;

	public AppointmentReq getAppointmentReq() {
		return appointmentReq;
	}

	public void setAppointmentReq(AppointmentReq appointmentReq) {
		this.appointmentReq = appointmentReq;
	}

	
	
	
}



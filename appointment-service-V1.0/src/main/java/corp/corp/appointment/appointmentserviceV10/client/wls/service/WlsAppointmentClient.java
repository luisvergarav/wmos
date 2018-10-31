package corp.corp.appointment.appointmentserviceV10.client.wls.service;

import java.util.Map;

import corp.corp.appointment.appointmentserviceV10.client.AppointmentClient;
import corp.corp.appointment.appointmentserviceV10.client.wls.jms.tools.JMSMessageTools;
import corp.corp.appointment.appointmentserviceV10.domain.message.Message;
import corp.corp.appointment.appointmentserviceV10.domain.model.AppointmentRequest;
import corp.corp.appointment.appointmentserviceV10.tools.MessageService;
import corp.corp.appointment.appointmentserviceV10.tools.AppointmentUpdateTools;
import corp.corp.appointment.appointmentserviceV10.tools.xml.XmlConvert;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WlsAppointmentClient implements AppointmentClient {

	@Override
	public void notify(Message message) throws Exception {
		
		XmlConvert<AppointmentRequest> convert = new XmlConvert<AppointmentRequest>();
		
		String requestJMSMessage = convert.convert((AppointmentRequest)message.getPayload());

		String requestXML = MessageService.getInstance().transformMessage(requestJMSMessage);

		//MessageService.getInstance().validateMessage(requestXML);

		Map<String, String> jmsHeaders = AppointmentUpdateTools.buildOrderUpdateJmsHeaders((AppointmentRequest)message.getPayload());

		log.debug("Sending Appointment...!",requestXML);
		JMSMessageTools.sendJMS(jmsHeaders, requestXML);

		

	}

}

package corp.corp.appointment.appointmentserviceV10.client.wls.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import corp.corp.appointment.appointmentserviceV10.client.AppointmentClient;
import corp.corp.appointment.appointmentserviceV10.client.wls.jms.tools.JMSMessageTools;
import corp.corp.appointment.appointmentserviceV10.config.PropertiesConfigBean;
import corp.corp.appointment.appointmentserviceV10.domain.message.Message;
import corp.corp.appointment.appointmentserviceV10.domain.model.AppointmentReq;
import corp.corp.appointment.appointmentserviceV10.tools.MessageService;
import corp.corp.appointment.appointmentserviceV10.tools.AppointmentUpdateTools;
import corp.corp.appointment.appointmentserviceV10.tools.xml.XmlConvert;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WlsAppointmentClient implements AppointmentClient {

	
	
	@Override
	public void notify(Message message) throws Exception {
		
		XmlConvert<AppointmentReq> convert = new XmlConvert<AppointmentReq>();
		
		String requestJMSMessage = convert.convert((AppointmentReq)message.getPayload());

		String requestXML = MessageService.getInstance().transformMessage(requestJMSMessage);

		//MessageService.getInstance().validateMessage(requestXML);

		Map<String, String> jmsHeaders = AppointmentUpdateTools.buildOrderUpdateJmsHeaders((AppointmentReq)message.getPayload());

		log.debug("Sending Appointment...! " + requestXML,requestXML);
		JMSMessageTools.sendJMS(jmsHeaders, requestXML);

		

	}

}

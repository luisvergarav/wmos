package rtl.corp.corp.sche.whmg.appointment.appointmentV10.client.wls.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import rtl.corp.corp.sche.whmg.appointment.appointmentV10.client.AppointmentClient;
import rtl.corp.corp.sche.whmg.appointment.appointmentV10.client.wls.jms.tools.JMSMessageTools;
import rtl.corp.corp.sche.whmg.appointment.appointmentV10.config.PropertiesConfigBean;
import rtl.corp.corp.sche.whmg.appointment.appointmentV10.domain.message.Message;
import rtl.corp.corp.sche.whmg.appointment.appointmentV10.domain.model.AppointmentReq;
import rtl.corp.corp.sche.whmg.appointment.appointmentV10.tools.MessageService;
import rtl.corp.corp.sche.whmg.appointment.appointmentV10.tools.AppointmentUpdateTools;
import rtl.corp.corp.sche.whmg.appointment.appointmentV10.tools.xml.XmlConvert;
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

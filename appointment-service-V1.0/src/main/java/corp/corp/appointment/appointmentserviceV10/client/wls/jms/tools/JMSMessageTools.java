package corp.corp.appointment.appointmentserviceV10.client.wls.jms.tools;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.jms.JMSException;
import javax.jms.TextMessage;

import corp.corp.appointment.appointmentserviceV10.excepcion.MDWRestException;
import corp.corp.appointment.appointmentserviceV10.excepcion.ServerConnectionException;
import corp.corp.appointment.appointmentserviceV10.rest.RestAPPConfig;
import corp.corp.appointment.appointmentserviceV10.rest.RestConstants;
import lombok.extern.slf4j.Slf4j;


/**
 * this is tools to build JMS message and Send the message to JMS
 * 
 * @author: jameswang
 * @version: 1.0, Feb 7, 2018
 */
@Slf4j
public class JMSMessageTools {



	private static DestinationDefinition getServerDefition() {
		DestinationDefinition destination = new DestinationDefinition();
		destination.setPath(RestAPPConfig.getInstance().getPropertyValue(RestConstants.JMS_PATH));
		destination.setUsername(RestAPPConfig.getInstance().getPropertyValue(RestConstants.JMS_USER_NAME));
		destination.setPassword(RestAPPConfig.getInstance().getPropertyValue(RestConstants.JMS_PASSWORD));
		log.debug("getServerDefition, destination: {}.", destination);
		return destination;
	}



	private static DestinationDefinition getTopicDefinition() {
		DestinationDefinition destination = getServerDefition();
		destination.setFactoryName(RestAPPConfig.getInstance().getPropertyValue(RestConstants.JMS_FACTORY));
        destination.setResourceName(RestAPPConfig.getInstance().getPropertyValue(RestConstants.JMS_TOPIC));
		destination.setResourceType(ResourceTypeDefinition.TOPIC);
		log.debug("getTopicDefinition, destination: {}.", destination);
		return destination;
	}



	public static void sendJMS(Map<String, String> pJmsHeaders, String pMessage) throws MDWRestException {
		JMSConnection connection = new JMSConnection();
		try {
			connection.init(getTopicDefinition());
			connection.start(DestinationMode.PUBLISHER);
			TextMessage msg = connection.createTextMessage();
			msg.setText(pMessage);
			log.debug("sendJMS, message: {},header: {}.", pMessage, pJmsHeaders);
            if (pJmsHeaders != null) {
                Iterator<Entry<String, String>> it = pJmsHeaders.entrySet().iterator();
                while (it.hasNext()) {
                    Entry<String, String> entry = it.next();
                    msg.setStringProperty(entry.getKey(), entry.getValue());
                }
            }
			connection.publish(msg);
			connection.commit();
		} catch (JMSException | ServerConnectionException e) {
			log.error("JMSConnection published get exception for message {} !", e, pMessage);
			throw new MDWRestException("Send JMS failed");
		} finally {
			try {
				connection.stop();
			} catch (ServerConnectionException e) {
				log.error("JMSConnection stoped failed for message {} !", e, pMessage);
				throw new MDWRestException("Send JMS failed");
			}
		}
	}



	public static int verfSendJMS(Map<String, String> pJmsHeaders, String pMessage) {
		int flag = 0;
		try {
			sendJMS(pJmsHeaders, pMessage);
		} catch (Exception e) {
			flag = 1;
		}
		return flag;
	}

}

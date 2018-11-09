package corp.corp.appointment.appointmentserviceV10.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;


public class PropertiesConfigBean {

    private String jmsPath;

	public String getJmsPath() {
		return jmsPath;
	}

	public void setJmsPath(String jmsPath) {
		this.jmsPath = jmsPath;
	}
	
	
}

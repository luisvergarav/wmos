package rtl.corp.corp.sche.whmg.appointment.appointmentV10.config;

import org.springframework.beans.factory.annotation.Value;
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

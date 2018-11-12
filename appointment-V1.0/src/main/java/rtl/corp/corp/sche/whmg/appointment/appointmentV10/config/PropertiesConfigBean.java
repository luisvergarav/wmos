package rtl.corp.corp.sche.whmg.appointment.appointmentV10.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
  

@RefreshScope
@Configuration
public class PropertiesConfigBean {

	@Value("${jms_path}")
    private String jmsPath;

	public String getJmsPath() {
		return jmsPath;
	}

	public void setJmsPath(String jmsPath) {
		this.jmsPath = jmsPath;
	}
	
	
}

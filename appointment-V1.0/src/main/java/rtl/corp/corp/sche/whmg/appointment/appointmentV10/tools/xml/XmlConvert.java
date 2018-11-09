package rtl.corp.corp.sche.whmg.appointment.appointmentV10.tools.xml;


import javax.xml.bind.JAXBException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XmlConvert<T> implements Convert<T> {

	@Override
	public String convert(T class1) throws JAXBException, JsonProcessingException {
		 
	    XmlMapper xmlMapper = new XmlMapper();
	    xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
	    String xml = xmlMapper.writeValueAsString(class1);
	    
	    return xml;
	}

}

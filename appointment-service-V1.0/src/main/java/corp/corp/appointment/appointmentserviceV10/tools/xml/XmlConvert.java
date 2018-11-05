package corp.corp.appointment.appointmentserviceV10.tools.xml;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import corp.corp.appointment.appointmentserviceV10.domain.model.AppointmentReq;

public class XmlConvert<T>  implements Convert<T> {
	
	

	@Override
	public  String convert(T class1) throws JAXBException {
		StringWriter writer = new StringWriter();
	    JAXBContext context = JAXBContext.newInstance(class1.getClass());
	    Marshaller m = context.createMarshaller();
	    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	
	    m.marshal(class1, writer);
	    return writer.toString();
	}
	
}


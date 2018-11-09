package rtl.corp.corp.sche.whmg.appointment.appointmentV10.tools;


import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;

import rtl.corp.corp.sche.whmg.appointment.appointmentV10.client.wls.jms.tools.JMSMessageTools;
import rtl.corp.corp.sche.whmg.appointment.appointmentV10.excepcion.PropertiesException;
import rtl.corp.corp.sche.whmg.appointment.appointmentV10.tools.xml.XmlReader;
import rtl.corp.corp.sche.whmg.appointment.appointmentV10.tools.xml.XmlTransformation;
import rtl.corp.corp.sche.whmg.appointment.appointmentV10.tools.xml.XmlValidator;
import lombok.extern.slf4j.Slf4j;




/**
 * Clase que maneja la validacion y transformacion de los mensajes recibidos.
 */
@Slf4j
public class MessageService {

    private static MessageService instance = null;

    private MessageService() {
    }

    public static synchronized MessageService getInstance() throws PropertiesException {

        if (instance == null) {
            instance = new MessageService();
        }
        return instance;
    }

    public String validateMessage(String message,
                                  String tag) throws Exception {
        String tagBuscado = null;
        tagBuscado = this.readTagFromMessage(message, tag);

        try {
            if (tagBuscado == null)
                throw new Exception("Tag no encontrado - " + tag);
            if (tagBuscado.trim().isEmpty())
                throw new Exception("Tag esta Vacio - " + tag);

            return tagBuscado;
        } catch (Exception e) {
            log.error("[[ERROR]] --> " + e.getLocalizedMessage(), e);
            throw e;
        }


    }


    /**
     * Metodo que valida si el mensaje xml contra la definicion en el xsd
     * @param message Texto del mesaje original
     * @return True en caso de ser valido el mesnaje, False en caso contrario
     * @throws Exception
     */
    public boolean validateMessage(String message) throws Exception, TransformerConfigurationException,
                                                                       TransformerException,
                                                                       PropertiesException {

        boolean isValid = false;

        try {

            //Se valida el mensaje xml
            XmlValidator.getInstance().validateXML(message);
            isValid = true;

        } catch (TransformerConfigurationException e) {
            log.error("[[ERROR]] --> " + e.getLocalizedMessage(), e);
            throw e;
        } catch (TransformerException e) {
            log.error("[[ERROR]] --> " + e.getLocalizedMessage(), e);
            throw e;
        } catch (PropertiesException e) {
            log.error("[[ERROR]] --> " + e.getLocalizedMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("[[ERROR]] --> " + e.getLocalizedMessage(), e);
            throw e;
        }
        return isValid;
    }

    /**
     * Metodo que transforma el mensaje original al requerido por el destino
     * @param message Texto del mesaje original
     * @return String con el mensaje transformado
     * @throws Exception
     */
    public String transformMessage(String message) throws Exception {

        String targetMessage = null;

        try {

            //Se hace la transformacion
            targetMessage =
                    XmlTransformation.getInstance().xmlTransformation(message);

        } catch (Exception e) {
            log.error("[[ERROR]] --> " + e.getLocalizedMessage(), e);
            throw e;
        }
        return targetMessage;
    }
    
    

    /**
     * Metodo que lee el contenido de un tag del mensaje
     * @param message Mensaje xml de donde se quiere leer el tag
     * @param tag Nombre del tag que se quiere leer del xml
     * @return String con el contenido del tag que se leyo del xml
     * @throws Exception
     */
    public String readTagFromMessage(String message,
                                     String tag) throws Exception {

        String attribute = null;
        XmlReader xmlReader = null;

        try {

            //Se lee el atributo
            xmlReader = new XmlReader();
            attribute = xmlReader.readXml(message, tag);
            xmlReader = null;
        } catch (Exception e) {
            log.error("[[ERROR]] --> " + e.getLocalizedMessage(), e);
            throw e;
        }
        return attribute;
    }
}


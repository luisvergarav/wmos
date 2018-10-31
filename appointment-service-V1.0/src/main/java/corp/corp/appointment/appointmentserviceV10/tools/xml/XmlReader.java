package corp.corp.appointment.appointmentserviceV10.tools.xml;



import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import corp.corp.appointment.appointmentserviceV10.excepcion.PropertiesException;
import corp.corp.appointment.appointmentserviceV10.rest.RestAPPConfig;
import corp.corp.appointment.appointmentserviceV10.rest.RestConstants;
import lombok.extern.slf4j.Slf4j;

/**
 * Clase para leer XML
 *
 */
@Slf4j
public class XmlReader extends DefaultHandler {
    
    private String attibute;
    private String tag;
    private String tempVal;
    private String encoding;

    public XmlReader() throws PropertiesException {
        //Se carga en encoding
        this.encoding =
                RestAPPConfig.getInstance().getPropertyValue(RestConstants.ENCODE);
    }

    /**
     * Metodo que lee el tag de attibute del xml
     * @param xml Texto del mensaje original
     * @return
     */
    public String readXml(String xml, String tag) {

        //Se crea el factory para leer el xml
        attibute = null;
        SAXParser sp = null;
        InputSource is = null;
        SAXParserFactory spf = null;


        try {

            //Se asigna el tag que se quiere leer
            this.tag = tag;

            spf = SAXParserFactory.newInstance();
            spf.setNamespaceAware(true);

            //Se crea la instancia de SAXParser
            sp = spf.newSAXParser();

            //Se coloca el encode
            is = new InputSource(new StringReader(xml));
            is.setEncoding(this.encoding);

            //Se registra esta misma clase para el manejo de los eventos
            //de SAXParser
            sp.parse(is, this);

        } catch (SAXException se) {
            log.error("[[ERROR]] --> " + se.getLocalizedMessage(), se);
            
        } catch (ParserConfigurationException pce) {
            log.error("[[ERROR]] --> " + pce.getLocalizedMessage(), pce);
            
        } catch (IOException ie) {
            log.error("[[ERROR]] --> " + ie.getLocalizedMessage(), ie);
            
        }
        return this.attibute;
    }

    /**
     * Metodo que se invoca al inicio de cada tag del xml
     * @param uri
     * @param localName
     * @param qName
     * @param attributes
     * @throws SAXException
     */
    public void startElement(String uri, String localName, String qName,
                             Attributes attributes) throws SAXException {

    }

    /**
     * Metodo que se invoca entre el inicio de un tag y el cierre para obtener
     * el contenido
     * @param ch
     * @param start
     * @param length
     * @throws SAXException
     */
    public void characters(char[] ch, int start,
                           int length) throws SAXException {
        this.tempVal = new String(ch, start, length);
    }

    /**
     * Metodo que se invoca al finalzar un tag del xml
     * @param uri
     * @param localName
     * @param qName
     * @throws SAXException
     */
    public void endElement(String uri, String localName,
                           String qName) throws SAXException {

        if (localName.equalsIgnoreCase(this.tag)) {
            this.attibute = this.tempVal;
        }
    }
}

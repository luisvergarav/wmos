package corp.corp.appointment.appointmentserviceV10.rest;


import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.InputStream;

import java.util.Properties;
@Slf4j
public class RestAPPConfig {
    private static RestAPPConfig instance = null;
    
    private Properties properties = null;
    private RestAPPConfig(){
        InputStream inputStream = null;
        
        try{
            
            //inputStream = new FileInputStream(	RestConstants.RESOURCES_PATH+
            //									RestConstants.RESOURCE_PROPERTIES_DIR+
            //									RestConstants.RESOURCE_PROPERTIES_FILE);
            properties = new Properties();
            //properties.load(inputStream);
            properties.load(this.getClass().getClassLoader().getResourceAsStream(
                    									RestConstants.RESOURCE_PROPERTIES_FILE));
            
            log.info("Carga archivo de propiedades " + 	RestConstants.RESOURCES_PATH+
            											RestConstants.RESOURCE_PROPERTIES_DIR+
            											RestConstants.RESOURCE_PROPERTIES_FILE + " OK.");
            
        } catch(Exception e){
            e.printStackTrace();
            log.error("[[ERROR]] -->" + e.getMessage());
        }
    }
    
    public static RestAPPConfig getInstance(){
        if(instance == null){
            instance = new RestAPPConfig();
        }
        return instance;
    }
    
    public String getPropertyValue(String key) {
        if (properties != null) {
            if (properties.containsKey(key)) {
                return properties.getProperty(key, null);
            }
        }
        return null;
    }
}

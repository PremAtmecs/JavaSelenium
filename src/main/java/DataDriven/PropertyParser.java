package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyParser {
    public Properties properties;
    public PropertyParser(String propertyFilePath){
        properties = new Properties();
        loadProperties(propertyFilePath);
    }
    private void loadProperties(String propertyFilePath){
        File propertyFile = new File(propertyFilePath);
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(propertyFile);
            properties.load(fileInputStream);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getProperties(String key){
        return properties.getProperty(key);
    }
}

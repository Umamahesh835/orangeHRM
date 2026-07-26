package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;

public class ConfigReader {
	
	    private static Properties properties;

	    // Load properties file once when class is initialized
	    static {
	        try {
	            FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
	            properties = new Properties();
	            properties.load(fis);
	        } catch (IOException e) {
	            e.printStackTrace();
	            throw new RuntimeException("Failed to load config.properties file.");
	        }
	    }

	    // Method to fetch property value by key
	    public static String getProperty(String key) {
	        String value = properties.getProperty(key);
	        if (value == null) {
	            throw new RuntimeException("Property '" + key + "' not found in config.properties file.");
	        }
	        return value;
	    }
	    
	    public static String getBrowser() {
	        return getProperty("browser");
	    }

	    public static String getBaseUrl() {
	        return getProperty("baseUrl");
	    }
	}


package Naveen.testboss.propread;

import java.io.FileInputStream;
import java.util.Properties;


/**
 * Class is used to read the application.properties file
 *
 * @author Naveen.B.Rao
 *
 *
*/

public class propertyreader {
	 public static String myCurrentDir = System.getProperty("user.dir");
	Properties props = null;
	String path = myCurrentDir + "define.properties";
		
/**
* Class constructor
*/
	
	public propertyreader() {

		try {
		  FileInputStream fis = new FileInputStream(path);
		  props = new Properties();
		  props.load(fis);
		  fis.close();
		} catch (Exception ex) {
		  ex.printStackTrace();
		}
	  }
	
/**
* Method is used to get value of the key from application.properties file
* @param key - key name
* @return value
*/
	
	public String getValue(String key) {

		String value = props.getProperty(key);
		if (value != null) {
		  return value;
		} else {
		  return null;
		}
	  }
}

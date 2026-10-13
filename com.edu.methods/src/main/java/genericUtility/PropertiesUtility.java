package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;



public class  PropertiesUtility
{
	/**
	 * This is a utility method to write data to Properties file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getDataFromProperties(String key) throws IOException
	{
		FileInputStream fis= new FileInputStream(IPathUtility.propertiesPath);
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
	/**
	 * This is utility method to write data to properties file
	 * @param key
	 * @param value
	 * @param comments
	 * @throws IOException
	 */
	
	public void writeDataToProperties(String key, String value, String comments) throws IOException
	{
		FileInputStream fis= new FileInputStream(IPathUtility.propertiesPath);
		Properties p=new Properties();
		p.load(fis);
		p.setProperty(key, value);
		FileOutputStream fos=new FileOutputStream(IPathUtility.propertiesPath);
		p.store(fos,comments);
	}
	
	
}
